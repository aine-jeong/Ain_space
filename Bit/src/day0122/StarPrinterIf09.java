package day0122;

import java.util.Scanner;
public class StarPrinterIf09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********별찍기 9번***********");
        System.out.print("출력할 줄 수를 입력하세요: ");
        int userNumber = scanner.nextInt();
        
        for(int i = 1; i <= userNumber*2 -1; i++) { // i: 1부터 9까지 (userNumber가 5일때)
            String stars = new String();
            
            if(i <= userNumber-1) { // i: 1,2,3,4
               // 공백
               for(int j=1; j <= userNumber-i; j++) {
                   stars += " ";
               }
               // *
               for(int j=1; j <= i*2-1; j++) {
                   stars += "*";
               }
            }else { // i: 5,6,7,8,9
                // 내가 썼던 식 ㅠ_ㅠ 식은 맞는데 너무 복잡하닷
//                int lowerI = i - userNumber +1 ; // lowerI는 1,2,3,4,5
//                //공백
//                for(int j =1; j <= lowerI-1; j++) {
//                    stars += " ";
//                }
//                //*
//                for(int j = 1; j <= (userNumber-lowerI)*2+1; j++) {
//                    stars += "*";
//                }
                // 선생님이 알려준 식
                 int lowerI = 2 * userNumber - i; // lowerI는 5,4,3,2,1
                 //공백
                 for(int j = 1; j <= userNumber - lowerI; j++) {
                     stars += " ";
                 }
                 //별
                 for(int j = 1; j <= 2*lowerI -1; j++) {
                     stars += "*";
                 }
                 
            }
            
            
           System.out.println(stars); 
            
        }
        
        
        
        
        scanner.close();
    }
}
