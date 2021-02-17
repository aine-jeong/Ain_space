package day0125;
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
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		while(true) {
			
			
			System.out.print("1.플레이 2.현재 전적 보기 3.종료 > ");
			int userChoice = scanner.nextInt();
			
			if(userChoice == 1) {
				// 플레이
				int randomNumber = random.nextInt(3) + 1;
				
				System.out.println("가위바위보 중 하나를 선택해주세요(가위: 1, 바위: 2, 보: 3)");
				System.out.print("> ");
				int userNumber = scanner.nextInt();
				
				while(userNumber < 1 || userNumber > 3) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("가위: 1, 바위: 2, 보: 3");
					System.out.print("> ");
					userNumber = scanner.nextInt();
				}
				
				if(randomNumber == 1) { // 컴퓨터가 가위일 떄
					if(userNumber == 1) { // 사용자가 가위일 때
						System.out.println("무승부입니다.");
						draw++ ;
						
						System.out.printf("현재 전적: %d승 %d무 %d패\n",win ,draw, lose);
					}else if(userNumber == 2) { // 사용자가 바위일 떄
						System.out.println("사용자 승!!");
						win++ ;
						
						System.out.printf("현재 전적: %d승 %d무 %d패\n",win ,draw, lose);
					}else if(userNumber == 3) { // 사용자가 보일 때
						System.out.println("사용자 패배");
						lose++ ;
						
						System.out.printf("현재 전적: %d승 %d무 %d패\n",win ,draw, lose);
					}
				}else if(randomNumber == 2) { // 컴퓨터가 바위일 때
					if(userNumber == 1) { // 사용자가 가위일 때
						System.out.println("사용자 패배");
						lose++ ;
						
						System.out.printf("현재 전적: %d승 %d무 %d패\n",win ,draw, lose);
					}else if(userNumber == 2) { // 사용자가 바위일 떄
						System.out.println("무승부입니다.");
						draw++ ;
						
						System.out.printf("현재 전적: %d승 %d무 %d패\n",win ,draw, lose);
					}else if(userNumber == 3) { // 사용자가 보일 때
						System.out.println("사용자 승!!");
						win++ ;
						
						System.out.printf("현재 전적: %d승 %d무 %d패\n",win ,draw, lose);
						
					}
				}else if(randomNumber == 3) { // 컴퓨터가 보일 때
					if(userNumber == 1) { // 사용자가 가위일 때
						System.out.println("사용자 승!!");
						win++ ;
						
						System.out.printf("현재 전적: %d승 %d무 %d패\n",win ,draw, lose);
					}else if(userNumber == 2) { // 사용자가 바위일 떄
						System.out.println("사용자 패배");
						lose++ ;
						
						System.out.printf("현재 전적: %d승 %d무 %d패\n",win ,draw, lose);
					}else if(userNumber == 3) { // 사용자가 보일 때
						System.out.println("무승부입니다.");
						draw++ ;
						
						System.out.printf("현재 전적: %d승 %d무 %d패\n",win ,draw, lose);
					}
				}
				
			}else if(userChoice == 2) { // 전적 보기
				double record = (double)win / (win+draw+lose) *100.0;
				
				System.out.printf("현재 전적은 %d승 %d무 %d패 입니다.\n",win ,draw, lose);
				System.out.printf("승률은 %.4f퍼센트 입니다.\n", record);
			
			}else if(userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}
		
		
		
		
		
		
		
		scanner.close();
	}

}
