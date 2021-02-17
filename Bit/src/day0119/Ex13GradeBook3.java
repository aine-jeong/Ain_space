package day0119;
/*
 * 사용자로부터 번호, 이름, 국어, 영어, 수학 점수를 차례대로 입력받아 
 * <보기>처럼 출력될 수 있게 프로그램을 작성하시오.
 * 
 * <보기>
 * 번호: 002번 이름: 조재영
 * 국어: 004점 영어: 002점 수학: 001점
 * 총점: 007점 평균: 02.33점
 * 
 */
import java.util.Scanner;
public class Ex13GradeBook3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("번호를 입력하세요");
		int num = scanner.nextInt();
		System.out.println("이름을 입력하세요");
		scanner.nextLine();
		String name = scanner.nextLine();
		
		System.out.println("국어점수를 입력하세요");
		int korean = scanner.nextInt();
		System.out.println("영어점수를 입력하세요");
		int english = scanner.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = scanner.nextInt();
		
		int sum = korean+english+math;
		double average = sum / 3.0;
		
		System.out.printf("번호: %03d\n", num);
		System.out.printf("이름: %s\n", name);
		System.out.printf("국어: %03d점\n", korean);
		System.out.printf("영어: %03d점\n", english);
		System.out.printf("수학: %03d점\n", math);
		System.out.printf("총점: %03d점\n", sum);
		System.out.printf("평균: %05.2f점\n", average);
		
		
		scanner.close();
		
		
	}

}
