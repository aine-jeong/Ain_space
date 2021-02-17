package day3;

import java.util.Random;
import java.util.Scanner;

/**
 * 1230수업 세번째 시간
 * 
 * 
 * 야구게임(숫자맞추기)\
 * 1. 3자리 정수: 각 자리에 같은 값이 없어야 한다.
 * 2. 프로그램이 정답을 맞춘다.
 * 3. 사용자의 대답: 스트라이크, 볼 개수를 입력(정수)
 * + 값이 같다.
 *  - 위치도 같다: 스트라이크
 *  - 위치는 다르다: 볼
 * 4. 정답을 알아내는 전략(알고리즘)은 숙제~
 *  
 *  
 *  # while과 dowhile의 차이
 *  
 *  %%%생각해볼 것: predict 와 process 사이의 관계를 파악해가면서 함수를 추가해야 한당
 *				 ㄴ 논리력과 문장력이 향상된다
 *  
 */

public class BaseBall {

	static int found = 0; // 0이 아니면 정답을 찾은 상황으로 본다. (found를 필드로 꺼내놓은 고)
	// static이 있는 함수에서는 static만 사용 가능하다. so, found 앞에도 static으로 지정해야 found 사용 가능
	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		int strike = 0; // 키보드 입력
		int ball = 0;
		while(true) { // 실행하기 위한 조건 판단
			int call = predict();
			do { // 실행 결과를 판단해서 반복
			System.out.println(call+ " ? ");
			strike = kb.nextInt();
			ball = kb.nextInt();
			}while( strike + ball > 3 );
			if(strike == 3) {
				// ㄴ 위치와 값이 모두 같다
				System.out.println("corrected");
				break;
			}
			// 대답에 대한 처리
			process(call, strike, ball);
			
		}// end while
		
	}

	private static void process(int call, int strike, int ball) {
		// TODO: 사용자 응답에 따라 다음 값을 결정하기 위한 준비를 한다
		if( strike + ball == 0 ) {
			System.out.println("Out");  // 전략 짜는 부분
									    // ㄴ 전략: "call에 사용된 값은 제외한다.."
		}
		else if( strike + ball == 3) {
			// 값은 찾았는데 순서가 바뀌어있음 (순서를 찾도록 만들기)
			int a = call / 100; // 100의 자리 값 뽑는고
			int b = (call / 10) % 10; // 10의자리 뽑는고
			int c = call % 10; // 1의 자리 뽑는고    > 각 자리 값을 뽑아서 순서를 바꿔보도록 만들어야 함
			found = (b*100)+(c*10)+a;
		}
		else if( strike + ball == 2) { // 어쨌든 두개를 찾았다는 거니까 나머지를 찾아야댄당
			if ( strike == 2 ) { // %%% 생각해볼 것: predict 와 process 사이의 관계를 파악해가면서 함수를 추가해야 한당
								//        ㄴ 논리력과 문장력이 향상된다
				
			}
		}
		
	}

	private static int predict() {
		// 사용자에게 부를 값을 계산해서 반환
		if ( found != 0) {
			return found;
		} // found가 0이 아니면 찾았다는 뜻이니까 found를 출력. 0이면 답이 아니니까 밑으로 실행 계속되도록 만든 것
		int number = genInt(3); // 3자리의 값을 부르겠다.
		return number;
		
	}
	
	/**
	 * 중복 값을 확인하는 방법 연구
	 * 1. 임의 한 자리(r) 값을 현재 값(number)와 비교해서 같은 값이 있는지 확인 
	 *   ㄴ 산술적인 방법 (나누기해서 남은숫자(각 자릿수)와 r을 각각 일대일로 비교하기)
	 * 2. 상태: '사용한 적이 있다' 표시(이력남기기)하고 사용하지 않은 값만 처리
	 * - 배열 (여러 개의 변수의 값을 비교하기 위해서 사용)
	 * - 비트연산자 
	 * 
	 * > 비트연산자 [r]번비트의 값이 1이면 사용한것, 0이면 사용안한 것으로 표시를 해보쟈
	 * 
	 */
	private static int genInt(int digits) {
		// TODO: 중복 없는 정수를 생성해서 반환하기(digits=자리수) 
		// = 전달하는 자릿수 만큼의 정수를 반환
		// 1에서 9까지의 값을 합쳐서 해당 조건에 맞는 결과를 반환하는 것
		// so, genInt를 10 호출하는 것은 불가 (1~9까지의 숫자를 중복하지 않고 사용해야 하기 때문에)
		// genInt( ); 는 중복없는 최대 9자릿수

		// 10진수 1자리 1 ~ 9
		
		// # 순서 #
		//1. 원하는 자릿수를 만든 다음,  (number = number * 10 + r;)
		//2. 각 자리에 랜덤 값이 인출되도록 설정한 다음 ,  (int r = random.nextInt(9)+1;)
		//3. 중복이 안나오도록 설정하기, do~while~flag = (short)(flag | (1<<r));
		
		int number = 0;
		Random random = new Random();
		short flag = 0; // flag는 0~15번까지의 비트를 가지고 있음 (우리는 9개만 쓸거당)
		for(int k=0; k<digits; ++k) { //k가 자릿수라고 생각 -> 0이 높은 자릿수가 된다. (k가 커지면 자릿수가 낮아짐)
			int r;
			do {
				r = random.nextInt(9) + 1;
			} while((flag & (1<<r)) > 0 ); // flag 안의 r번 비트가 0인지 1인지 (사용 했었는지를 판단) 판단해보자.
										  // 0 보다크면 - 이미 사용했당 > 다시 올라가라
										  
									      // & (AND: 그 값이 0인지 1인지 확인하기)
										  // (flag & (1<<r) r번 비트가 1인 값이랑 flag랑 비교해서
										  // (flag & (1<<r)) 1. 0보다 크면(0이 아니면) do문 실행하기
			         					  // 2. 0이면 사용하기.
			
			// 이제 사용할거다 (이전에 사용한 적이 없으니까)
			flag = (short)(flag | (1<<r)); // /(short)형변환/ -> flag 변수에 r번 비트를 1로 만들어서 저장하겠다. (사용했다는 표시)
								// | (OR: r번 비트를 1로 저장하겠다)
								// flag | (1<<r) 
			
			number = number * 10 + r;
			
//	 두번째 순서까지 한 식 -> 여기서 세번째로 넘어갈 때 do-while문 삽입했음	
//			int r = random.nextInt(9)+1; // r 변수는 반드시 1에서 9 사이의 범위로만 만들어져야 한다.
//										// nextInt( )괄호 사이의 숫자는 최댓값울 설정한 것
//										// +1은 범위를 조정하는 것.
//										// nextInt(n): n-1 까지의 값이 나옴 (so, +1)
//			number = number * 10 + r;//*10은 자릿수를 올리는 것
//									// 현재 있던 값을 한자리 올린 다음에 r 값을 더함 
//									// ㄴ 이것을 반복하니까 점점 위로 올리면서 숫자가 '조립되는 것' 으로 보면 된다.
		}
		return number;
	}

	
	
	private static int counting() { // 볼판정하기
		String n = "123";
		String m = "345";
		int s = 0;
		int b = 0;
		for(int i = 0; i < 3; ++i) { // i랑 k는 위치를 의미하고 있음
			char v = n.charAt(i); // -> 개별적인 글자로 파악("몇번째 글자" - 각 자릿수에 해당하는 숫자를 뽑아내기
			for(int k = 0; k < 3; ++k) {
				char p = m.charAt(k); 
				if( v == p ) {
					// 값이 같다.
					if( i == k ) {
						// 위치도 같다
						s++;
					} else {
						b++;
					}
				}
			}
		}
		System.out.println("Strike: "+s);
		System.out.println("Ball: "+b); 
		// 숫자들(문자열)을 정수로 바꾸기
		int num = Integer.parseInt(n);
		// 정수를 숫자들(문자열)로 바꾸기
		String ss = ""+789;
		ss = String.valueOf(789);
		
		
		return 0;
	
	}
	
	
}
