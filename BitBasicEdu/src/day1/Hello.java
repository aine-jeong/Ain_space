package day1;

/**
 * 
 * @author bitcamp
 *
 */

/* block
 * 파일명
 * 작성자
 * 날짜
 * 이력
 */

// 클래스 명 첫 글자는 대문자로 한다
public class Hello {
		
	// 콘솔환경에서 실행을 하려면... Entry point
	public static void main(String[] args) {
		// 함수 실행(호출) : 현재 같은 소스에 있는 함수 호출
		todo();// Java 문법 : static만 사용할 수 있다.
	}
	
	// 함수 만들기 
	static void todo(){
		// 실행할 내용은 항상, 반드시 함수 안에 쓰세요
		// 다른 소스(클래스)에 있는 함수는 .을 붙여서 경로 표현을 해야한다.
		System.out.println("출력할 문자열");
		// 시스템 안에 출력장치로 ~을 주어 출력한다...
	}	
	
}