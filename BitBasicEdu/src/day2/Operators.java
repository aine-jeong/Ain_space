package day2;

import java.io.InputStream;
import java.util.Scanner;

public class Operators {

	/**
	 * 
	 * 연산자
	 * - 명령 기호들... 연산의 결과형
	 * 
	 * @param args
	 */
	
	
	public static void main(String[] args) {
//		int a = '1';
//		int b = '2';
//		int c = '3';
//		a = a - '0';//49-48
//		b = b - '0';//50-48
//		c = c - '0';//51-48
//		int num = (a*100) + (b*10) + (c);
//		System.out.println(num);
		
		// 키보드에서 정수 입력을 받을 때 사용하는 함수는 ?? - nextInt
		// 자료형의 첫글자가 대문자인 경우: 클래스형 (소문자는 기본형 (ex)int)
		// 클래스형인 경우 아래와 같은 형식으로 '생성' (기본형인 경우 변수를'선언'(자료형 변수명) 후 대입- 클래스형은 '생성'(new사용))
		// 자료형 변수명 = new 자료형();
		InputStream where = System.in;
		// 변환하는 함수들을 가지고 있다.
		// Scanner는 변환!! 입력 아님
		// 입력과 변환을 연결해서 사용한다는 개념 인지하기.
		Scanner scanner = new Scanner(where);
		int number = scanner.nextInt();
		System.out.println(number);
			
	}
	
	
	public static void main02(String[] args) {
		// 총합 구하기
		int a = 10;
		int b = 20;
		int c = 30;
		int sum = a + b + c; // 총합을 먼저 계산하고 값을 저장
		
		
		// 누적합
		int total = 0;
		total = total + a;
		total = total + b;
		total = total + c;
		
		
		int total2 = 0;
		total2 += a; //복합대입연산: 주로 산술연산에 이용
		total2 += b;
		total2 += c;

		total = total + 1;
		total += 1;
		total++; //증감연산자는 반드시 변수에 붙인다
		
		// 단항 연산자는 다항연산보다 먼저 실행된다.
		int aa = 1;
		int bb = ++aa; // 전치: 왼쪽에서 오른쪽으로 실행(증가 후 처리)
		int cc = aa++; // 후치: 현재 a값을 먼저 넣고 그다음에 a에 증감 실행된다
		
		System.out.println(aa);
		System.out.println(bb);	
		System.out.println(cc);
	}
	
	
	public static void main01(String[] args) {
		// 산술연산자: 값
		// + - * / % ++ -- 
		// 관계(비교)연산자: 논리(boolean)
		// < > <= >= == !=(다르면) 
		// 논리연산자: 논리 - 조건이 여러 개
		// &&(and 모두 참이어야 한다.(교집합)) 
		// ||(or 참이 있기만 하면 된다.(합집합)) 
		// !(not 논리를 뒤집음(논리 반전))
		
		
	}
	
	
}
