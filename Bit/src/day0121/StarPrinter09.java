package day0121;

import java.util.Scanner;
public class StarPrinter09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("***********별찍기 9번***********");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();
		
		// 위의 5줄 출력
		for (int i = 1; i <= userNumber; i++) {
			String stars = new String();
			
			// 공백 출력
			for(int j=1; j <= userNumber-i; j++) {
				stars += " ";
			}
			
			// * 출력
			for(int j=1; j<= i*2-1; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		//아래 4줄 출력
		for (int i = userNumber-1 ; i>= 1; i--) {
			String stars = new String();
			
			//공백 출력
			for(int j = 1; j <= userNumber-i; j++) {
				stars += " ";
			}
			//* 출력
			for(int j = 1; j <= i*2-1; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		
		
		
		scanner.close();
	}

}
