package day0119;
/*
 * 이름, 나이, 국어, 영어, 수학, 총점, 평균, 졸업 여부에 해당하는 변수를 각각 만들어주고
 * 해당 변수들을 올바른 값으로 초기화해서 전부 다 출력하는 프로그램을 작성하라
 * 
 */

public class Ex08Gradebook {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 17;
		
		int Korean = 80;
		int English = 79;
		int Math = 79;
		
		int sum = Korean+English+Math;
		double Average = sum / 3.0;
		
		boolean isGraduated=true;
		
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("국어: "+Korean);
		System.out.println("영어: "+English);
		System.out.println("수학: "+Math);
		System.out.println("총점: "+sum);
		System.out.println("평균: "+Average);
		System.out.println("졸업 여부: "+isGraduated);
		
		
	}

}
