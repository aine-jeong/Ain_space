package Hw_Cinema;

import java.util.Scanner;

public class SeatPractice {
    static final int ROW = 4;
    static final int COL = 5;
//    private String[][] seat; // @@@@@@@private로 다시 바꾸는 방법 찾기
    public String[][] seat = new String[ROW][COL];

    public void reset() { // 좌석배치 (=초기화)
        seat = new String[ROW][COL];
        
        // 좌석 배치(초기화)
        for(int i = 0; i < seat.length; i++) {
            for(int j = 0; j < seat[i].length; j++) {
                seat[i][j] = "["+(i+1)+"-"+(j+1)+"]";
            }
        }
        
    }
    
    public void print() {
        // 좌석 현황 출력 (예매된 좌석에는 "예매" 출력)
        System.out.println("**********좌석현황*********");
        for(int i = 0; i < seat.length ; i++) {
            for(int j = 0; j < seat[i].length; j++) {
                System.out.printf("[%s]",seat[i][j].equals("["+(i+1)+"-"+(j+1)+"]")? (i+1)+"-"+(j+1):"예매");
            }
            System.out.println();
        }
        System.out.println("*************************");
    }
    

   
        
    
}

        


    
    
    

