import java.io.DataInputStream;
import java.io.FileInputStream;

public class Ex14_DataInputStream {
    public static void main(String[] args) {
        int sum = 0;
        int score = 0;
        
        FileInputStream fis = null;
        DataInputStream dis = null;
        
        try {
            fis = new FileInputStream("score.txt");
            dis = new DataInputStream(fis);
            while(true) {
                score = dis.readInt(); // 아까 writeInt했으니까 readInt로 읽어야댕
                // 무한루프 돌려놨으니까 더이상 읽을 게 없으면 16번째 줄에서 오류가 빵 뜬다
                System.out.println("score int 데이터: " + score);
                sum+=score;
            }
            
        } catch (Exception e) {
//            System.out.println(e.getMessage());
            System.out.println("sum 결과: " + sum); // 이런식으로 무한루프 - 출력결과를 catch에 작성해줘도 된다.
        }finally {
            try {
                dis.close();
                fis.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }
        
    }
}
