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
 */
import java.util.Scanner;
import java.util.Random;
public class Ex04GruessingGame {
	static final int MAX = 100;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int score = 0;
		int bestScore = 100;
		
		while(true) {
			System.out.println("===========================");
			System.out.print("1.게임시작 // 2.최고점수 보기 // 3.게임종료 : ");
			
			int userNumber = scanner.nextInt();
			if(userNumber == 1) {
				System.out.println("===게임을 시작합니다===");
				// #####
				int randomNumber = random.nextInt(MAX) + 1;
				score = 0;
				// #####
				System.out.print("1~100 사이의 숫자를 입력해주세요> ");
				int num = scanner.nextInt();
				if(bestScore == 0) {
					while(true) {
						if(randomNumber == num) {
							System.out.println("정답입니다.");
							System.out.println("점수: "+bestScore);
							break;
						}else {
							System.out.println("오답입니다.");
							// #####
							if(num > randomNumber) {
								System.out.print("Down(더 낮은 숫자를 입력하세요): ");
								num = scanner.nextInt();
								bestScore++;
							}else if(num < randomNumber) {
								System.out.print("Up(더 높은 숫자를 입력하세요): ");
								num = scanner.nextInt();
								bestScore++;
							}
							
						}
					}
				} else {
					while(true) {
						if(randomNumber == num) {
							System.out.println("정답입니다.");
							System.out.println("점수: "+score);
							break;
						}else {
							System.out.println("오답입니다.");
							// #####
							if(num > randomNumber) {
								System.out.print("Down(더 낮은 숫자를 입력하세요): ");
								num = scanner.nextInt();
								score++;
							}else if(num < randomNumber) {
								System.out.print("Up(더 높은 숫자를 입력하세요): ");
								num = scanner.nextInt();
								score++;
							}
							
						}
					}
				}
				if(score<=bestScore) {
					bestScore = score;
				}
				
				
			}else if(userNumber == 2) {
				System.out.println("===최고점수 보기===");
				System.out.println("최고점수: "+ bestScore);
				
			}else if(userNumber ==3 ){
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			
			
		}
		
		
		
		
		
		scanner.close();
		
		
	}

}
