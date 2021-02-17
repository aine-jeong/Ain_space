package day3;

import java.util.Scanner;

public class UpDown {
	/**
	 * 
	 * 1230수업 두번째 시간
	 * 
	 * 숫자맞추기
	 * - 1~100 정수를 사람이 결정
	 * - 프로그램이 임의 정수를 부른다(출력)
	 * - 사람은 정답과 비교해서 대답 입력
	 * +정답
	 * +up - 정답보다 큰 값을 부른 경우
	 * +down - 정답보다 작은 값을 부른 경우
	 * - 프로그램은 대답을 보고 다음 정수를 부른다
	 * 
	 * 이진 탐색 알고리즘 : 반씩 나누어 취한다.
	 * - (전제 조건)탐색 값들이 정렬 상태여야 한다.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int min = 1;
		int max = 100;
		System.out.println(min+"~"+max+"?");
		kb.nextLine(); // 키보드에서 입력된 모든 문자들을 String 타입으로 반환
		
		while(true) { // 횟수, 개수가 정해지지 않았을 때는 while루프를 많이 사용한다.
			int call = ( min + max )/2; //( min + max )/2 : 2진 탐색 -> 속도는 빠르나 준비하는 시간이 오래걸린다(정렬시켜야 하니까)
										// ㄴ 정렬된 데이터를 탐색할 때에만 사용하는 것이 좋다.
			System.out.println(call + "?");
			String response = kb.nextLine(); // nextInt, nextLine 등 결정하기 (정수로 받을건지 문자로 받을건지)
			// ㄴ문자열의 비교: 함수 사용
			if( response.equals("correct")) { // 정답이 나왔을 때
				System.out.println("맞췄다");
				break;
			}
			// 정답인 경우 위에서 break가 실행되어 여기까지 내려오지 않는다.
			switch( response ) { //if로 사용해도 가능함!
			case "up":
				// 방금 부른 call이 정답보다 큰 값이었다. 그러니까 다음에 부를 값은
				// call 보다는 작은 쪽의 값을 불러야 한다
//				min
				max = call;
				break;
			case "down":
				// 방금 부른 call이 정답보다 작은 값이었다. 그러니까 다음에 부를 값은
				// call 보다는 큰 쪽의 값을 불러야 한다
				min = call;
//				max
				break;
			}
			
		}//end Loop
		
		System.out.println("terminated");
		
	}
}





