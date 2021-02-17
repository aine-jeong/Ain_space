package day0122;
// 사용자로부터 번호, 이름, 국어, 영어, 수학 점수를 입력받아서 예쁘게 출력하는 프로그램
// 단, 사용자가 메뉴에서 1이라고 입력할 때마다 새로운 정보를 입력할 수 있어야 한다.
// 또한 사용자가 메뉴에서 2라고 입력할때마다 입력된 정보를 출쳑할 수 있어야 한다.
// 만약 사용자가 메뉴에서 3이라고 입력하면 프로그램은 종료된다.


// 사용자가 번호, 이름, 국어, 영어, 수학 점수를 입력하면 예쁘게 출력하는 프로그램을 작성하세요.
//   단 사용자가 잘못된 형태의 점수를 입력하면 올바른 형태의 점수를 입력할 때까지 다시 입력을 받는 프로그램을 만드세요.
//   예시) 
//   번호: 002번 이름: 조재영
//   국어: 004점 영어: 002점 수학: 001점
//   총점: 007점 평균: 02.33점

import java.util.Scanner;
public class Ex03Gradebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = 0;
        String name = new String();
        int korean = 0;
        int english = 0;
        int math = 0;
        int sum = 0;
        double average = 0;
        
        while(true) {
            System.out.println("======================");
            System.out.println("사용하실 메뉴의 번호를 입력해주세요.");
            System.out.println("1.성적입력 2.성적출력 3.종료");
            int userChoice = scanner.nextInt();
            
            if(userChoice == 1) {
                // 입력하는 코드 구현
                System.out.print("번호: ");
                number = scanner.nextInt();
                
                System.out.print("이름: ");
                scanner.nextLine();
                name = scanner.nextLine();
                
                while(true) {
                    System.out.println("======================");
                System.out.println("어떤 과목의 성적을 입력하시겠습니까?");
                System.out.println("1.국어 2.영어 3.수학 4.입력완료");
                int classChoice = scanner.nextInt();
                
                if(classChoice == 1) {
                    System.out.print("점수: ");
                    korean = scanner.nextInt();
                    
                } else if(classChoice == 2) {
                    System.out.print("점수: ");
                    english = scanner.nextInt();
                    
                } else if(classChoice == 3) {
                    System.out.print("점수: ");
                    math = scanner.nextInt();
                 } else if(classChoice == 4) {
                     System.out.println("점수 입력이 완료되었습니다.");
                     break;
                 }
                }
                
                sum = korean+english+math;
                average = sum / 3;
                
                
            }else if(userChoice == 2) {
                // 출력하는 코드 구현
                System.out.println("======================");
                System.out.printf("번호: %03d번 ", number);
                System.out.printf("이름: %s\n", name);
                System.out.printf("국어: %03d점 ", korean);
                System.out.printf("영어: %03d점 ", english);
                System.out.printf("수학: %03d점\n", math);
                System.out.printf("총점: %03d점 ", sum);
                System.out.printf("평균: %05.2f점\n", average);
                System.out.println("======================");
             
            }else if(userChoice == 3) {
                System.out.println("사용해 주셔서 감사합니다.");
                break;
            }
            
      
            
        }
     
        
        scanner.close();
    }

}
