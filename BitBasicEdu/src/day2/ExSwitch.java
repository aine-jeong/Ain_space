package day2;

import java.util.Random;

// switch의 용도 기억하기
// 벡터테이블, 핸들러테이블

/**
 * 분기, 선택
 * if		논리적 판단 (조건식)
 * switch   산술적 판단 (상수값)
 * 
 * 조건식
 *  + 관계연산, 논리연산 문장 만드는 것
 *  + 상태, 상황 표현
 * 
 * 
 */

public class ExSwitch {
	
	public static void main(String[] args) {
		// switch: 변환 표 (입력) case (출력)
		int weekday = 2;
		char week = ' ';
		switch( weekday ) {
		case 0: week = '일'; break;
		case 1: week = '월'; break;
		case 2: week = '화'; break;
		case 3: week = '수'; break;
		case 4: week = '목'; break;
		case 5: week = '금'; break;
		case 6: week = '토'; break;
		}
		System.out.println(week+"요일");
	}
	
	
	public static void main01(String[] args) {
		// 2. 난수 생성기: Random 생성 후 사용
		Random random = new Random();
		int score = 10; // random.nextInt(); //.nextInt-> 정수형 난수
		// Q, score의 값이 얼마냐에 따라 실행할 부분을 선택하기 : 상수식 (조건식x)
		int value = 100;
		// switch 는 실행의 시작점을 선택하는 것 (뒤가 다 실행된당)
		switch( score ) {
	// case value: 값(상수식)을 1개 적어야 한다 (식은 작성할 수 없음) -> 범위표현 불가 -> 사용할 수 있는 경우가 제한적이다.
		case 10:
		case 20:
			System.out.println("10");
			break; // 중단 (실행했다면 나가라고 명령하는 것)
		case 30:
			System.out.println("30");
			break;
			default: // 해당하는 값이 없을 때
				System.out.println("해당하는 값이 없을 경우");
		}
		
	}
	
}
