package day0120;

/*
 * 사용자로부터 "자연수"만 입력받는 프로그램.
 * 만약 사용자가 자연수가 아닌 숫자를 입력하면?
 * 자연수를 입력할 때까지 다시 입력을 받는다.
 * 
 */

import java.util.Scanner;
public class ExWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("자연수를 입력하세요: ");
        int number = scanner.nextInt();
        
        
        while(number < 0) {
            System.out.println("자연수가 아닙니다. 다시 입력해주세요.");
            System.out.println("자연수를 입력하세요: ");
            number = scanner.nextInt();
        }

        System.out.println("사용자가 입력한 자연수: "+number);
        
        
        scanner.close();
    }
/*
 * 숙제: 1. BMI 계산기를 만들어서 사용자의 BMI 수치와 현재 체중 상태를 출력하는 프로그램을 작성하세요.
 *         단 사용자가 잘못된 키나 몸무게를 입력하면 올바른 키나 값을 입력할 때까지 다시 입력을 받는 프로그램을 만드세요.
 *      2. 사용자로부터 점수를 입력받아 A, B, C, D, F 를 출력하는 프로그램을 작성하세요.
 *         단 잘못된 점수가 입력되면 올바른 점수가 입력될 때까지 다시 입력을 받으세요.
 *      3. 사용자가 번호, 이름, 국어, 영어, 수학 점수를 입력하면 예쁘게 출력하는 프로그램을 작성하세요.
 *         단 사용자가 잘못된 형태의 점수를 입력하면 올바른 형태의 점수를 입력할 때까지 다시 입력을 받는 프로그램을 만드세요.
 *      예시) 
 *      번호: 002번 이름: 조재영
 *      국어: 004점 영어: 002점 수학: 001점
 *      총점: 007점 평균: 02.33점
 *      
 *      >> 심화: 모든 숙제에 대해 하드 코딩이 아닌 소프트 코딩을 적용시키세요. <<
 *      
 */
}







