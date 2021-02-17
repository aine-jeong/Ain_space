package day0122;

import java.util.Scanner;
public class Practice_StarPrinterIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("숫자를 입력해주세요: ");
        int userNumber = scanner.nextInt();
        
        for(int i = 1; i <= 2*userNumber-1; i++) { // 출력할 줄 수
                                        //(userNumber가 5일때) i 는 1부터 9까지 
            String stars = new String();
            
            int totalWidth = 2*userNumber-1;
            if(i == 1 || i == 2*userNumber-1) { // 첫줄과 끝줄 별 출력부분
                for(int j = 1; j <= 2*userNumber-1; j++) {
                    stars += "*";
                }
                
            }else if(i <= userNumber-1) { // 위쪽 출력 부분
                                //(userNumber가 5일때) i는 2,3,4
                int starsWidth = userNumber-i+1;
                
                // 왼쪽 별 -> (userNumber가 5일때) 4,3,2
                for(int j = 1; j <= starsWidth; j++) {
                    stars += "*";
                }
                // 공백 ->(userNumber가 5일때) 1,3,5
                for(int j = 1; j <= totalWidth-starsWidth*2; j++) {
                    stars += " ";
                }
                // 오른쪽 별 -> 왼쪽 별과 같다
                for(int j = 1; j <= starsWidth; j++) {
                    stars += "*";
                }
                
            }else if (i < 2*userNumber-1){ // 아래쪽 출력 부분
                                    // (userNumber가 5일때) i는 5,6,7,8
                                    // ㄴ> i를 1,2,3,4 로 만들어보쟈
                int lowerI = i-userNumber+1; // lowerI는 1,2,3,4
                // 별의 너비는 1,2,3,4 가 되어야 한다. 즉, lowerI와 같으므로 선언하지 않음
                
                // 왼쪽 별 -> (userNumber가 5일때) 1,2,3,4
                for(int j = 1; j <= lowerI; j++) {
                    stars += "*";
                }
                // 공백 -> (userNumber가 5일때) 7,5,3,1이 되어야 한다.
                for(int j = 1; j <= totalWidth-(lowerI*2); j++) {
                    stars += " ";
                }
                // 오른쪽 별 -> 왼쪽 별과 같다.
                for(int j = 1; j <= lowerI; j++) {
                    stars += "*";
                }
                
            }
            
            System.out.println(stars);
            
        }
        
        
        
        
        
        
        
        
        
        scanner.close();
        
        
    }
    
}
