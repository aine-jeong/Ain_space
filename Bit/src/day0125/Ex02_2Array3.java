package day0125;

import java.util.Scanner;

//   3. 크기가  6인배열을 만들어서 사용자로부터 1~45의 값을 입력하도록 하시오
//      단, 사용자가 범위를 벗어난 값을 입력하면 올바른 범위의 값이 들어올때까지 다시 입력을 받으세요.

// 4. 사용자로부터 3개의 이름을 입력받아 String 배열에 저장하세요

public class Ex02_2Array3 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("======3번문제======");
	int[] intArray = new int[6];
	
	for(int i = 0; i < intArray.length; i++) {
		System.out.print((i+1)+"번째 숫자를 입력하세요 (범위: 1~45) > ");
		int userNumber = scanner.nextInt();
		while(userNumber < 1 || userNumber > 45) {
			System.out.println("숫자 범위를 초과하셨습니다.");
			System.out.print("숫자를 다시 입력해주세요. (범위:1~45) >");
			userNumber = scanner.nextInt();
		}
		
		intArray[i] = userNumber;
	}
	
	
	for(int i = 0; i <6; i++) {
		System.out.printf("intArray[%d]: %d\n", i, intArray[i]);
	}
	
	
	//4. 사용자로부터 3개의 이름을 입력받아 String 배열에 저장하세요
	
	System.out.println("======4번문제======");
	
	String[] stringArray = new String[3];
	scanner.nextLine();

	
	for(int i = 0 ; i < stringArray.length; i++) {
		System.out.print(i+"번째 이름을 입력해주세요.> ");
		stringArray[i] = scanner.nextLine();
	}
	
	for(int i = 0; i < stringArray.length; i++) {
		System.out.println(i+"번째에 등록된 이름: " + stringArray[i]);
	}
	
	
	scanner.close();
	
	}
}

