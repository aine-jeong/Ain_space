package day0121;

import java.util.Scanner;
public class StarPrinter10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***********별찍기 10번***********");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();
		
		// 위 5줄
		for (int i = 0; i < userNumber; i++ ) {
			String stars = new String();
			
			// 앞쪽 *
			for (int j = 1; j <= userNumber-i; j++) {
				stars += "*";
			}
			
			// 사이 공백
			for (int j = 1; j <= i*2; j++) {
				stars += " ";
			}

			// 뒤쪽 *
			for (int j = 1; j <= userNumber-i; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		
		// 아래 5줄
		for (int i = userNumber-2; i>=0; i--) {
			String stars = new String();
			
			//앞쪽 *
			for (int j = 1; j<=userNumber-i; j++) {
				stars += "*";
			}
			
			//사이 공백
			for (int j = 1; j <= i*2; j++) {
				stars += " ";
			}
		
			//뒤쪽*
			for (int j = 1; j<=userNumber-i; j++) {
				stars += "*";
			}
			
			System.out.println(stars);
		}
		
		
		
		
	
		scanner.close();
	}
}
