package day0121;

import java.util.Scanner;

public class StarPrinter05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("***********별찍기 5번***********");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();
		
		// i: 몇줄이 출력되는지
		for(int i = 1; i <= userNumber; i++) {
			String stars = new String();
			
			// 앞쪽의 공백을 담당하는 j
			for(int j = 1; j <= userNumber-i; j++) {
				stars += " ";
			}
			
			// *을 담당하는 j
			for(int j = 1 ; j <= (i*2-1); j++) {
				stars += "*";
			}
			System.out.println(stars);
		}

		scanner.close();
	}
}
