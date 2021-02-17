package day0119;
/*
 * 1. 사용자로부터 키와 몸무게를 입력받아서 BMI 수치를 어느정도 형식에 맞추어 출력하시오.
 * BMI 계산 방법은 몸무게 / 키 * 키 입니다.
 * 2. 사용자로부터 숫자 2개를 입력받아서 산술 연산한 결과값을 출력하는 프로그램을 작성하세요.
 * 3. 사용자로부터 생년, 생월, 생일을 따로 따로 입력 받아서 형식에 맞추어 출력해보도록 합니다.
 * 심화과정: 사용자가 생년, 생월, 생일을 따로따로 입력하면 주민등록번호의 앞자리처럼 처리를 해봅시다.
 * 
 */
import java.util.Scanner;

public class Ex14Homework01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키를 입력하세요.");
		double height = scanner.nextDouble() * 0.01;
		
		System.out.println("몸무게를 입력하세요.");
		double weight = scanner.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.println("BMI: "+BMI);
		
		
		scanner.close();
		
	}
	

}
