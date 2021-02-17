package day4;

/**
 * 12월 31일 수업 네번째 시간
 *   객체지향으로 해보기
 *   
 *   # 객체지향 (-> 추상적이얌)
 *   1. 역할로 나눈다
 *   (절차지향에서는 함수로 나눈다)
 *   - 사용자의 입출력을 처리하는 역할 ->Front
 *   - 데이터들을 관리하는 역할(CRUD) ->Back
 *   - 데이터들을 (요구에 맞추어서) 처리하는 역할 ->Logic
 *   2. 연결 관계로 구성한다.
 *   - 포함, 호출, 반환 ( -> 절차지향: 어떤 함수에서 어떤 함수를 호출한다)
 *   - 상속, 다형성, 인터페이스 ...
 *   
 *   함수 만들 때 호출을 어떻게 할건지 미리 정해두고 하면 편해용~
 *   
 *   ## 숫자맞추기 야구게임 전략짜기 꼭 해보세용
 *   내가 알고 있는 것을 어떻게 코드로 구현할 건지 생각해보기 ~!~!~!
 *   ## 참조라는 개념 (위치 개념 잘 구분하기)
 *   다른 위치를 가리키면 각각 다른 데이터
 *   같은 위치라면 수정이나 삭제할 때 문제가 생길 수 있음 - 주의하기
 *   ## 역할베이스 기억하기
 *    (-> 도대체 왜 이렇게 코딩하는지 모르겠어... 하는 부분을 해결해줄 수 있당....!!!)
 *   
 */

// @ Controller

import java.util.Date; // -> 컴퓨터에 시간정보를 다룰 때 사용
import java.util.Scanner;


public class ConsoleApp03 {
	/**
	 * main 합수:
	 *  -키보드 입력(요청), 화면 출력(응답)
	 *  - 변수형: 문자열 (String)
	 *  
	 *  main에서만 키보드 입출력을 하도록 함
	 */
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//@ 실질적인 데이터 처리, 관리 기능들을 분리하여 역할을 나누어 준다
		CarParkService service = new CarParkService();
		
		
		for(;;) {
		// @ 주차현황정보 가져오기
		String[] cars = service.getList(); //why? - string타입: 출력할 거니까
		//   # main에서 일을 덜하게 만드려면 ? - for문 빼고 출력할 문자열 하나만 나타나게 해도 된다 -> 스스로 해볼부분
		// @ 주차현황보기(목록보기)
		String list = "번호\t차번호\t입시간\n"; 
		
		for(int i=0; i<cars.length; ++i) {
			//출력할 문자 열을 만든다
			list += i+"\t"+cars[i]+"\n"; // list에서 선언된 컬럼값이랑 똑같은 구조로 맞추기
		}
		System.out.println( list );
		
		
		System.out.println("[1]입차[2]출차[3]수정[0]종료 > ");
		int menu = kb.nextInt(); // 마지막에 누른 엔터값을 버려야 다음 입력을 처리할 수 있음
		//"~에 따라서, ~일 때, ~이면" 이라는 얘기가 나오면 판단하라는 것 !
		kb.nextLine(); // -> 버퍼를 비우는 작업을 해주는 것 (엔터가 입력된 값을 버리기)
		if (menu == 0 ) { // # 자료형에 따라 처리하는 방법이 다르다는 것 기억하기
			System.out.println("종료합니다.");
			break; // return; : 함수를 종료하는 것. (아예 밑으로 안나간당) (break는 반복문을 끝내겠다.(밑으로 나간당) 종료의 대상이 다름 주의)
		}
		if (menu == 1 ) {
			// @ "차가 들어온다"
			// 1. 주차 공간이 있는지 확인하기
			// 2. 빈 자리 찾기 (주차장에는 순서라는 개념이 없으니까)
			
			if(service.hasEmpty()) { // 빈 공간이 있는지 서비스한테 시키는고 (main이)
									// 이 부분을 service한테 넘기기 위해 if로 묶은고
				System.out.println("차량번호: ");
				String carno = kb.nextLine(); // 설정한 것- '어디' 에서 '무엇'을 - 키보드에서 문자를
				Date in = new Date();
				service.parking(carno, in);
			}
		}
		
		if (menu == 2 ) {
			// @ "차가 나간다.. 돈받아라"
			System.out.println("차량번호> ");	
			String carno = kb.nextLine();
			// 검색 (차번호 찾아서 idx에 넣는 과정)
			long price = service.getPrice(carno); //long타입으로 계산값 받을고
			System.out.println("> " + price);
		}
			

		if(menu == 3) { //@ 차가 들어온 날짜(시간)을 수정할 것
			System.out.println("차량번호(수정)> ");
			// + 여러 개의 데이터를 가지고 있는 상황에서 수정: 수정할 대상을 선택하는 작업 필요
			String carno = kb.nextLine();

			int hour = 22;
			int min = 24;
			int sec = 0; // 키보드 입력처리를 하면 된다. 실습에서는 그냥 임의 값을 넣어서 해보쟈
			service.editTime(carno, hour, min, sec);

			
		}
		
	}// end for
		// 반복이 종료될 시 여기로 오지요
			
	} // main end
} // calss end

