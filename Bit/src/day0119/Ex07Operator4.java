package day0119;
/*
 * 논리연산자
 * 논리연산자는 boolean값에 대한 연산을 한다.
 * 
 * 
 * 1. AND 연산자 ( && )
 * 	  2개의 boolean값이 모두 true일 때에만 결과가 true가 나온다.
 * 
 * 
 * 2. OR 연산자 ( || )
 * 	  2개의 boolrean값 중 하나라도 true이면 결과가 true가 나온다.
 * 
 * 
 * 3. NOT 연산자
 * 	  true는 false로 false는 tue로 변환해준다. 물론 실제 값이 바뀌지는 않는다.
 * 
 */

public class Ex07Operator4 {
	public static void main(String[] args) {
		// 1. AND 연산자
		System.out.println("true && true: "+ (true && true));
		System.out.println("true && false: "+ (true && false));
		System.out.println("false && true: "+ (false && true));
		System.out.println("false && false: "+ (false && false));
		// AND 연산의 경우 앞의 boolean 값이 false일 경우 굳이 뒤를 확인 안해도 결과값은 무조건 false이기 때문에
		// false && true 혹은 false && false라고 적으면 뒤의 true와 false에 "경고"가 뜬다.
		
		// 2. OR 연산자
		System.out.println("true || true: "+ (true || true));
		System.out.println("true || false: "+ (true || false));
		System.out.println("false || true: "+ (false || true));
		System.out.println("false || false: "+ (false || false));
		
		// 3. NOT 연산자
		boolean b = true;
		System.out.println("b의 현재값: "+b);
		System.out.println("!b: "+!b);
		System.out.println("b의 현재값: "+b);
		
	}
	

}
