package day3;

/**
 * 1230수업 첫번째 시간
 * 
 *
 */

public class Gugudan {
	// 필드 선언: 이 안에 모든 함수들이 공통적으로 사용(전달, 반환 필요x)
	// 필드가 어떤 건지 파악!
//	int start = 2;
//	int end = 9;

	public static void main(String[] args) {
		//3행 3열 구조로 구구단 출력하기
		//변화 대응하기 위해 제어
		// # 전달법을 사용해야 하는 이유: 어떤 값을 '전달'받을 때 결과가 달라진다 (-> 유연성) = 활용 폭을 넓혀라
		// 틀을 만든 다음에 값을 넣으면서 답찾기
		// 방식2개 : 상대적, 절대적 둘다 가능하다 -> 어울리는 것으로 생각해가면서 넣어보깅
		// (복습) 각각 변수가 어떤 의미인지 생각해보기
		//        ㄴ 각 for문에서 변하는 수와 변하지 않는 수 파악하기
		// 1. 틀 잡고 / 2. 데이터 맞춘 다음 /3. 문제가 생길 여지들을 확인하면서 함수 추가하기
		
		// 전달과 반환은 호출하는 관계에서만 가능하다. (호출하는 관계가 성립되지 않으면 전달,반환 불가능)
		// 함수 간의 관계 파악이 중요하다.
		// ㄴ (복잡해짐) 해당 문제를 해결하기 위한 방법 -> '필드'에다가 변수를 만들면 전달과정 필요없음!
		//                                       ㄴ 전역변수, 전역적 (<->지역적)
		
		gugudan(2, 9, 3);
		
	}

	private static void gugudan(int start, int end, int cols) {
		// 전체 구조(3행 3열)의 3행 부분!
		// block - 9 rows
		int blocks = 3;
		int left = start; // 각 블럭의 왼쪽 시작하는 단의 값
		for(int k=0; k < blocks; ++k) {
			printBlcok(left, end, cols);
			left += cols;
			System.out.println("// end block");
	
		}
	}

	private static void printBlcok(int start, int end, int cols) {
		// 각 단에 출력될 9줄 부분
		// x1 ~ x9
		for(int v=0; v<9; ++v) {
			printLine(start, end, cols, (v+1));
			System.out.println();
		}
		
		
	}

	private static void printLine(int start, int end, int cols, int v) {
		// 한 행에 3개씩의 단 곱셈 출력
		for(int m=0; m<cols; ++m) { // 숫자가 아닌 변수를 사용하는 이유 -> 활용도를 높이기 위해서
			int dan = start + m;
			int mul = dan * v;
			
			if( dan <= end){
			String s = dan+" x "+v+" = "+mul+"\t";
			System.out.print(s);
			}
		}
		
	}

}





