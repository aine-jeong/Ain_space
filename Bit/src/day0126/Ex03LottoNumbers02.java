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
public class Ex03LottoNumbers02 {
    static final int SIZE = 6;
    static final int MAX = 45;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        
        
        //-----------------내 숫자: []부분-----------------
        int[] userArray = new int[SIZE];
        
        for(int i = 0; i < userArray.length; i++) {
            System.out.print(i+"번째 숫자를 입력해주세요(1~45)> ");
            int userNumber = scanner.nextInt();
            
            
            while(userNumber<1 || userNumber>45) {
                System.out.print("1~45 사이의 숫자를 입력해 주세요> ");
                userNumber = scanner.nextInt();
            }
            
            
            for(int j = 0; j < userArray.length; j++) {
                if(userArray[j] == userNumber) {
                    System.out.println("중복된 숫자입니다.");
                    System.out.print(i+"번째 숫자를 입력해주세요(1~45)> ");
                    userNumber = scanner.nextInt();
                    while(userNumber<1 || userNumber>45) {
                        System.out.print("1~45 사이의 숫자를 입력해 주세요> ");
                        userNumber = scanner.nextInt();
                    }
                    j = -1;
                }
            }
            
            userArray[i] = userNumber;
            
        }
            
            for(int i = 0; i <userArray.length -1; i++) {
                if(userArray[i] > userArray[i+1]) {
                    int temp = userArray[i];
                    userArray[i] = userArray[i+1];
                    userArray[i+1] = temp;
                    
                    i = -1;
                } 
            }
            
            System.out.print("내 숫자: [");
            for(int i = 0; i < userArray.length-1; i++) {
                System.out.print(userArray[i]+",  ");
            }
            System.out.print(userArray[userArray.length -1]);
            System.out.println("]");
            
            
         // ----------컴퓨터의 숫자: [] 부분 -----------------
            int[] computerArray = new int[SIZE]; // 컴퓨터의 로또번호를 저장할 배열
            
            for(int i = 0; i < computerArray.length; i++) {
                int randomNumber = random.nextInt(MAX)+1;
               
                //randomNumber가 중복인지 확인하여 중복이면 다시 만들고 다시 검사하는 j for문
                for(int j = 0; j < computerArray.length; j++) {
                    if(computerArray[j] == randomNumber) {
                        randomNumber = random.nextInt(MAX)+1;
                        j = -1;
                    }
                }
                //j for문이 종료되었다 = 중복없음 -> i번째를 randomNumber로 초기화해준다.
                computerArray[i] = randomNumber;
            }
            
            
            
            for(int i = 0; i <computerArray.length -1; i++) {
                if(computerArray[i] > computerArray[i+1]) {
                    int temp = computerArray[i];
                    computerArray[i] = computerArray[i+1];
                    computerArray[i+1] = temp;
                    
                    i = -1;
                } 
            }
            
            System.out.print("컴퓨터의 숫자: [");
            for(int i = 0; i < computerArray.length -1; i++) {
                System.out.print(computerArray[i]+", ");
            }
            System.out.print(computerArray[computerArray.length -1]);
            System.out.println("]");
            //----------------------------------------------
            
            
            // 컴퓨터의 숫자와 내숫자를 비교해서 등수 뽑아내기
            int correct = 0;
            for(int i = 0; i < computerArray.length; i++) {// 컴퓨터 로또 번호 배열의 0번부터 5번까지
                for(int j = 0; j < userArray.length; j++) {//내 로또 번호 배열의 0번부터 5번까지와
                    if(computerArray[i] == userArray[j]) {
                        correct++;
                    }
                }
            }
            
            System.out.println("맞은 숫자: "+correct);
            System.out.print("내 등수: ");
            if(correct == 2) {
                System.out.println("5등");
            }else if(correct == 3) {
                System.out.println("4등");
            }else if(correct == 4) {
                System.out.println("3등");
            }else if(correct == 5) {
                System.out.println("2등");
            }else if(correct == 6) {
                System.out.println("1등");
            }else {
                System.out.println("꽝");
            }
            
            // - 해야할 일: 컴퓨터에서 중복 숫자 나오는 경우 없애기 *
            
        
        
        
        scanner.close();
    }
}
