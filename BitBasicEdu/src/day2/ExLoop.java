package day2;

/**
 * 
 * 반복
 * + 조건식이 참이면 계속 실행
 * 
 * 1. 한 번 실행 - 규칙성 찾기
 * 2. 변하는 것 -> 변수 -> = 연산자를 찾자
 * 3. 관계, 영향이 있는 것들의 식을 잘 만들자
 * 
 */

public class ExLoop {
	
	public static void main(String[] args) {
		// Q. 3~24 정수들을 출력한다. 단, 행마다 10개씩 출력한다
		int v=3;
		while( v < 25) { // v = 25
			for(int k=0; k<10; ++k) {
				if(v > 24) { // 마지막 값을 잘 확인해야 함. 해당 if문이 없다면 32까지 출력된당
					// v = 25
					break; // break는 첫번째 반복에서 나오는 것 (for문까지 실행 후 조건이 만족되면 브레이크된당)
				}
				System.out.print(v+"\t");
				++v;
			}
			System.out.println();
		}
	}
	
	public static void main02(String[] args) {
		// Q. 1~50 정수들을 출력한다. 단, 행마다 10개씩 출력한다
		// ㄴ 조건에 부합하도록 문제를 이해해야 한다 (10의 배수단위로 하면 안댕 -> 개수로 생각하기)
		// ***변수에 저장된 값의 의미를 정해라*** (ex. 여기서 count는 매 행마다 출력한 횟수당)
		int count = 0;
		for(int i=1; i<51; ++i) {
			System.out.print(i+"\t"); // t는 tab
			++count; // 계수한다
			if(count==10){ //출력한 것이 10개 이면
				System.out.print("\n"); // n은 개행
				count = 0; // count는 행에서의 개수를 세는 것이기 때문에 다시 0으로 설정해주는 것
			}
		}
	}

	public static void main01(String[] args) {
		// Q. 1 ~ 15까지 연속 정수들을 출력하는 문제
		exFor(); // 호출하는 방법을 정한 후 자동완성 기능을 활용하자
				 // ㄴ exFor(); 작성한 다음에 오류에 마우스 갖다대고 함수 생성해달라고 하기~!~!
		exWhile();
		exDoWhile();
		
		
	}

	private static void exDoWhile() {
		// do-while: 실행 후 조건 판단 (while문과 조건을 판단하는 위치가 다름)
		int v = 1;
		do {
			System.out.print(v+",");
			++v;
		} while( v <= 15 ); // 끝에 세미콜론(;) 찍어야 함 주의
	}

	private static void exWhile() {
		// while문: 조건식이 참인 동안 실행
		int v = 1; // 변수를 while문 밖에다가 선언해줘야함 주의
		while( v <= 15 ) {
			System.out.print(v+",");
			++v;
		}
		System.out.println();
	}

	private static void exFor() {
		// for문: ~에서부터 ~까지 ~씩 증감
		// 조건식에 변수를 사용한 경우, 그 변수는 실행 중 변경되어야 한다... (-> 변수가 변하지 않으면 계속해서 참 -> 계속 실행 -> 무한루프)
		// for(초기식(값);조건식(조건식이 참인동안 계속해서 실행);증감식(반복하는 동안 일정하게 변하는 표현))
		for(int v = 1;v <= 15; ++v) {
		 System.out.print(v+",");	 // println: 개행o / print: 개행x
		}
		System.out.println();
		
	}

}






