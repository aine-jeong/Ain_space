package day0120;
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

/* BMI 18.5 미만: 저체중
*     23   미만: 정상체중
*     25   미만: 과체중
*     그외: 비만
*     
* BMI 계산 방법은 몸무게 / 키 / 키 입니다. (키는 m 단위)
* 기네스북에 따르면 세계에서 가장 키가 컸던 사람은 2.72m 였습니다.
* 기네스북에 따르면 세계에서 가장 무거웠던 사람은 465kg 이였습니다.
*/ 

import java.util.Scanner;


public class Hw001 {
    
    static final double MIN_HEIGHT_LIMIT = 0;
    static final double MAX_HEIGHT_LIMIT = 2.72;
    
    static final double MIN_WEIGHT_LIMIT = 0;
    static final double MAX_WEIGHT_LIMIT = 465;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("키를 m 단위로 입력하세요.");
        double height = scanner.nextDouble();
        
        while(height >= MAX_HEIGHT_LIMIT || height <= MIN_HEIGHT_LIMIT) {
            System.out.println("키를 잘못 입력하셨습니다.");
            System.out.println("키를 m 단위로 입력하세요.");
            height = scanner.nextDouble();
        }
        
        System.out.println("몸무게를 kg 단위로 입력하세요.");
        double weight = scanner. nextDouble();
        
        while(weight >= MAX_WEIGHT_LIMIT || weight <= MIN_WEIGHT_LIMIT) {
            System.out.println("몸무게를 잘못 입력하셨습니다.");
            System.out.println("몸무게를 kg 단위로 입력하세요.");
            weight = scanner.nextDouble();
        }
        
        double bmi = weight / height / height ;
        
        System.out.printf("사용자의 BMI 수치는 %.3f 입니다. \n", bmi);
        
        if(bmi < 18.5) {
            System.out.println("저체중입니다.");
        }else if(bmi < 23) {
            System.out.println("정상체중입니다.");
        }else if(bmi < 25) {
            System.out.println("과체중입니다.");
        }else {
            System.out.println("비만입니다.");
        }
    
    
    scanner.close();
    }

}






