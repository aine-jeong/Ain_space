package day0122;

import java.util.Date; // -> 컴퓨터에 시간정보를 다룰 때 사용
import java.util.Scanner;

/**
 * 12월 31일 수업 세번째 시간
 * 주차장 요금 계산 - POS
 * + 자동차, 시간
 * + 입차, 출차 
 * + 여러 개 - 자료구조
 *  
 *  # 자료형이 다르면 배열 여러개를 다뤄야 한다.
 *  + 각 배열들 간의 관계(규칙): 요소번호
 *  여러 개의 배열을 요소번호의 기준을 통해 연결시켜야 한다.
 *  
 *  
 *  # 시간 주고 어떤 프로그램 만들어보세용~
 *   ㄴ> 연습하기
 *   시간 갖고 프로그램 작성해보기
 *   코딩테스트 하는 서비스 검색해서 문제 풀어보기
 *   수리적인 문제인 경우가 많당
 *   
 *   실습: 절차지향 (함수위주로 코딩)을 해본 것이당 (=구조적)
 *   
 */

public class ConsoleApp02 {
	static Scanner kb = new Scanner(System.in);
	static String[] cars = new String[10]; // cars: 주차된 차 (배열의 타입: string)
	// 차가 들어오는 시간만 저장 / 나가는 시간은 저장해둘 필요 없당
	// Date: 시간정보 데이터 타입
	// 생각해볼 것 -> 차량의 번호는 string, 시간은 date타입이다. -> 타입이 다르다 -> 배열이 여러개가 생기는 상황이 생겼당
	//  ㄴ 각 배열들 간의 관계를 어떻게 가질 것인가 (배열은 요소번호로 다룬다 - 각 배열을 붙이는 기준점은 '요소번호'에 규칙을 만드는 것 -> 연결시키기)
	static Date[] inTime = new Date[10]; // intime: 입차 시간 (배열의 타입: date)
	
