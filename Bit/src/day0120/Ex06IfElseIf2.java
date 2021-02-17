package day0120;

/*
 * 1. 사용자로부터 숫자를 입력받아서 해당 숫자가 
 *    한자리, 두자리, 세자리, 네자리 이상의 숫자 중 어떤 것인지 보여주는 프로그램
 *    
 * 2. 사용자로부터 나이를 입력받아서
 *      ~5: 영아
 *      ~13: 어린이
 *      ~18: 청소년
 *      19~: 성인
 *     이 출력되는 프로그램
 *     
 * 3. 사용자로부터 점수를 입력받아서
 *      90점 이상: A
 *      80점대: B
 *      70점대: C
 *      60점대: D
 *      그 외: F
 *    가 출력되는 프로그램
 */

import java.util.Scanner;
public class Ex06IfElseIf2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //1. 사용자로부터 숫자를 입력받아서 해당 숫자가 
        //   한자리, 두자리, 세자리, 네자리 이상의 숫자 중 어떤 것인지 보여주는 프로그램
        
        System.out.println("숫자를 입력해주세요.");
        int num = scanner.nextInt();
        
        if(num/1000 > 0) {
            System.out.println("4자리 이상의 숫자입니다.");
        }else if(num/100 > 0) {
            System.out.println("3자리 숫자입니다.");
        }else if(num/10 > 0) {
            System.out.println("2자리 숫자입니다.");
        }else {
            System.out.println("1자리 숫자입니다.");
        }
        
        // 선생님 답안!!
        
//        if(num<10) {
//            System.out.println("1자리 숫자입니다.");
//        }else if(num<100) {
//            System.out.println("2자리 숫자입니다.");
//        }else if(num<1000) {
//            System.out.println("3자리 숫자입니다.");
//        }else {
//            System.out.println("4자리 이상의 숫자입니다.");
//        } 
        
        
        System.out.println("==============");
//        2. 사용자로부터 나이를 입력받아서
//        *      ~5: 영아
//        *      ~13: 어린이
//        *      ~18: 청소년
//        *      19~: 성인
//        *     이 출력되는 프로그램
        
        System.out.println("나이를 입력해 주세요.");
        int age = scanner.nextInt();
        
        if(age >= 19) {
            System.out.println("성인입니다.");
        }else if(age<19 && age>13) {
            System.out.println("청소년입니다.");
        }else if(age<=13 && age>5) {
            System.out.println("어린이입니다.");
        }else {
            System.out.println("청소년입니다.");
        }
        
        
        System.out.println("==============");
        
//        3. 사용자로부터 점수를 입력받아서
//        *      90점 이상: A
//        *      80점대: B
//        *      70점대: C
//        *      60점대: D
//        *      그 외: F
//        *    가 출력되는 프로그램
//        */
        
        System.out.println("점수를 입력해주세요.");
        double score = scanner.nextDouble();
        
        if(score>=90) {
            System.out.println("A");
        }else if(score<=80 && score>70) {
            System.out.println("B");
        }else if(score<=70 && score>60) {
            System.out.println("C");
        }else if(score<=60 && score>50) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        
        scanner.close();
    }

}

















