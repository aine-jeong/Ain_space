package day0120;
//3. 사용자로부터 점수를 입력받아서
//*      90점 이상: A
//*      80점대: B
//*      70점대: C
//*      60점대: D
//*      그 외: F
//*    가 출력되는 프로그램
//*/

import java.util.Scanner;
public class Ex08IfElse4 {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

      // 풀어본 식
//      System.out.println("점수를 입력해주세요.");
//      double score = scanner.nextDouble();
//      
//      if(score>=90) {
//          System.out.println("A");
//      }else if(score<=80 && score>70) {
//          System.out.println("B");
//      }else if(score<=70 && score>60) {
//          System.out.println("C");
//      }else if(score<=60 && score>50) {
//          System.out.println("D");
//      }else {
//          System.out.println("F");
//      }
        
        System.out.println("점수를 입력해주세요: ");
        int score = scanner.nextInt();
        
        System.out.println("======1. 데이터 검증 안한 버전========");
        
        if(score >= 90) {
            System.out.println("A");
        }else if(score >= 80) {
            System.out.println("B");
        }else if(score >= 70) {
            System.out.println("C");
        }else if(score >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        
        System.out.println("================================");
        
        // 데이터 검증(vallidation)
        // 데이터 검증이란 사용자가 입력한 값이 올바른 값에 속하는지 체크하는 과정을 데이터 검증이라고 한다.
        // 데이터 검증을 하는 방법은 다양하지만
        // 우리는 그 중에서 정확한 범위를 통한 검증과 값이 올바른지 선 검증 후 결과실행 이라는 
        // 2가지 방법을 통해서 데이터 검증을 해 볼 것이다.
        
        //1. 조건식에 정확한 범위 넣기
        //   if문의 조건식에 우리가 A의 정확한 범위, B의 정확한 범위
        //   .... F의 정확한 범위까지 모두 설정하고
        //   그 외에는 잘못 입력하셨습니다. 라고 출력되게 만들어 준다.
        
        System.out.println("=====조건식에 정확한 범위 넣은 버전======");
        // 90 <= score <= 100  <-이렇게 못쓴당
        // true <= 100 이렇게 인식해서 불가능
        // 90 <= score && score <= 100 이렇게 써야댐
        
        if(score >= 90 && score <= 100) {
            System.out.println("A");
        }else if(score >= 80 && score < 90) { 
            // 범위를 전부 정확하게 잡아주지 않으면 원하는 결과가 나오지 않을 수 있음 주의
            System.out.println("B");
        }else if(score >= 70 && score < 80) { 
            System.out.println("C");
        }else if(score >= 60 && score < 70) { 
            System.out.println("D");
        }else if(score >= 0 && score < 60) { 
            System.out.println("F");
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }
        
        
        
        System.out.println("================================");
        
        System.out.println("=======입력값 선검중 후 진행하기=======");
        
        if(score >= 0 && score <= 100) {
            // 올바른 범위이므로 출력 시작
            
            if(score >= 90) {
                System.out.println("A");
            }else if(score >= 80) {
                System.out.println("B");
            }else if(score >= 70) {
                System.out.println("C");
            }else if(score >= 60) {
                System.out.println("D");
            }else {
                System.out.println("F");
            }
            
            
        }else {
            System.out.println("잘못된 정수의 형태입니다.");
        }
        
        
        System.out.println("================================");
        scanner.close();
    }
}












