package Hw_Cinema;
import java.util.Scanner;

public class Cancle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String userNum; // 유저한테 예매번호 입력받을곳
        int userRow = -1;
        int userCol = -1;
        int userChoice = -1;
        
        Seat seat = new Seat();
        seat.reset();
        
        seat.seat[0][1] = "12345678"; // 1-2번 좌석 예약번호 임의 부여
        seat.seat[3][4] = "98765432"; // 4-5 좌석 예약번호 임의 부여
        
        
        seat.print(); // 임시
        
        System.out.println("예매번호를 입력해주세요.");
        userNum = sc.nextLine();
        
        // 좌석 조회 후 취소 여부 묻기
        for (int i = 0; i < seat.seat.length; i++) {
            for (int j = 0; j < seat.seat[i].length; j++) {
                if (seat.seat[i][j].equals(userNum)) {
                    userRow = i+1;
                    userCol = j+1;
                    System.out.println("고객님이 예매하신 좌석은 "+userRow+"-"+userCol+"입니다.");
                    System.out.println("예매를 취소하시겠습니까?");
                    System.out.println("1.네 / 2.아니오");
                    userChoice = sc.nextInt();
                } 
            }
        }
        
        System.out.println("userRow: "+userRow); // 임시
        System.out.println("userCol: "+userCol); // 임시
        
        if(userChoice == 1) {
            seat.seat[userRow-1][userCol-1] = userRow+"-"+userCol;
        }
        
        seat.print(); // 임시
        
        
        
        sc.close();
    }
    
}
