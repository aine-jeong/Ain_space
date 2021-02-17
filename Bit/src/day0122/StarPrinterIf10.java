package day0122;

import java.util.Scanner;
public class StarPrinterIf10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********별찍기 10번***********");
        System.out.print("출력할 줄 수를 입력하세요: ");
        int userNumber = scanner.nextInt();
        
        for(int i = 0; i < 2*userNumber-1; i++) {//i: 0~8 (userNumber가 5일때)
            String stars = new String();
            
            if(i<userNumber-1) { // i: 0,1,2,3
                // 앞 *
                for(int j = 1; j <= userNumber-i; j++) {
                    stars += "*";
                }
                // 공백
                for(int j = 1; j <= i*2-1; j++) {
                    stars += " ";
                }
                // 뒤 *
                for(int j = 1; j <= userNumber-i-1; j++) {
                    stars += "*";
                }
                // 첫줄 빼고 * 하나씩 더 추가하도록 작성
                if(i!=0) {
                    stars += "*";
                }
            }else { 
                int lowerI = userNumber-i+3; // i는 4,5,6,7,8
                                           // lowerI는 5,4,3,2,1
                
               // 앞 *
               for(int j = 1; j <= userNumber-lowerI; j++) {
                   stars += "*";
               }
               // 공백
               for(int j = 1; j <= lowerI*2-1; j++) {
                   stars += " ";
               }
               // 뒤 *
               for(int j = 1; j <= userNumber-lowerI-1; j++) {
                   stars += "*";
               }
               // 마지막줄 빼고 * 하나씩 더 추가하도록 작성
               if(i != userNumber+(userNumber-3)) {
                   stars += "*";
               }
                
            }
            
            
            
            
            
            System.out.println(stars);
        }
        
       
        scanner.close();
    }
}
