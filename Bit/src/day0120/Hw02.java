package day0120;
/*
 * 2. 사용자로부터 숫자 2개를 입력받아서 산술 연산한 결과값을 출력하는 프로그램을 작성하세요.
 * 
 */

import java.util.Scanner;

public class Hw02 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1번 숫자를 입력하세요.");
        int num1 = scanner.nextInt();
        
        System.out.println("2번 숫자를 입력하세요.");
        int num2 = scanner.nextInt();
        
        System.out.println("두 개의 값을 더한 결과: "+(num1+num2));
        System.out.println("첫번째 숫자에서 두번째 숫자를 뺀 결과: "+(num1-num2));
        System.out.println("첫번째 숫자에서 두번째 숫자를 나눈 결과: "+(num1/num2));
        // ->  System.out.println("a / b = " + ((double)a/(double)b));
        System.out.println("두 개의 값을 곱한 결과: "+(num1*num2));
        
        
        
        
        scanner.close();
        
    }

}
