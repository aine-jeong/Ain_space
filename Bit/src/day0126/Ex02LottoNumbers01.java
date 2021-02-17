package day0126;
/*
 * 사용자로부터 로또 번호를 입력받는 프로그램
 * 단, 해당 번호가 중복이거나 1~45를 벗어나는 값이면
 * 다시 입력을 받도록 만드시오.
 * 
 */
import java.util.Scanner;
public class Ex02LottoNumbers01 {
    static final int SIZE = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lottoNumbers = new int[SIZE];
        
        for(int i = 0; i < lottoNumbers.length; i++) {
            System.out.print(i+"번째 숫자를 입력해주세요(1~45)> ");
            int userNumber = scanner.nextInt();
            
            
            while(userNumber<1 || userNumber>45) {
                System.out.print("1~45 사이의 숫자를 입력해 주세요> ");
                userNumber = scanner.nextInt();
            }
            
            
            for(int j = 0; j < lottoNumbers.length; j++) {
                if(lottoNumbers[j] == userNumber) {
                    System.out.println("중복되었습니다.");
                    System.out.print(i+"번째 숫자를 입력해주세요(1~45)> ");
                    userNumber = scanner.nextInt();
                    while(userNumber<1 || userNumber>45) {
                        System.out.print("1~45 사이의 숫자를 입력해 주세요> ");
                        userNumber = scanner.nextInt();
                    }
                    j = -1;
                }
            }
            
            lottoNumbers[i] = userNumber;
            
        }
            
            for(int i = 0; i <lottoNumbers.length -1; i++) {
                if(lottoNumbers[i] > lottoNumbers[i+1]) {
                    int temp = lottoNumbers[i];
                    lottoNumbers[i] = lottoNumbers[i+1];
                    lottoNumbers[i+1] = temp;
                    
                    i = -1;
                } 
            }
            
            System.out.print("입력하신 숫자: ");
            for(int i = 0; i < lottoNumbers.length; i++) {
                System.out.print(lottoNumbers[i]+"  ");
            }
           
           
        
        scanner.close();
    }

}
