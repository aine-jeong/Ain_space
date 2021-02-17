import java.util.Random;

import practice.day0212_3_cinema;

public class Testmain {
    public static void main(String[] args) {
        Random random = new Random();
        
        
        day0212_3_cinema cinema = new day0212_3_cinema();
        cinema.seatReset();
        cinema.seatPrint();
        
        String randomnum = "";
        for(int i = 0; i < 8; i++){ // 0~9의 정수를 총 8자리 뽑으려고!
            randomnum += Integer.toString(random.nextInt(9));
        }
        
        cinema.Reservation();
        
        
    }   
}
