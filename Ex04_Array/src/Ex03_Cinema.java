
public class Ex03_Cinema {
    public static void main(String[] args) {
        String[][] seat = new String[3][5];
        
        // ====좌석배치====
        for(int i = 0; i < seat.length ; i++) {
            for(int j = 0; j < seat[i].length; j++) {
                seat[i][j] = "__"; // 좌석
            }
        }
        
        // ====좌석배치표====
        for(int i = 0; i < seat.length ; i++) {
            for(int j = 0; j < seat[i].length; j++) {
                System.out.print(seat[i][j]+" ");
            }
            System.out.println();
        }
        
        // ====좌석예매====
         seat[2][1] = "홍길동";
         seat[0][0] = "김유신";
         
         // ====좌석 예약현황 출력====
         for(int i = 0; i < seat.length ; i++) {
             for(int j = 0; j < seat[i].length; j++) {
                 System.out.printf("[%s]",seat[i][j].equals("__")?"예매가능":"예매완료");
             }
             System.out.println();
         }
         
         
         // ====누군가 예매를 하겠다고 데이터를 입력한 경우====
         int row, col; // 사용자 행 열 값을 받았다고 가정하고
         row = 2;
         col = 1;
         
         if(seat[row][col].equals("__")) {
             System.out.println("예약 가능한 좌석입니다.");
         }else {
             System.out.println("이미 예약된 좌석입니다.");
         }
         
         //====좌석 초기화====
         // --> 자주 사용하는 코드이므로 함수로 만들어도 좋지 않을까?
         for(int i = 0; i < seat.length ; i++) {
             for(int j = 0; j < seat[i].length; j++) {
                 seat[i][j] = "__"; // 좌석
             }
         }
         
         
         
         
         
        
    }
}
