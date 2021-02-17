package day0120;

/*
 * 3. 사용자로부터 생년, 생월, 생일을 따로 따로 입력 받아서 형식에 맞추어 출력해보도록 합니다.
 * 심화과정: 사용자가 생년, 생월, 생일을 따로따로 입력하면 주민등록번호의 앞자리처럼 처리를 해봅시다.
 * 
 */


import java.util.Scanner;

public class Hw03 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("태어난 연도를 입력하세요.");
        int year = scanner.nextInt();
        System.out.println("태어난 달을 입력하세요.");
        int month = scanner.nextInt();
        System.out.println("태어난 날짜를 입력하세요.");
        int day = scanner.nextInt();
        
        // println으로 인출
        System.out.println("사용자의 생년월일: "+year+"년 "+month+"월 "+day+"일");
        // printf로 인출
        System.out.printf("사용자의 생년월일: %d년 %d월 %d일 \n ", year, month, day);
        
        year = year % 100;
        System.out.println("주민등록번호 앞자리: "+year+month+day);
        
        // 선생님 답안
        //  System.out.printf("주민등록번호 앞자리: %02d%02d%02d \n ", (year % 100) , month, day);
     
        scanner.close();
    }

}
