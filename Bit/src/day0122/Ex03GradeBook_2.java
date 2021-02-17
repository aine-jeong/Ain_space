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
public class Ex03GradeBook_2 {
    
    // 평균을 위한 과목 수
    static final int SUBJECT_SIZE = 3;
    // 입력 옵션값
    static final int OPTION_INSERT = 1;
    // 출력 옵션값
    static final int OPTION_PRINT = 2;
    // 종료 옵션값
    static final int OPTION_END = 3;
    // 최대 점수값
    static final int MAX_SCORE = 100;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
         int id = 0;
         String name = new String();
         int korean = 0;
         int english = 0;
         int math = 0;
        
        
        
        while(true) {
            System.out.println("1.입력 2.출력 3.종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            if(userChoice == OPTION_INSERT ) {
                
                System.out.print("번호: ");
                id = scanner.nextInt();
                System.out.print("이름: ");
                scanner.nextLine();
                name = scanner.nextLine();
                
                System.out.print("국어: ");
                korean = scanner.nextInt();
                while(korean < 0 || korean > MAX_SCORE) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("국어: ");
                    korean = scanner.nextInt();
                }
                
                System.out.print("영어: ");
                english = scanner.nextInt();
                while(english < 0 || english > MAX_SCORE) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("영어: ");
                    english = scanner.nextInt();
                }
                
                System.out.print("수학: ");
                math = scanner.nextInt();
                while(math < 0 || math > MAX_SCORE) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("수학: ");
                    math = scanner.nextInt();
                }
                
            }else if(userChoice == OPTION_PRINT) {
                
                int sum = korean + english + math;
                double average = (double)sum / SUBJECT_SIZE;
                
                System.out.printf("번호: %03d번 이름: %s \n", id, name);
                System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점 \n", korean, english, math);
                System.out.printf("총점: %03d점 평균: %.2f점 \n", sum, average);
                
            }else if(userChoice == OPTION_END) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
            
        }
       
        
        
        
        
        scanner.close();
    }
    
}