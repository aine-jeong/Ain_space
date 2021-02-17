package day4;

/**
 * 12월31일 두번째 수업 클래스형 배열 만들기
 * 
 * 기본형일 땐 요소번호의 범위만 생각하면된다
 * 클래스형일 땐 범위와 요소번호의 범위와 null값인지 아닌지도 생각해야 한다.
 *  ㄴ 삭제처리가 쉬움 ( null 값을 넣어주면 된다 )
 *  
 *  ** 요소 번호가 제일 중요행~!~!~! **
 *       ㄴ '범위'와 각 요소 번호의 '의미'
 * 
 */

public class RefArry {
	
	public static void main(String[] args) {
		// @ 배열에 저장된 값들의 순서가 필요없는 경우
		// - 추가(삽입): 빈 자리를 찾아서 넣기
		// - 삭제: 이동시킬 필요 없음 (빈자리대로 두면 된당)
		String[] names = new String[5];
		names[0] = "kims";
		names[1] = "jangs";
		names[2] = "parks";
		names[3] = "jung";
		names[4] = null;
		
		//@삭제
		names[1]=null;
		
		//찾기 ( 꽉 차있을 때는 할 수 없도록 처리 / 배열이 꽉 차있다면 idx가 그대로 -1값이 나오게 된다 )
		int idx = -1; // 꽉 찼다는 의미 (비어있는 곳이 없다)
		for(int i=0; i<names.length;++i) { //for문: 검색하는 부분
			if( names[i] == null) { //i번 요소가 비어있다면
				idx=i; //비어있는 요소의 번호를 i에 저장
				break;
			}
		}
		if (idx > -1) {
			names[idx] = "new";
		}
		
 	}
	
	public static void main03(String[] args) {
		// @ 배열 삽입, 삭제 처리 - 이동 시키기 (순서유지)
		// 배열 사이사이 null 값이 있다면 공간의 낭비가 있는 것
		// 공간의 효율성을 위해 사이가 비어버리지 않도록 앞으로 당겨서 채워야 한다.
		// 마찬가지로 '삽입'할 때는 넣을 곳의 뒤부분을 밀어내야 한다.
		// -> 삽입과 삭제의 시간이 오래걸린다 so, 배열 사용하지 않기 
		//    ㄴ(데이터를 모아놓는 그릇 개념으로만 사용한다. 데이터가 수시로 삽입, 삭제되는 경우 배열 사용하지 않음)
		
		// ## 요소들이 연속하는 상태를 유지한다 ##
		
		String[] names = new String[5];
		names[0] = "kims";
		names[1] = "jangs";
		names[2] = "parks";
		names[3] = "jung";
		names[4] = null;
		// @ 삭제: 당겨 채운다
//		int del = 0;
//		for(int i=del; i<names.length-1; ++i) { // 삭제할 번호부터 시작해서 쭉 당기기
//											  // 인접 요소를 당긴다
//			names[i] = names[i+1]; // "(i+1) < lenth"여야 하니까 for문의 범위에서 length 뒤에 -1을 해준 것 (요소범위 맞추기)
//			
//			//비효율적!(속도이슈가 생긴다) -> so, 실무에서는 사용하지 않눈당
//			//배열이 꽉 찬상태에서는 어떻게 되징? -> 마지막 값이 그 윗번호로 당겨진다 (마지막이 null이 되지 않음) 
//			// ㄴ-> 따로 처리해줘야 함 (names[names.length-1] = null;)
// 		}
//		// # 마지막 요소는 당겨올 요소가 없기 때문에 직접 처리한다.
//		names[names.length-1] = null;
		
		// @ 삽입: 밀어낸다 (추가= 끝에 붙인다 / 삽입=사이에 넣는다)
		// 배열이 꽉 찬 상태에서는 추가/삽입 불가능 (빈자리가 있어야 한당)
		// 데이터의 개수가 증가하는 것이기 때문에, 삽입 후 최대 길이가 넘치지 않는지 검사해야 한다. (if문으로!(수업중엔 안한댱))
		int ins = 2;
		for(int i=names.length-1; i > ins; --i) {  // 인접요소를 당긴다 -> 그냥 당기면 덮어써진당(주의) 
			 									 //** 큰 쪽에서 그 전 값을 당겨온다(뒤에서 당긴다)는 개념으로 생각해야 한다 **
												 //for(int i=ins; i<names.length-1; ++i) 
												 // names[i+1] = names[i]; 이렇게 하면 같은 값이 덮어 써짐 (방향주의)
			names[i] = names[i-1]; 
 		}
		// 삽입 저장
		names[ins]="new";
		
		for(int i=0; i<names.length;++i) { //for문 사용-> 모든 요소를 출력하겠다
			System.out.println(i+":"+names[i]); // 원래는 요기서 null체킹도 해야한당!
		}
		
 	}
	
	
	public static void main02(String[] args) {
		//@ 삭제 = null
		
		String[] names = new String[5];
		names[0] = "jangs";
		names[0] = null; // 지운다
		
	}
	
	
	public static void main01(String[] args) {
		// @ 클래스형(참조형) 배열 null
		String[] names = new String[5]; // 첫글자가 대문자로 표현되는 것-클래스형
		System.out.println( names ); // names는 1차배열 -> 배열명 조회 -> [Ljava.lang.String;@2a139a55
		System.out.println( names[0] ); // 기본형은 0으로, 참조형은 null로 초기화가 된다
		// null pointer : '없다' - 요소번호 범위와 요소값이 null인지 둘다 확인해야 한당
		
		if( names[0] !=null ) { //null cheaking
		names[0].charAt(0); // .을 찍을때 왼쪽에 있는게 null 값이면 에러
		}
		
	}

}
