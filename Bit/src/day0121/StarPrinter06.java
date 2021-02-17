package day0121;

import java.util.Scanner;

public class StarPrinter06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("***********별찍기 6번***********");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();
		
		// i: 몇줄이 출력되는지
		for(int i = 1; i <= userNumber; i++) {
			
		// ###강의버전###
		// 애초에 for문을 userNumber 로 시작해서 하나씩 줄어들고 1 이 되도록 설정해줘도 된다.
//	//	for(int i = userNumber; i<= 1; i--) {
	//		for(int j = 1; j <= userNumber-i; j++) {
	//			stars += " ";
	//		}
	//		
	//		// *을 담당하는 j
	//		for(int j = 1 ; j <= (i*2-1); j++) {
	//			stars += "*";
	//		}
//	//	}
			
			String stars = new String();
			
			// 앞쪽의 공백을 담당하는 j
			for(int j = 1; j <= i-1; j++) {
				stars += " ";
			}
			
			// *을 담당하는 j
			for(int j = 1 ; j <= (userNumber-(i-1))*2-1; j++) {
				stars += "*";
			}
			
			
			System.out.println(stars);
			
		}
		
		
		
		
		scanner.close();
	}
}
