package day4;

/**
 * 
 * 12월 31일 첫번째 수업- 기본형 배열 만들기
 * 
 * 배열- 자료형이 같은 여러 개의 변수들
 * + 요소(배열 안에 있는 하나하나의 변수): 요소의 자료형에 따라 달리 다룬다
 * + 길이: 최대 저장할 수 있는 요소의 개수 - 고정 길이 - (에러; 길이 초과)ArrayIndexOutOfBounds
 * + (차원)
 * + 1차 배열: 요소들이 변수인 것들
 * + 2차 배열: 요소가 1차 배열인 것
 * + !!! **요소번호**(요소들을 번호로 구분) int [0] ~ +1 [길이-1] (-> 길이가 10이면 요소번호의 최댓값은 9)  !!!
 * - ㄴ 번호의 의미를 생각해야 한다. (변수들을 이름이 아닌 번호에 따른 의미로 사용하게 되기 때문에)
 * 
 * 배열 복습할 때 다시 읽어볼 페이지
 * http://www.tcpschool.com/java/java_array_oneDimensional
 * (2차원 배열)
 * http://www.tcpschool.com/java/java_array_twoDimensional
 *
 */

public class ExArray {
	
	// 함수 실행과 관계 없이 유지해야 하는 것은 필드에다가 선언해두기!!!
	static int index = 0; // 필드에 선언한 변수는 함수의 지역성을 벗어난다 = 전역성
	
	public static void main(String[] args) {
		// 기능적인 부분
		int[] score = new int[5];
		add(score, 100); // 요소 추가하기: 새 값을 저장 (배열명, 추가할 값)
		
		int value = get(score, 2); // 요소를 꺼낸다 (넣고 빼는 습관~!~!)
		System.out.println("get: "+value);
		
		int select = 1; // 1번 요소를 수정하겠다
		int edit = 90; // 이 값으로 바꾸겠다.         -> 절차를 기억해랑
		edit(score, select, edit);
		
		// ***삭제 -> '비었다' (배열의 길이는 변하지 않기 때문에 값을 삭제하면 값이 비어있다)
		//    ㄴ 표현을 어떻게 할 것인가? 
		// (0이 있을 때 비었다고 할건지, 음수일 때 비었다고 할건지.. '비었다'는 개념을 정의하기) -> 개념에 따라 처리가 달라지니까
		// ("문제의 의도"(원하는 결과)에 맞춰 필요 없는 값을 찾아내야 한다 -> 필요 없는 값을 '비었다'라는 의미로 사용하면 된다.)
		// ex. 학생들의 점수를 입력한다면 점수의 범위를 확인한 뒤 범위 바깥의 값으로 사용하면 된당 (ex) 음수를 점수로 사용하지 안흥니까 음수로 설정
		// # '요소의 값이 0이면 비어있다' - 라고 정의하고 진행한다.
		select = 3; //3번 요소를 삭제하겠다.
		if( remove(score,select) ) { // 조건식 자리에 썼다는건 boolean타입으로 만들겠다는 의미이당 -> 반환 타입을 boolean으로 만들어야댕
			System.out.println("성공");
		}
	}
	
	private static boolean remove(int[] score, int select) {
		score[select] = 0;
		return true;
	}

	private static void edit(int[] score, int select, int edit) {
		score[select] = edit;
	}

	private static int get(int[] score, int i) {

		if( 0 < i && i < score.length) {// 항상 요소 번호의 범위를 생각해야 한다.
		return score[i];
		} else {
			return -1;
		}
	}

	private static void add(int[] score, int i) {
		// 배열 처리의 핵심 - '요소번호'기준에서 다룬다는 것
//		int index = 0; // 지역변수: 함수({}중괄호) 안에서 선언된 변수 (위에 있는 매개변수(int[] score, int i)도 지역번수당)
						// 지역변수들은 함수 종료시 모두 사라진다
						//  ㄴ 지역변수는 해당 함수가 호출될 때 마다 다시 실행(선언)된다 ( 값 초기화 됨!!!! )
		  				// 변수의 용도(사용범위)에따라 달리해야 함 ('지역성' 주의) / 지역변수는 함수가 종료시 초기화 된다는 점을 기억해야 한다.
						// 함수 실행과 관계 없이 유지해야 하는 것은 필드에다가 선언해두기!!!
		
		if ( index < score.length ) { // 경계선(요소번호)을 확인하는 부분 (에러가 나지 않도록)
		score[index] = i;
		++index; 
			// 값 하나를 저장한 뒤 요소 번호를 바꿔놔야(++index 부분) 추가기능이 되는 것 
			// (ㄴ 수정 기능과의 차이 (수정은 증가처리를 안해도 된다))
			// 증감 또는 감소를 어느 위치에서하는가에 따라 자료구조가 바뀐다 (스택, 큐 등)
		} else {
			System.out.println("Full");
		}

	}

	
	
	public static void main02(String[] args) {
		// 초기값을 넣는 배열 만들기
		int[] score = new int[] {9,7,5,3,1}; // 초기값을 직접 지정한다. -> []안에 따로 입력x
		for(int i=0; i < score.length; ++i) {
			System.out.println(i+":"+score[i]);
		}
		// 요소번호의 범위를 알아야 한다
		score[5] = 6; // -> 에러뜬당 (요소범위 초과함)
		
	}
	
	
	public static void main01(String[] args) {
		// 순서 (길이만 지정하는 배열 만들기)
		// 1. 배열형 변수 선언 - 배열명
		// 요소의 자료형이 뭔지, 길이가 얼마인지를 정해야 한당
		// int[] : 배열형 (int를 요소로 하는 1차 배열)
		int[] score;
		// 2. 그 변수에 배열을 생성해서 넣는다 
		// (ㄴ대입연산의 왼쪽은 반드시 변수 명이 되어야 한다 - 부르기는 '배열명'이라고 하지만 본질이 변수인 것을 기억하기)
		// 자바는 기본형을 제외한 나머지 타입들은 전부 new를 붙여서 생성하는 것이 기본 문법이당
		score = new int[5]; // 최대 [0]~[4] 까지의 5개의 요소를 넣을 수 있음
		// 길이가 5인 정수형 배열 변수 score 생성 (고정 길이이기 때문에 score.length에 값 대입 불가(=배열의 길이 변경 불가))
		// 3. 요소 단위로 반복하여 처리
		System.out.println("배열명: "+score); // -> id(식별값) 또는 참조값 -> 배열명: [I@2a139a55 -> [I 정수를 요소로하는 배열임을 유추 가능 
		System.out.println("배열 길이: "+score.length); // -> 고정길이
		
		for(int i=0; i < score.length; ++i) {
			// for문 안에서 요소들을 하나씩 처리한다. (i는 요소 번호)
			System.out.println(i+":"+score[i]); // score[i] : 요소명 => 'int형 변수'
			//                    ㄴ 요소 번호와 요소의 값 출력
			
		}
		
	}
	
}
