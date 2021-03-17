package Programmers;
class Solution {
    public static void main(String[] args) {

        int n = 5;
        int[] lost = new int[] { 1, 2, 3 };
        int[] reserve = new int[] { 2, 3, 4 };
        int answer = 0;

//            int[] student = new int[n];
//            
//            //학생수가 5라면 student 배열에 {1,2,3,4,5} 넣기 
//            for(int i = 0; i < n; i++) {
//                student[i] = i+1;
//            }
//            
//            // 만약 2,4번 학생이 잃어버리고
//            // 1,3,5번 학생이 빌려줄 수 있는 상황이라면
//            for(int i = 0; i < n; i++) {
//                
//            }
        

        answer = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -10;
                    reserve[j] = -10;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] + 1) {
                    answer++;
                    reserve[j] = -10;
                    break;
                } else if (lost[i] == reserve[j] - 1) {
                    answer++;
                    reserve[j] = -10;
                    break;
                }
            }
        }

//            for(int i = 0; i < reserve.length ; i++) {
//                for(int j = 0; j < lost.length ; j++) {
//                    if (reserve[i] == lost[j]) {
//                        reserve[i] = -10;
//                        break;
//                    } else if((reserve[i]+1) == lost[j]) {
//                        answer++;
//                        lost[j] = -10;
//                        break;
//                    } else if ((reserve[i]-1) == lost[j]){
//                        answer++;
//                        reserve[i] = -10;
//                        break;
//                    }
//                }
//            }

        System.out.println(answer);

    }
}