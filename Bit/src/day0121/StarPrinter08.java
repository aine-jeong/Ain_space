package day0121;

import java.util.Scanner;
public class StarPrinter08 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***********별찍기 8번***********");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();
		
		// 위쪽 5줄 출력
		for(int i = 1; i <= userNumber; i++) {
			String stars = new String();
			// 공백 입력
			for ( int j = 1; j <= userNumber-i; j++) {
				stars += " ";
			}
			// * 입력
			for ( int j = 1; j <= i; j++)
			{
				stars += "*";
			}
				System.out.println(stars);	
		}
	
		// 아래쪽 5줄 출력
		for (int i = 1; i < userNumber; i++) {
			String stars = new String();
			
			// 공백 입력
			for (int j = 1; j <= i; j++) {
				stars += " ";
			}
			// *입력
			for (int j = 1; j <= userNumber-i; j++) {
				stars += "*";
			}
			
			System.out.println(stars);
			
		}
	
	
	
	
	
	
	scanner.close();
	
	}

}
