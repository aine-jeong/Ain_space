package Programmers;

import java.util.Stack;

public class Kakao_crane {
    public static void main(String[] args) {

        int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
                { 3, 5, 1, 3, 1 } };
        int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
        int answer = 0;

        Stack<Integer> basket = new Stack<Integer>();

//        //2차원배열 순회
//        for(int i = 0; i < board.length; i++) {
//            for(int j = 0; j < board[i].length; j++) {
//                
//            }
//        }
        
        

//        for (int i = 0; i < board.length; i++) { // 배열의 행을 돌면서
//            for (int j = 0; j < moves.length; j++) { // moves의 값을 하나씩 가져와서
//                int dollNum = moves[j] - 1; // 인형이 있는 위치
//                if (!(board[i][dollNum] == 0)) { // 열을 검사해서 0이 아니면
//                    int doll = board[i][dollNum]; // 인형의 번호를 가져온다.
//                    board[i][dollNum] = 0; // 해당 인형은 사라지고,
//                    if (basket.empty()) { // 만약 바구니가 비어있다면
//                        basket.push(doll); // 인형 넣기
//                    } else { // 바구니가 비어있지 않다면
//                        if (!(basket.peek() == doll)) { 
//                            // 바구니에 가장 마지막에 들어간 인형의 번호가 지금 넣는 인형의 번호와 같지 않다면
//                            basket.push(doll); // 인형 넣기
//                        } else { // 바구니에 가장 마지막에 들어간 인형이 지금 넣는 인형과 같다면
//                            basket.pop(); // 인형을 빼내고
//                            answer = answer + 2; // 인형이 사라진 개수에 2 추가
//                        }
//                    }
//                } else { // 열 값이 모두 0이면
//                }
//            }
//        }
        
        for(int i = 0; i < moves.length; i++) { // moves의 값을 하나씩 가져와서
            for(int j = 0; j < board.length; j++) { // 배열의 행 순서대로 탐색
                int dollNum = moves[i]-1; // 인형의 열값
                
                if(!(board[j][dollNum] == 0)) { //해당 열 값이 0이 아닐 때
                    int doll = board[j][dollNum]; // 인형의 번호를 가져온다
                    board[j][dollNum] = 0; // 해당 인형은 사라지고
                    if (basket.empty()) { // 만약 바구니가 비어있다면
                        basket.push(doll); // 인형 넣기
                    } else { //바구니가 비어있지 않다면
                        if(!(basket.peek() == doll)) { //마지막 인형과 지금 넣는 인형이 같지 않다면
                            basket.push(doll); //인형 넣기
                        } else { // 마지막 인형과 지금 넣는 인형이 같다면
                            basket.pop(); // 마지막 인형이 사라지고
                            answer = answer + 2; // 인형이 사라진 개수에 2 추가
                        }
                    }
                } 
                
            } // j for end
        } // i for end

        System.out.println("제거된 인형수: " + answer);
    }
}
