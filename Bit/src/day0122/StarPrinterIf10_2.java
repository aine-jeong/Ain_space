package day0122;

import java.util.Scanner;

public class StarPrinterIf10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********별찍기 10번***********");
        System.out.print("출력할 줄 수를 입력하세요: ");
        int num = scanner.nextInt();
        
        for(int i = 1; i <= 2*num -1; i++) {
            String stars = new String();
            
            int totalWidth = num*2-1;
            
            if(i == 1 || i == 2*num -1) {
                //첫번째줄 혹은 제일 마지막줄인 경우 별을 2*num-1개 만큼 넣어준다.
                for(int j = 1; j <= totalWidth; j++) {
                    stars += "*";
                }
            }else if( i <= num-1 ) { // i: 2,3,4 (num이 5일때)
                                    // 첫번째 줄을 제외한 윗 부분
                int upperI = i - 1;
                int starWidth = num - upperI;
                // starWidth: 해당 줄의 왼쪽 혹은 오른쪽 별의 갯수
                
                // 왼쪽 별 부분
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                // 공백부분
                // = 총 너비 - 별의 갯수
                int spaceWidth = totalWidth-2*starWidth;
                for(int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                // 오른쪽 별 부분
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
            }else { // 마지막 줄을 제외한 아래부분
                int lowerI = i - num + 1; // lowerI를 1~ 로 바꿔주기
                // 해당 줄의 별의 개수
                int starWidth = lowerI;
                // 왼쪽 별 부분
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                //공백 부분
                int spaceWidth = totalWidth-2*starWidth;
                for(int j =1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                // 오른쪽 별 부분
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                
            }
            
            System.out.println(stars);
            
        }
        
        
        
        
        
        scanner.close();
    }

}
