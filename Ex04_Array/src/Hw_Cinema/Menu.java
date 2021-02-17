package Hw_Cinema;

import java.util.Scanner;

public class Menu {
    Seat seat = new Seat();
  
    public void Menu() {

        allLoop: 
            while (true) {
            String selectnum = showMenu();
            
            switch (selectnum) {
            case "1": // 예매하기
            case "2": // 예매조회
            case "3": // 예매취소
            case "4": // 프로그램 종료
                System.out.println("이용해주셔서 감사합니다.");
                break allLoop;
            default:
                System.out.println("이용할 수 없는 메뉴입니다.");
                break;
            }

        }

    }

    private String showMenu() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("***********************");
        System.out.println("*****영화 예매 시스템*****");
        System.out.println("***********************");
        System.out.println("1. 예매하기 \n");
        System.out.println("2. 예매조회 \n");
        System.out.println("3. 예매취소 \n");
        System.out.println("4. 프로그램 종료 \n");
        System.out.print("원하는 메뉴 번호를 입력해주세요> ");
        String selectnum = sc.nextLine();
        return selectnum;
    }
}
