package day2;

public class Homework {
	
	/**
	 * 해야할 것
	 * (1)
	 * 3행, 3열로 구구단 출력하기.
	 * 각 블럭에는 3개의 단이 출력되도록 하여 2단부터 9단까지!
	 * 
	 * Hint
	 * 3개의 for문을 중첩시켜라
	 * 1번째 for문은 블럭을,
	 * 2번째 for문은 행 9개를(x1~x9가 세번 반복되는 모양)
	 * 3번째 for문은 하나의 행 (2x1 3x1 4x1 ~)
	 * 
	 * (2)
	 * 12월 30일 진도: 구구단 같이 해보고, 숫자맞추기 출력(Up&Down방식과 야구게임 방식)
	 * 
	 */
	
	// 수업내용 
	// *변수에 저장된 값의 의미를 정하기*
	// for문: ~에서부터 ~까지 ~씩 증감
	// 조건식에 변수를 사용한 경우, 그 변수는 실행 중 변경되어야 한다... (-> 변수가 변하지 않으면 계속해서 참 -> 계속 실행 -> 무한루프)
	// for(초기식(값);조건식(조건식이 참인동안 계속해서 실행);증감식(반복하는 동안 일정하게 변하는 표현))
	// 
	// 
//	int a=2;
//	
//	for(int k=1;k<4;k++) { //3 블럭으로 나눈다
//		System.out.println();
//			for(int i=1;i<10;i++) { //i는 1~9 (곱하기)
//				System.out.println(); // 
//				for(int j=a;j<a+3;j++) { //j는 2~9 (단) 
//					System.out.print(j+"x"+i+"   ");
//					
//				
//				}
//				
//			}
//			a = a+3;
//	}
//	
//}
//
//
//public static void main01(String[] args) {
//
//for(int k=1;k<4;k++) { //3 블럭으로 나눈다
//	System.out.println();
//		for(int i=1;i<10;i++) { //i는 1~9 (곱하기)
//			System.out.println(); // 
//			for(int j=2;j<10;j++) { //j는 2~9 (단) 
//				System.out.print(j+"x"+i+"   ");
//			
//		}
//	}
//}
	
	
	public static void main(String[] args) {
		
		 int start = 2;
		 int end = 9;
		 int cols = 3;
		 int blocks = 3;
		 int left = start;
		 
		 for(int k = 0; k < blocks; ++k) {
			 System.out.println();
			 for(int v = 1; v < 10 ; ++v) {
				 for(int m=0; m<cols; ++m) { // 숫자가 아닌 변수를 사용하는 이유 -> 활용도를 높이기 위해서
						int dan = start + m;
						int mul = dan * v;
						
						if( dan <= end){
						String s = dan+" x "+v+" = "+mul+"\t";
						System.out.print(s);
						}
				 }
			 }
			 left += cols;
		 }
		 
		 
		
	}//main end
}//Homework end














