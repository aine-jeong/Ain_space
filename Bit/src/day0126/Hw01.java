package day0126;
//0125 숙제
//가위바위보 게임을 만드세요
//가위: int 1
//바위: int 2
//보: int 3

//예시: 
//1.플레이 2.현재 전적 보기 3.종료
//>> 1

//가위바위보 중 하나를 선택해주세요(가위: 1, 바위: 2, 보: 3)
//>> 5
//잘못입력하셨습니다
//가위바위보 중 하나를 선택해주세요(가위: 1, 바위: 2, 보: 3)
//>> 2
//사용자: 바위
//컴퓨터 : 가위
//사용자 승!!
//현재 전적: 1승 3무 2패
//
//1.플레이 2.현재 전적 보기 3.종료
//>> 2
//현재 전적은 1승 3무 2패 입니다. 승률은 16.6667퍼센트 입니다.

//1.플레이 2.현재 전적 보기 3.종료
//>> 3
//사용해주셔서 감사합니다.

import java.util.Scanner;
import java.util.Random;
public class Hw01 {
    static final int INT_SCISSOR = 1;
    static final int INT_ROCK = 2;
    static final int INT_PAPER = 3;
    
    static final int INT_WIN = 1;
    static final int INT_DRAW = 2;
    static final int INT_LOSE = 3;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int userWin = 0;
        int userDraw = 0;
        int userLose = 0;
        
        while(true) {
            
            
            System.out.print("1.플레이 2.현재 전적 보기 3.종료 > ");
            int userChoice = scanner.nextInt();
            
            if(userChoice == 1) {
                // 플레이
                
                System.out.println("가위바위보 중 하나를 선택해주세요(가위: 1, 바위: 2, 보: 3)");
                System.out.print("> ");
                int userSelect = scanner.nextInt();
                
                while(userSelect < INT_SCISSOR || userSelect > INT_PAPER) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("가위: 1, 바위: 2, 보: 3");
                    System.out.print("> ");
                    userSelect = scanner.nextInt();
                }
                
                int computerSelect = random.nextInt(INT_PAPER) + 1;
                
                int result = 0;
                if(userSelect == computerSelect) {
                    result = INT_DRAW;
                }else {
//                    if(userSelect == INT_SCISSOR) {
//                        if(computerSelect == INT_ROCK) {
//                            result = INT_LOSE;
//                        }else {
//                            result = INT_WIN;
//                        }
//                    }else if(userSelect == INT_ROCK) {
//                        if(computerSelect == INT_PAPER) {
//                            result = INT_LOSE;
//                        }else {
//                            result = INT_WIN;
//                        }
//                    }else if(userSelect == INT_PAPER) {
//                        if(computerSelect == INT_SCISSOR) {
//                            result = INT_LOSE;
//                        }else {
//                            result = INT_WIN;
//                        }
//                    }
                    // 반복되는 조건이므로 하나로 합쳐주기
                    
                    if((userSelect == INT_ROCK && computerSelect == INT_PAPER) ||
                            (userSelect == INT_SCISSOR && computerSelect == INT_ROCK) ||
                             (userSelect == INT_PAPER && computerSelect == INT_SCISSOR)) {
                        result = INT_LOSE;
                    }else {
                        result = INT_WIN;
                    }
                
                
                
                
                }
                
                String userSelectWord = new String();
                String computerSelectWord = new String();
                
                if(userSelect == INT_ROCK) {
                    userSelectWord = "바위";
                }else if(userSelect == INT_PAPER) {
                    userSelectWord = "보";
                }else {
                    userSelectWord = "가위";
                }
                
                if(computerSelect == INT_ROCK) {
                    computerSelectWord = "바위";
                }else if(computerSelect == INT_PAPER) {
                    computerSelectWord = "보";
                }else {
                    computerSelectWord = "가위";
                }
                
                System.out.println("사용자: "+userSelectWord);
                System.out.println("컴퓨터: "+computerSelectWord);
                
                if(result == INT_WIN) {
                    System.out.println("사용자 승!!!");
                    userWin++;
                }else if(result == INT_DRAW) {
                    System.out.println("무승부!!!");
                    userDraw++;
                }else if(result == INT_LOSE) {
                    System.out.println("사용자 패!!!");
                    userLose++;
                }
                
                
            }else if(userChoice == 2) { // 전적 보기
                int sum = userWin + userDraw + userLose;
                if(sum == 0) {
                    System.out.println("아직 플레이 기록이 없습니다.");
                }else {
                    double winRate = (double)userWin / sum *100.0;
                    
                    System.out.printf("현재 전적은 %d승 %d무 %d패 입니다.\n",userWin ,userDraw, userLose);
                    System.out.printf("승률은 %.4f퍼센트 입니다.\n", winRate);
                }
                
            
            }else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
        
        
        
        
        
        
        
        scanner.close();
    }

}
