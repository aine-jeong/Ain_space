package day0122;

// 별찍기 하나의 for문으로 하는 방법

import java.util.Scanner;
public class StarPrinterIf08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 사용자 숫자 입력
        
        System.out.println("***********별찍기 8번***********");
        System.out.print("출력할 줄 수를 입력하세요: ");
        int userNumber = scanner.nextInt();
        
        // 총 입력 숫자 *2 -1 만큼의 줄 수가 입력됨을 의미
        for(int i = 1; i<= 2*userNumber-1; i++) {
            String stars = new String();
            
            
            if(i <= userNumber -1) {// 윗부분
            // userNumber이 5라고 가정했을때 i for문은 총 2*userNumber-번 반복된다. 
            // so, if를 userNumber-1 줄과 / userNumber줄로 나눠서 구조를 짜는 것!
                
                // 공백을 담당하는 j for문
                for(int j = 1; j <= userNumber-i; j++) {
                    stars += " ";
                }
                // 별을 담당하는 j for문
                for(int j =1; j <= i; j++) {
                    stars += "*";
                }
                
            }else { //아랫부분
             // i 가 userNumber부터 else로 들어온다.
             //  ㄴ>  편하계 계산하기 위해 변수를 하나 더 추가해줌!
                int lowerI = i - userNumber + 1;
                
                // 공백을 담당하는 j for문
                for(int j = 1; j <= lowerI -1; j++) {
                    stars += " ";
                }
                // 별을 담당하는 j for문
                for(int j = lowerI; j <= userNumber; j++) {
                    stars += "*";
                }
                
                
                
            }
            
            
            
            
            
            
            
            
            System.out.println(stars);
        }
        
        
        
        
        
        
        
        
        scanner.close();
        
        
   }//main end
}// class end
