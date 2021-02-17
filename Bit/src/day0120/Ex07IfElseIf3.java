package day0120;
/*
* 2. 사용자로부터 나이를 입력받아서
*      ~5: 영아
*      ~13: 어린이
*      ~18: 청소년
*      19~: 성인
*     이 출력되는 프로그램
*     
*/

import java.util.Scanner;
public class Ex07IfElseIf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 풀어본 식!
//        System.out.println("나이를 입력해 주세요.");
//        int age = scanner.nextInt();
//        
//        if(age >= 19) {
//            System.out.println("성인입니다.");
//        }else if(age<19 && age>13) {
//            System.out.println("청소년입니다.");
//        }else if(age<=13 && age>5) {
//            System.out.println("어린이입니다.");
//        }else {
//            System.out.println("청소년입니다.");
//        }
        // 선생님 식대로 하면 식이 더 깔끔해보인댜........!!
        
        System.out.print("나이: ");
        int age = scanner.nextInt();
        
        if(age <= 5) {
            System.out.println("영아입니다.");
        }else if(age <= 13) {
            System.out.println("어린이입니다.");
        }else if(age <= 18) {
            System.out.println("청소년입니다.");
        }else {
            System.out.println("성인입니다.");
        }
        
        scanner.close();
       
    }

}












