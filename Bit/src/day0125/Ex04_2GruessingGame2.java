package day0125;
/*
 * 컴퓨터가 만들어낸 1~100 사이의 랜덤한 숫자를
 * 사용자가 몇번만에 맞추는지 기록하는 숫자맞추기 게임
 * 
 * 조건. 무한루프를 사용해서 사용자가 입력한 숫자에 따라 1은 게임 시작, 2는 최고점수 보기, 3은 게임 종료가 될 수 있도록 프로그램 작성
 * 		단, 최고점수는 가장 적은 횟수로 컴퓨터의 숫자를 맞췄을 때가 최고점수가 됩니다.
 * 조건2. 사용자가 입력한 숫자가 컴퓨터의 숫자보다 크면 Down, 크면 Up이라고 출력되어야 합니다.
 * 
 * 힌트1. 최고점수는 어떻게 기록해야 할까?
 * 		  최고점수는 맨 처음 플레이하면 어떤게 최고점수가 될까
 * 힌트2. random.nestInt(최대값)을 입력하면 0부터 최대값-1 까지의 값이 랜덤하게 나온다.
 * 		 그렇다면 어떻게 해야 1~최대값의 범위가 나오도록 만들어줄 수 있을까?
 * 
 * @@@@@@@ 선생님 코드 @@@@@@@@
 */
import java.util.Scanner;
import java.util.Random;
public class Ex04_2GruessingGame2 {
	static final int MAX = 100;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int bestScore = 0;
		
		
		while(true) {
			System.out.println("===========================");
			System.out.print("1.게임시작 // 2.최고점수 보기 // 3.게임종료 : ");
			
			int userChoice = scanner.nextInt();
			if(userChoice == 1) {
				
				int currentScore = 1;
				
				System.out.println("===게임을 시작합니다===");
				
				int computerNumber = random.nextInt(MAX) + 1;
				
				System.out.print("1~100 사이의 숫자를 입력해주세요> ");
				int userNumber = scanner.nextInt();
				
				while(userNumber != computerNumber) {
						if(userNumber > computerNumber) {
							System.out.println("DOWN");
						} else {
							System.out.println("UP");
						}
						
					
					System.out.println("숫자를 입력하세요: ");
					userNumber = scanner.nextInt();
					currentScore++ ;
				}
				System.out.println("정답입니다.");
				System.out.println("이번 플레이의 점수는" + currentScore + "입니다.");
				
				
				// 최고기록을 확인하여 필요하다면 현재점수로 최고기록을 바꿔준다.
				// 최고 기록을 현재기록으로 바꿔주는건 2가지 경우이다.
				// 1. 처음 플레이했을때
				// 2. 최고기록이 현재기록보다 클때
				if(bestScore == 0 || bestScore > currentScore) {
					bestScore = currentScore;
					System.out.println("신기록입니다.");
				}
				
			}else if(userChoice == 2) {
				// 최고기록 보기 코드 구현
				
				if(bestScore == 0) {
					//아직 플레이 기록이 없으므로 경고메세지만 출력
					System.out.println();
				}else {
					System.out.println("현재 최고 기록: "+bestScore);
				}
				
				
			}else if (userChoice ==3) {
				System.out.println("플레이해주셔서 감사합니다.");
				break;
			}
		}
		
		scanner.close();
	}
}