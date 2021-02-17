package day0119;
/*
 * 형변환(type casting)
 * 형변환이랑 특정 값을 다른 데이터타입의 값으로 변환시키는 것을 말한다.
 * 
 * 형변환에는 암시적 형변환과 명시적 형변환 2가지 형변환이 있다.
 * 
 * 암시적 형변환(implicit type casting)
 * : 더 작은 데이터타입의 값을 더 큰 데이터타입으로 바꿀 때 발생한다.
 * 	 특별히 어떤 명령어를 적지 않아도 자동으로 자바가 변형시켜준다.
 * 
 * 명시적 형변환(explicit type casting)
 * : 더 큰 데이터타입의 값을 더 작은 데이터타입으로 바꿀 때 발생한다.
 * 	 데이터 손실이 발생되더라도 값의 데이터타입을 바꾸라고 명시해주어야 한다.
 *   명시적 형변환 -> 공간 = (바꿀 타입) 값;
 * 
 */
public class Ex03TypeCasting {
 public static void main(String[] args) {
	// 암시적 형변환
	// 더 작은 데이터타입의 값을 더 큰 데이터타입에 옮겨 담거나 정수 값을 실수로 바꿀 때 발생
	 
	 byte b = 3;
	 int number = b;
	 System.out.println("number의 현재값: "+number);
	 
	 double d = number;
	 System.out.println("d의 현재값: "+d);
	 
	 // 명시적 형변환
	 // 더 큰 데이터타입의 값을 더 작은 데이터타입에 옮겨 담거나 실수 값을 정수로 바꿀 때 발생
	 number = 10;
	 b = (byte)number;
	 System.out.println("b의 현재값: "+b);
	 
	 b = (byte)3.14;
	 System.out.println("b의 현재값: "+b);
	 
	 // 원래라면 오버플로우 언더플로우는 우리가 일반적인 방법으로는 발생시킬 수 없지만
	 // 형변환을 사용하면 우리가 오버플로우/언더플로우를 발생시킬 수 있다.
	 
	 // 1. 오버플로우
	 //  byte에 141를 넣으면?
	 b = (byte)141;
	 System.out.println("b의 현재값: "+b);
	 // 141 = 128+13
	 // byte 기준으로 128은 오버플로우가 발생해서 -128이 된다. 
	 // 따라서 141 = -128 + 13이 된다. 결과는 -115이다.
	 
	 // 2. 언더플로우
	 // byte에 -130을 넣으면?
	 // -130 = -129-1
	 //      = 127 -1
	 //      = 126
	 b = (byte)-130;
	 System.out.println("b의 현재값: "+b);
	 
	 
	 
 }
}
