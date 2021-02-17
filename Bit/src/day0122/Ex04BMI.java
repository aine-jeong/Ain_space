package day0122;
// BMI 계산기에 메뉴를 적용시켜 프로그램을 완성시키시오.

import java.util.Scanner;
public class Ex04BMI {
    // 사용자의 최대 키 값
    static final double MAX_HEIGHT = 2.72;
    // 사용자의 최대 몸무게 값
    static final double MAX_WEIGHT = 465;
    // 저체중 BMI 값
    static final double LOW_WEIGHT_BMI = 18;
    // 정상체중 BMI 값
    static final double NORMAL_WEIGHT_BMI = 23;
    // 과체중 BMI 값
    static final double OVER_WEIGHT_BMI = 25;
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double height = 0;
        double weight = 0;
       
        
        while(true) {
            System.out.println("==========================");
            System.out.println("1.입력 2.출력 3.종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            if(userChoice == 1) {
                System.out.println("키를 m 단위로 입력해 주세요.");
                System.out.print("> ");
                height = scanner.nextDouble();
                if(height <= 0 || height > MAX_HEIGHT) {
                    System.out.println("키를 잘못 입력하셨습니다.");
                    System.out.println("키를 m 단위로 입력해 주세요.");
                    System.out.print("> ");
                    height = scanner.nextDouble();
                }
                
                System.out.println("몸무게를 kg 단위로 입력해 주세요.");
                System.out.print("> ");
                weight = scanner.nextDouble();
                if(weight <= 0 || weight > MAX_WEIGHT) {
                    System.out.println("몸무게를 잘못 입력하셨습니다.");
                    System.out.println("몸무게를 kg 단위로 입력해 주세요.");
                    System.out.print("> ");
                    weight = scanner.nextDouble();
                }
                
            }else if(userChoice == 2) {
                
                if(weight == 0) {
                    // 아직 입력된 값이 없다 라는 의미이므로 경고메세지만 출력
                    System.out.println("아직 입력된 값이 없습니다.");
                } else {
                    double bmi = weight / height / height ;
                    System.out.printf("사용자의 BMI 수치는 %.3f 입니다. \n", bmi);
                    
                    if(bmi < LOW_WEIGHT_BMI) {
                        System.out.println("저체중입니다.");
                    }else if(bmi < NORMAL_WEIGHT_BMI) {
                        System.out.println("정상체중입니다.");
                    }else if(bmi < OVER_WEIGHT_BMI) {
                        System.out.println("과체중입니다.");
                    }else {
                        System.out.println("비만입니다.");
                    
                    }
                }
                
            }else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
            
        }
     
       scanner.close();
    }
}
