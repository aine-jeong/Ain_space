package day0121;
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

import java.util.Scanner;

public class Hw03 {
    
    static final int MAX_SCORE_LIMIT = 100;
    static final int MIN_SCORE_LIMIT = 0;
    
    // 추가해 준 부분
    // 과목 수를 상수로 선언 (인트로 선언 후 사용할 때 필요에 따라 형변환)
    static final int NUMBER_OF_SUBJECT = 3;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("번호: ");
        int number = scanner.nextInt();
        
        System.out.print("이름: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        
        System.out.print("국어 점수: ");
        int korean = scanner.nextInt();
        while(korean>MAX_SCORE_LIMIT || korean < MIN_SCORE_LIMIT) {
            System.out.println("국어 점수를 잘못 입력하셨습니다.");
            System.out.println(MIN_SCORE_LIMIT+"~"+MAX_SCORE_LIMIT+"사이의 점수로 입력해주세요.");
            System.out.print("국어 점수: ");
            korean = scanner.nextInt();
        }
        
        System.out.print("영어 점수: ");
        int english = scanner.nextInt();
        while(english>MAX_SCORE_LIMIT || english < MIN_SCORE_LIMIT) {
            System.out.println("영어 점수를 잘못 입력하셨습니다.");
            System.out.println(MIN_SCORE_LIMIT+"~"+MAX_SCORE_LIMIT+"사이의 점수로 입력해주세요.");
            System.out.print("영어 점수: ");
            english = scanner.nextInt();
        }
        
        System.out.print("수학 점수: ");
        int math = scanner.nextInt();
        while(math>MAX_SCORE_LIMIT || math < MIN_SCORE_LIMIT) {
            System.out.println("수학 점수를 잘못 입력하셨습니다.");
            System.out.println(MIN_SCORE_LIMIT+"~"+MAX_SCORE_LIMIT+"사이의 점수로 입력해주세요.");
            System.out.print("수학 점수: ");
            math = scanner.nextInt();
        }
        
        int sum = korean+english+math;
        double average = sum / (double)NUMBER_OF_SUBJECT;
        
        System.out.printf("번호: %03d번 ", number);
        System.out.printf("이름: %s\n", name);
        System.out.printf("국어: %03d점 ", korean);
        System.out.printf("영어: %03d점 ", english);
        System.out.printf("수학: %03d점\n", math);
        System.out.printf("총점: %03d점 ", sum);
        System.out.printf("평균: %05.2f점\n", average);
        
        
        
        
        scanner.close();
    }
    
}
