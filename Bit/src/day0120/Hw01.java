package day0120;

/*
 * 1. 사용자로부터 키와 몸무게를 입력받아서 BMI 수치를 어느정도 형식에 맞추어 출력하시오.
 *    키는 m 단위로 받으셔야 합니다.
 */

import java.util.Scanner;
public class Hw01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("키를 m 단위로 입력해주세요: ");
        double height = scanner.nextDouble();
        
        System.out.print("몸무게를 kg 단위로 입력해주세요: ");
        double weight = scanner.nextDouble();
        
        double bmi = weight / height / height;
        
        System.out.printf("사용자의 BMI 수치는 %.3f 입니다. \n", bmi);
        
        
        scanner.close();
    }
    
    public static void main01(String[] args) {
        // 집에서 해온고
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("키를 입력하세요.");
        double height = scanner.nextDouble() * 0.01;
        
        System.out.println("몸무게를 입력하세요.");
        double weight = scanner.nextDouble();
        
        double BMI = weight / (height * height);
        System.out.println("BMI: "+BMI);
        
        
        scanner.close();
        
    }
}
