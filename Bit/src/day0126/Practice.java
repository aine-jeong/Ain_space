package day0126;
/*
 * 1. 컴퓨터가 3자리 중복없는 정수를 랜덤으로 뽑아놓은 뒤
 * 2. 사용자에게 3자리 중복없는 정수를 입력받고
 * (만약 범위를 다르게 입력한다면 다시 입력하라는 문구 출력)
 * 3. 사용자의 입력값과 컴퓨터의 랜덤값을 비교
 * 4. Strike와 Ball의 개수 사용자에게 알려주기
 * 
 * 5. 만약 정답이 아니라면,
 * 6. 사용자는 S와B의 수를 보고 유추하여 답 확인
 * 7. 2~4 반복
 * 
 * 8. 만약 정답이라면 "정답!" 출력하기 

 * 규칙:
 * 자릿수와 숫자가 모두 일치하면 Strike
 * 숫자만 맞추고 자릿수는 다르다면 Ball
 * 만약 자릿수와 숫자 모두 틀렸다면 아무것도 아님
 * (3Strike = 정답)
 * 
 */
import java.util.Random;
import java.util.Scanner;


public class Practice {
    static final int MAX = 999-101;
    static final int MIN = 102;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int score = 0; // 점수 변수
        
        // -------컴퓨터가 3자리 중복 없는 정수를 랜덤으로 뽑는 부분---------
        int comUnit;
        int comTens;
        int comHuns;
        
        int comNum = random.nextInt(MAX)+MIN; // 102부터 999까지 정수난수 출력
        // 각 자리의 중복값을 없애기!
        comHuns = comNum / 100;
        comTens = (comNum-comHuns*100) / 10;
        comUnit = comNum-(comHuns*100)-(comTens*10);
        
        while(comUnit == comTens || comUnit == comHuns || comTens == comHuns) {
            comNum = random.nextInt(MAX)+102;
            comHuns = comNum / 100;
            comTens = (comNum-comHuns*100) / 10;
            comUnit = comNum-(comHuns*100)-(comTens*10);
        }
        
//          System.out.println(comNum);
//        System.out.println("1의 자리: "+unit);
//        System.out.println("10의 자리: "+tens);
//        System.out.println("100의 자리: "+hundreds);
        //--------------------------------------------------------
       
        //------------사용자에게 3자리 중복 없는 정수를 입력받는 부분----------
        System.out.print("각 자리에 중복이 없는 3자리의 숫자를 입력하세요> ");
        int userNum = scanner.nextInt();
        int userUnit; // 사용자가 입력한 값의 1의 자리
        int userTens; // 사용자가 입력한 값의 10의 자리
        int userHuns; // 사용자가 입력한 값의 100의 자리
        // 사용자가 입력한 값의 각 자리에 중복값이 없는지 확인하는 코드
        userHuns = userNum / 100;
        userTens = (userNum-userHuns*100) / 10;
        userUnit = userNum-(userHuns*100)-(userTens*10);
        
        
        while(userNum<100 || userNum>MAX) {
            System.out.println("범위가 초과되었습니다.");
            System.out.print("각 자리에 중복이 없는 3자리의 숫자를 입력하세요> ");
            userNum = scanner.nextInt();
        }
        
        while(userUnit == userTens || userUnit == userHuns || userTens == userHuns) {
            System.out.println("중복된 숫자가 있습니다.");
            System.out.print("각 자리에 중복이 없는 3자리의 숫자를 입력하세요> ");
            userNum = scanner.nextInt();
            
            userHuns = userNum / 100;
            userTens = (userNum-userHuns*100) / 10;
            userUnit = userNum-(userHuns*100)-(userTens*10);
            
            while(userNum<100 || userNum>999) {
                System.out.println("범위가 초과되었습니다.");
                System.out.print("각 자리에 중복이 없는 3자리의 숫자를 입력하세요> ");
                userNum = scanner.nextInt();
            }
            
        }
        
//        System.out.println("입력되었습니다.");
        // ----------------------------------------------------------
        
        // -------------사용자의 입력값과 컴퓨터의 랜덤값을 비교--------------
        int strike=0;
        int ball=0;
        
        while(true) {
            while(strike != 3) {
                if(userUnit == comUnit) {
                    strike++;
                }
                if(userTens == comTens) {
                    strike++;
                }
                if(userHuns == comHuns) {
                    strike++;
                }
                
                if(userUnit == comTens) {
                    ball++;
                }
                if(userUnit == comHuns) {
                    ball++;
                }
                if(userTens == comUnit) {
                    ball++;  
                }
                if(userTens == comHuns) {
                    ball++;
                }
                if(userHuns == comUnit) {
                    ball++;
                }
                if(userHuns == comTens) {
                    ball++;
                }
                
                if(strike == 3) {
                    break;
                } else if(strike != 0 || ball != 0) {
                    System.out.println("현재 스코어: "+strike+"S "+ball+"B");
                    score++;
                    strike = 0;
                    ball = 0;
                }else {
                    System.out.println("out");
                    score++;
                    strike = 0;
                    ball = 0;
                }
                
                System.out.print("다시 입력하세요> ");
                userNum = scanner.nextInt();
               
                userHuns = userNum / 100;
                userTens = (userNum-userHuns*100) / 10;
                userUnit = userNum-(userHuns*100)-(userTens*10);
                
                while(userNum<100 || userNum>MAX) {
                    System.out.println("범위가 초과되었습니다.");
                    System.out.print("각 자리에 중복이 없는 3자리의 숫자를 입력하세요> ");
                    userNum = scanner.nextInt();
                }
                
                while(userUnit == userTens || userUnit == userHuns || userTens == userHuns) {
                    System.out.println("중복된 숫자가 있습니다.");
                    System.out.print("각 자리에 중복이 없는 3자리의 숫자를 입력하세요> ");
                    userNum = scanner.nextInt();
                    
                    userHuns = userNum / 100;
                    userTens = (userNum-userHuns*100) / 10;
                    userUnit = userNum-(userHuns*100)-(userTens*10);
                    
                    while(userNum<100 || userNum>999) {
                        System.out.println("범위가 초과되었습니다.");
                        System.out.print("각 자리에 중복이 없는 3자리의 숫자를 입력하세요> ");
                        userNum = scanner.nextInt();
                    }
                    
                }
            }
            if(strike == 3) {
               System.out.println("정답입니다.");
               System.out.println("점수: "+score);
               break;
            }
          }
        
        
        
        
        
        
        scanner.close();
    }
}
