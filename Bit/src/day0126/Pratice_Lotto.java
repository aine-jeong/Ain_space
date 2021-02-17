package day0126;
/*
 * 로또번호 제작기 최종단계
 * 컴퓨터가 뽑은 숫자 6개 vs 내가 뽑은 숫자 6개
 * 1등: 번호 6개
 * 2등: 번호 5개
 * 3등: 번호 4개
 * 4등: 번호 3개
 * 5등: 번호 2개
 * 
 * 컴퓨터가 뽑은 숫자 6개 중에서 내가 뽑은 숫자가 몇개가 일치하는지 확인하고 등수를 표시하도록 합니다.
 * 
 * 예시:
 * 컴퓨터의 숫자: [2, 4, 27, 33, 41, 45]
 * 내 숫자: [1, 2, 3, 4, 5, 6]
 * 내 등수: 5등
 */
import java.util.Scanner;
import java.util.Random;
public class Pratice_Lotto {
    static final int SIZE = 6;
    static final int MAX = 45;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int[] userNum = new int[SIZE];
        int[] comNum = new int[SIZE];
        
        // 내가 입력한 숫자 6개 배열에 넣기
        for(int i = 0; i < userNum.length; i++) {
        System.out.println(i+"번째 숫자를 입력하세요.(1~45)");
        System.out.print("> ");
        int num = scanner.nextInt();
        
        // 범위 확인
        while(num < 0 || num > MAX) {
            System.out.println("1부터 45사이의 숫자를 입력하셔야 합니다.");
            System.out.println(i+"번째 숫자를 입력하세요.(1~45)");
            System.out.print("> ");
            num = scanner.nextInt();
        }
        
        // 중복 확인
        for(int j = 0; j < userNum.length; j++) {
           if(userNum[j] == num) {
               System.out.println("이미 입력된 숫자입니다.");
               System.out.println(i+"번째 숫자를 입력하세요.(1~45)");
               System.out.print("> ");
               
               while(num < 0 || num > MAX) {
                   System.out.println("1부터 45사이의 숫자를 입력하셔야 합니다.");
                   System.out.println(i+"번째 숫자를 입력하세요.(1~45)");
                   System.out.print("> ");
                   num = scanner.nextInt();
               }
               num = scanner.nextInt();
           }
        }
        
        userNum[i] = num;
        // 배열시키기(오름차순)
        
        }
        for(int i = 0; i < userNum.length; i++) {
            System.out.println(i+"번째숫자: "+userNum[i]);
        }
        
        // 컴퓨터가 입력한 숫자 6개 배열에 넣기.
        
        
        // 배열끼리 비교해서 일치하는 개수 확인하고 등수 표시하기
        
        
        scanner.close();
    }

}
