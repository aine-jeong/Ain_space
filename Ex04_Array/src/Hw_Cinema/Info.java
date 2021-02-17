package Hw_Cinema;
import java.util.Scanner;

public class Info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String userNum; // 유저한테 예매번호 입력받을곳
        
        Seat seat = new Seat();
        
        seat.reset();
        
        seat.seat[0][1] = "12345678"; // 1-2번 좌석 예약번호 임의 부여
        seat.seat[3][4] = "98765432"; // 4-5 좌석 예약번호 임의 부여
        
        System.out.println("예매번호를 입력해주세요.");
        userNum = sc.nextLine();
        
        // 좌석 조회
        for (int i = 0; i < seat.seat.length; i++) {
            for (int j = 0; j < seat.seat[i].length; j++) {
                if (seat.seat[i][j].equals(userNum)) {
                    System.out.println("고객님이 예매하신 좌석은 "+(i+1)+"-"+(j+1)+"입니다.");
                } 
            }
        }
        // 예매하신 내역이 없습니다 출력 작성해야한다
        
        
        sc.close();
    }
    
}
