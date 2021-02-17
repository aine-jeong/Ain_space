package day2;

public class ExIF {

	/**
	 * 제어문: 선택과 반복
	 * 예약어()
	 * {
	 * 
	 * }
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// 임의(난수)의 영문자 1개를 출력하세요 'a'~'z'
		int min = 'a';
		int max = 'z';
		// 난수 발생 (->기초 소양)
		// 1. Math를 사용해서 난수 발생시키기 
		// (Math는 기본 시스템 라이브러리이기 때문에 내장되어있어 따로 import할 필요 없음 (String처럼))
		double ran = Math.random()*1000; // 정수가 아니기 때문에 그냥 뽑으면 정수난수는 0밖에 안나옴
		                                 // so, 스케일링!-> *1000해주기 (소수부분을 정수로 올려주기)
		int letter = (int)ran; // (int) => 정수부만 잘라서
		// letter가 min~max 사이가 되어야 한다.
		// (hint: 나머지연산의 성질을 생각해보기 -> 최댓값을 설정해줄 수 있다.)
		// (       ㄴ 덧셈이나 뺄셈의 경우 최솟값에 변화가 생김, 나머지연산은 최댓값을 설정할 수 있음)
		
		// 원래 식 ㄱ
		// letter = letter + min; // min~ -> min 이상의 값이 나오도록 조정한 것
		// letter = letter % (max-min+1);
		
		// 수정식 ㄱ
		letter = (letter % (max-min+1))+min; //~max -> 나머지연산을 하면 max-1까지가 나온다. 그래서 +1해주는고
									   // 소괄호 안에서 -min 해주는 이유는 길이를 유지시키기 위함
									   // ㄴ (수정한 부분) 위에서 min을 더해줄 때 최댓값도 같이 밀리기 때문에 min을 빼줌으로써 최댓값을 조정(길이 조정)
								       //max 이하의 값이 나오도록 조정한 것
		
		// 오류가 나면 식 중간중간에 프린트해서 어느부분에서 오류가 난건지 찾아보기!
		// 최솟값이 사라지는 오류가 나왔당!! 
		// letter = letter + min; // min~ -> min 이상의 값이 나오도록 조정한 것
		// letter = letter % (max-min+1);
		// -> 원래 식// 최솟값을 설정한 후에 나머지값을 구해줌 -> min 설정해둔 것이 사라진 것
		// so, letter = letter % (max-min+1)+min 으로 수정 (최댓값 설정 후 다시 최솟값 설정 (+min)

		// 각 연산에서 나올 수 있는 범위를 생각하기 !!!!!!
		// + 위의 공식은 난수 뽑을 때 자주 사용하는 공식이당
		// 위의 min과 max의 범위를 수정하면 해당 범위 내의 난수가 발생한당~!~!~!~!
		
		System.out.println((char)letter);
		System.out.println("ran:"+ran);
		System.out.println("letter:"+letter);
		System.out.println(min+"~"+max);
	}
	
	
	public static void main03(String[] args) {
		// 임의(난수)의 영문자 1개를 출력하세요 'a'~'z'
		int min = 'a';
		int max = 'z';
		// 난수 발생 (->기초 소양)
		// 1. Math를 사용해서 난수 발생시키기 
		// (Math는 기본 시스템 라이브러리이기 때문에 내장되어있어 따로 import할 필요 없음 (String처럼))
		double ran = Math.random()*1000; // 정수가 아니기 때문에 그냥 뽑으면 정수난수는 0밖에 안나옴
		                                 // so, 스케일링!-> *1000해주기 (소수부분을 정수로 올려주기)
		int letter = (int)ran; // (int) => 정수부만 잘라서
		
		// letter(에 저장된 값이)가 min~max 이면 출력한다.
		// 조건식을 만드는 첫번째: 관계연산자+논리연산자
		if( letter >= min && letter <= max ) {
		System.out.println((char)letter);
		}else {
			System.out.println(letter);
		}
	}
	
	public static void main02(String[] args) {
		// 범위: 시작 ~ 끝 (=연속하는) -> 공간의 연속/값의 연속 판단 주로 '값의 연속'
		// 결과, 조건들 간의 관계를 생각
		int score = 100;
		// 중첩 IF: 질문을 연속하는 상황
		// 중첩 if문(다중) -> 계속 직전 조건에 영향을 받는다
		if( score >= 90 /*조건식*/) {
			// 실행을 위한 조건: 관계연산자 boolean
			System.out.println('A');
		} else {
			// else와 if 사이에 다른 조건이 없다면 아래와 같이 else if로 사용 가능함! (-> 장점: 열을 보기편하게 맞출 수 있다.)
			// else 대신 if( score < 90 && score >= 80)로 작성도 가능함
			if( score >= 80) {
				System.out.println('B');
			}else if( score >= 60) {
					System.out.println('C');
			}else {
					// if의 조건이 거짓일 때 (score가 60보다 작을 때)
					System.out.println('F');
				}
		}
		// 다시 한군데로 모인다.
		
	}
	
	public static void main01(String[] args) {
		int score = 100;
		if( score >= 90 /*조건식*/) {
			// 실행을 위한 조건: 관계연산자 boolean
			System.out.println('A');
		}
		if( score >= 80) {
			System.out.println('B');
		}
		// 조건에 따라서 실행을 결정한다
		if( score >= 60) {
			System.out.println('C');
		}else {
			// if의 조건이 거짓일 때 (score가 60보다 작을 때)
			System.out.println('F');
		}
		// 다시 한군데로 모인다.
		
		
		
	}
	
}



