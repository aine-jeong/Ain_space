package day2;

import java.io.IOException;

public class Variables {

	/**
	 * 자료형, 변수
	 * 1. 변수 선언
	 * + 자료형 변수명;
	 * + 위치에 따라 사용 범위가 다르다 {}
	 * 2. 값을 저장 = 대입연산
	 * + 변수명 = 값(식);
	 * 3. 저장된 값을 처리
	 * 
	 * @throws IOException 
	 * 
	 */
	
	//'함수 호출'을 중심에 놓고 생각하기 
	// '수'와 '숫자'는 다르다는 것 인지하기 
	// (ex. 키보드에서 5 입력 -> 53 출력됨 -> 5는 (ASCII기준)53번째 숫자)
	// 사람과 컴퓨터의 관점은 다름~!~!~!
	
	
	public static void main(String[] args) {
		
	}
	
	public static void main03(String[] args) throws IOException {
		// 키보드 입력 - 모든 입력 처리에서는 Exception 발생. 처리
		int key = System.in.read();
		// 키보드에서 누른 키의 값(정수) -> 문자로 변환
		System.out.println(key);
		System.out.println((char)key);
		
	}
	
	public static void main02(String[] args) {
		// 문자 데이터를 많이 다루기 때문에 잘 정리해야 해요
		// 문자 값인 경우 문자코드에 따라서 처리함
		byte bit8 = 'A'; // ASCII 기준의 영문자 값을 다룰 때
		char bit16 = 'A'; // Unicode - UTF-8
		// 자료형이 바뀜 -> 값 자체는 동일, 다루는 방법이 달라지는 것 
		// 영문은 둘다 사용 가능하나(ASCII) 나머지 언어는 byte로 사용 불가
		// byte는 출력시 정수값으로 표현된다
	
		// 문자 출력
		System.out.println(bit8);
		System.out.println((char)bit8); //형변환(casting)
		System.out.println(bit16);
		
	}
	
	public static void main01(String[] args) {
		// 정수 100을 저장하기
		int num;
		num = 100;
		// 화면에 출력하기: 함수를 호출한다
		System.out.print(num); // 변수의 값
	}
	
//	public static void main(String[] args) {
//   기본형(Primitive)
//	 // 자료형: 대부분의 언어들이 비슷함
//	 boolean // 논리형: true, false <- 조건식
//	 
//	// 문자
//	 char  2byte
//	 
//	 // 정수: 부호 선택 불가
//	 int   4byte <- 10진 정수, 최대 9자리 범위
//		 
//	 byte  1byte
//	 short 2byte
//	 long  8byte
//	 
//	 // 실수: 부동소수점
//	 double 8byte
//	 float  4byte
//	 
//	 // 값을 구분하는 명령
//		
//	
//	}

}