	public static void main(String[] args) {
		
		for(;;) {
		// @ 주차현황보기(목록보기)
		String list = "번호\t차번호\t입시간\n"; // 지역성 주의하기
		for(int i=0; i<cars.length; ++i) {
			//출력할 문자 열을 만든다
			list += i+"\t"+cars[i]+"\t"+inTime[i]+"\n"; // list에서 선언된 컬럼값이랑 똑같은 구조로 맞추기
		}
		System.out.println("=============================");
		System.out.println( list );
		
		System.out.println("=============================");
		System.out.print("[1]입차[2]출차[3]수정[0]종료 > ");
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
			
//			boolean isFull = true; -> 요소번호가 나오는 것이 아니라 참/거짓만 나타나게 되는 부분이다.
									// 요소번호를 찾는 과정이 필요해졌당!
//			int ins = -1; // 빈 자리 없음
//			for(int i=0; i<cars.length; ++i){ // 주차 공간이 있는지 확인하기
//				if( cars[i] == null ) {
//					isFull = false;
//					break;
//				}
//			} // boolean이 아니라 int 타입으로 선언해야 하는 이유 인지하기
			int ins = -1; // 빈 자리 없음
			for(int i=0; i<cars.length; ++i){ // 주차 공간이 있는지 확인하기
				if( cars[i] == null ) {
					ins = i; // i번이 비어있다
					break;
				}
			}
			
			if( ins == -1 ) { //빈자리가 없으면 "만차"출력 
								//ㄴ(ins가 -1이라는 얘기는 위의 if조건이 참인적이 없다는 것 -> 비어있는 것이 없다는 것)
				System.out.println("만차입니다.");
			}else { //빈자리가 있으면 아래 실행
				System.out.print("차량번호: ");
				String data = kb.nextLine(); // 설정한 것- '어디' 에서 '무엇'을 - 키보드에서 문자를
				cars[ins] = data;
				inTime[ins] = new Date(); //현재 시간 입력 (new Date(); 이 명령이 실행되는 순간의 시점에서의 시간값이 들어간다)
			}
		}
		
		if (menu == 2 ) {
			// @ "차가 나간다.. 돈받아라"
			System.out.print("차량번호> ");	
			String no = kb.nextLine();
			// 검색 (차번호 찾아서 idx에 넣는 과정)
			int idx = -1;
			for(int i=0; i< cars.length; ++i ) {
				// 찾으려는 값이 "문자열" .equals를 사용 -> .을 사용하려면 null인지 아닌지 확인하는 과정이 필요 (null값이면 실행불가)
				if( cars[i] !=null) {
					if( cars[i].equals(no)) { //if 두개 가 보기 싫다 -> AND 연산으로 묶을 수 있다 (둘다참인 상황이니까)
						idx = i;
						break;
					}
				}
			}
			// 검색 결과 확인 ( 과정 잘 기억해둬랏 )
			if(idx != -1) {
			// car's data 가져오기
			String carsno = cars[idx]; // 차번호 받아서 차 찾기(정보를 찾기)
			Date in = inTime[idx] ;
			Date out = new Date(); // 나가는 시간 받아서 계산할거양
			
			// (자바) 날짜, 시간 다룰 때 기본적으로 자료형 Date 사용 ( . 찍어보면 뽑을 수 있는 함수들이 쭉 나온당 -> 잘 이용하기)
			// 자바 8버전 이상 -> Date 타입 비권장
			// out. 찍어보면 나오는 것들 중 조만간 사라질 것들이 많댜~!~!~!
			// 현재 8버전 이상에서 자주 사용하는 것들
			//		LocalDate;
			//		LocalTime;
			//		LocalDateTime;
			
			long diff = out.getTime() - in.getTime(); // 나가는시간에서 들어온시간 빼는 과정
													// getTime함수: 시간정보 값을 long타입의 '정수'로 반환
											         // 컴퓨터에 'milli seconds' 로 계산되어 있는 것을 변환시키는 과정
													  // 컴퓨터에는 모든 정보가 '정수'로 저장되어 있음을 인지
			// 추가요금 계산 기준(초,분,시)을 정해야 한다.
			// 테스트를 위해서 초단위로 하자
			long extra = diff / 1000; // long extra = diff / 60000; 분단위로 하는 방법
			long price = 10000 + (extra * 500); // -> 기본요금 + extra(사용시간) * 500(초당 금액)
			System.out.println("> " + price);
			
			// 삭제 처리 필요
			cars[idx] = null; // 차번호 받아서 차 찾기(정보를 찾기)
			inTime[idx] = null;
			} // != -1
			else {
				System.out.println("등록된 차량번호가 아닙니다.");
			}
		}
		

		if(menu == 3) { //@ 차가 들어온 날짜(시간)을 수정할 것
			System.out.print("차량번호(수정)> ");
			// + 여러 개의 데이터를 가지고 있는 상황에서 수정: 수정할 대상을 선택하는 작업 필요
			String no = kb.nextLine();
			// 검색 (차번호 찾아서 idx에 넣는 과정)
			int idx = -1;
			for(int i=0; i< cars.length; ++i ) {
				// 찾으려는 값이 "문자열" .equals를 사용 -> .을 사용하려면 null인지 아닌지 확인하는 과정이 필요 (null값이면 실행불가)
				if( cars[i] !=null) {
					if( cars[i].equals(no)) { //if 두개 가 보기 싫다 -> AND 연산으로 묶을 수 있다 (둘다참인 상황이니까)
						idx = i;
						break;
					}
				}
			}
			
			String origin = cars[idx]; 
			Date time = inTime[idx]; // 수정할 값을 입력받고
			// 이 차의 들어온 시간을 변경해주겠다.
			System.out.print("입차한 시간(24시간 단위로 입력)> ");
			int hour = kb.nextInt();
			System.out.print("입차한 시간(60분 단위로 입력)> ");
			int min = kb.nextInt();
			System.out.print("입차한 시간(60초 단위로 입력)> ");
			int sec = kb.nextInt(); // 키보드 입력처리를 하면 된다. 실습에서는 그냥 임의 값을 넣어서 해보쟈
			time.setHours(hour);
			time.setMinutes(min);
			time.setSeconds(sec);
			System.out.println( time ); // = time.toString();
			// get은 꺼내오는거 set은 갖다 넣는것
			
			// 덮어쓴다(변경한다)
			inTime[idx] = time;
			
			System.out.println("차량번호["+cars[idx]+"]의 입차시간이"+inTime[idx]+"로 변경되었습니다.");
			// 해야할 것- 확인시켜주는 작업
			
			// + 변경해도 되는 것과 변경하면 안되는 것을 구분지어야 함(식별값)
			
		}
		
		
		
		
		
		
		//if문을 꼭 순서대로 작성할 필요는 없당	
	}// end for
		// 반복이 종료될 시 여기로 오지요
		
		
	} // main end
} // calss end

