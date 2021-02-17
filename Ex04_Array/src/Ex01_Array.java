//20210201 - 1번째

public class Ex01_Array {
    public static void main(String[] args) {
        // 다차원 배열(2차원)
        // [행][열]
        // 좌석(교실의 좌석), 지도 좌표값(경도, 위도), 바둑, 영화관 좌석 등
        
        int[][] score = new int[3][2];
        System.out.println(score[0][0]); //출력결과 -> 0 / 초기화를 한 것이 아니고 default값이 나온다.
        score[0][0] = 100;
        score[0][1] = 200;
        
        score[1][0] = 300;
        score[1][1] = 400;
        
        score[2][0] = 500;
        score[2][1] = 600;
        
        // 2차원 배열의 값을 출력하라
        // for문 2개
        // 행의 개수: 배열이름.length >> score.length
        // 열의 개수(열의 개수는 행마다 다를 수 있다) : 배열이름[0].length
        
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d\t", i, j, score[i][j]);
            }
            System.out.println();
        }
        
        int[][] score3 = new int[][] {
            // 초기화를 통해서 3행 2열짜리 배열 만들기
            {11,12},
            {13,14},
            {15,16}
            
        };
        
        // Q. 개선된 for문을 통해서 score3 배열의 값을 출력하세요
        //for(int value : Array) {}
        // 잔머리를 사용해서...
        // Hint: 2차월 배열의 그림을 떠올려보세욤
        for(int[] col : score3) { // 열 배열의 주소 
            for(int value : col) {
                System.out.println("값: "+ value);
            }
        }
        
    }
}
