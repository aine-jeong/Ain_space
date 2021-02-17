package day0121;
/*
 * 1. 1부터 10까지 출력되는 for문을 작성하시오
 * 2. 8부터 3까지 출력되는 for문을 작성하시오
 * 3. 사용자로부터 시작 숫자와 끝 숫자를 입력 받아서 그 숫자들을 차례대로 출력하시오
 * 4. 사용자로부터 숫자를 하나 입력 받아서 1부터 그 수까지의 홀수들만 출력하시오
 * 5. 사용자로부터 숫자를 하나 입력받아서 1부터 그 수까지의 합을 구하시오
 * 6. 사용자로부터 숫자를 하나 입력받아서 1부터 그 수까지의 곱을 구하시오
 * 
 * 힌트: 5번과 6번은 변수의 선언 위치를 고민해보시오
 * 
 */
import java.util.Scanner;
public class Ex02For2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1부터 10까지 출력되는 for문
		System.out.println("===1번 문제===");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("i의 값: "+i);
		}
		
		//2. 8부터 3까지 출력되는 for문을 작성하시오
		System.out.println("===2번 문제===");
		for(int i = 8; i >= 3; i--) {
			System.out.println("i의 값: "+i);
		}
		
		//3. 사용자로부터 시작 숫자와 끝 숫자를 입력 받아서 그 숫자들을 차례대로 출력하시오
			System.out.println("===3번 문제===");
		
		System.out.print("시작숫자: ");
		int start = scanner.nextInt();
		
		System.out.print("끝 숫자: ");
		int end = scanner.nextInt();
		
		if(start <= end) {
			for(int i = start; i <= end; i++) {
				System.out.println("i의 값: "+i);
			}
				
			
		}else {
			for(int i = start; i >= end; i--) {
				System.out.println("i의 값: "+i);
			}
		}
		
		
		//4. 사용자로부터 숫자를 하나 입력 받아서 1부터 그 수까지의 홀수들만 출력하시오
			System.out.println("===4번 문제===");
		
		System.out.println("숫자를 하나 입력해주세요.");
		int num = scanner.nextInt();
		
		for(int i = 1; i <= num; i += 2) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
		
		//5. 사용자로부터 숫자를 하나 입력받아서 1부터 그 수까지의 합을 구하시오
			System.out.println("===5번 문제===");
			
		System.out.println("숫자를 하나 입력해주세요.");
		end = scanner.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= end; i++) {
			sum += i;
		}
		
		System.out.println("1부터 "+end+"까지 더한 값은: "+sum);
		// System.out.printf("1부터 %d 까지의 합: %d\n", end, sum);
		
		//6. 사용자로부터 숫자를 하나 입력받아서 1부터 그 수까지의 곱을 구하시오
			System.out.println("===6번 문제===");
			
		System.out.println("숫자를 하나 입력해주세요.");
		end = scanner.nextInt();
		int factorial = 1;
		
		// 오버플로우 발생 가능성 있음! (13이후로 부정확한 값이 나옴)
		// 그래서 if문 추가
		if(end >= 13) {
			System.out.println("오버플로우가 발생하여 정확한 결과를 출력할 수 없습니다.");
		}else {
		
			for(int i = 1; i <= end; i++) {
				factorial *= i;
			}
			
			System.out.println("1부터 "+end+"까지 곱한 값은: "+factorial);
		}
		
		
			
		
		
		
		scanner.close();
	}

}
