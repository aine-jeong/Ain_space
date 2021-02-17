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
//. 사용자로부터 점수를 입력받아서
//*      90점 이상: A
//*      80점대: B
//*      70점대: C
//*      60점대: D
//*      그 외: F
//*    가 출력되는 프로그램
//*/

import java.util.Scanner;
public class Hw02 {
    
    static final double GRADE_A_MIN = 90;
    static final double GRADE_B_MIN = 80;
    static final double GRADE_C_MIN = 70;
    static final double GRADE_D_MIN = 60;
    
    static final double MIN_SCORE_LIMIT = 0;
    static final double MAX_SCORE_LIMIT = 100;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("점수를 입력하세요.");
        double score = scanner.nextDouble();
        
        while (score<=MIN_SCORE_LIMIT || score>MAX_SCORE_LIMIT) {
            System.out.println("점수를 잘못 입력하셨습니다.");
            System.out.println(MIN_SCORE_LIMIT+"점~"+MAX_SCORE_LIMIT+"점 사이로 입력해주세요.");
            System.out.print("점수: ");
            score = scanner.nextDouble(); 
            }
            
          if(score>=GRADE_A_MIN) {
              System.out.println("등급: A");
          }else if(score >= GRADE_B_MIN) {
              System.out.println("등급: B");
          }else if(score >= GRADE_C_MIN) {
              System.out.println("등급: C");
          }else if(score >= GRADE_D_MIN) {
              System.out.println("등급: D");
          }else {
              System.out.println("등급: F");
          }
        
        scanner.close();
    }

}
