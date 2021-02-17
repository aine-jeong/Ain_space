package Hw_Cinema;

import java.util.Scanner;
import java.util.Random;

public class Reservation {
    public static void main(String[] args) {
        String userSeat;
        Scanner sc = new Scanner(System.in);

        Seat seat = new Seat();
        seat.reset();
        seat.print();
        
        
        System.out.println("좌석을 선택해주세요. 예) [1-1]");
        System.out.println("이미 예매된 좌석은 [예매]라고 표시됩니다.");
        userSeat = sc.nextLine();

        Random random = new Random();
        String ran = Integer.toString(random.nextInt(8) + 1);
        for (int i = 0; i < 7; i++) {
            ran += Integer.toString(random.nextInt(9));
        }

        
        for (int i = 0; i < seat.seat.length; i++) {
            for (int j = 0; j < seat.seat[i].length; j++) {
                if (seat.seat[i][j].equals(userSeat)) {
                    seat.seat[i][j] = ran;
                } 
            }
        }
        
        System.out.println("**********좌석현황*********");
        for(int i = 0; i < seat.seat.length ; i++) {
            for(int j = 0; j < seat.seat[i].length; j++) {
                System.out.printf("[%s]",seat.seat[i][j]);
            }
            System.out.println();
        }
        System.out.println("*************************");
        
        
        seat.print();

    }
}
