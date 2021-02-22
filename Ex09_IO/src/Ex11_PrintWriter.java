import java.io.BufferedReader;
import java.io.FileReader;

// Ex11 부터는 ETC로 배우는 것

public class Ex11_PrintWriter {
    public static void main(String[] args) {
        // 출력형식의 정의 (printf , StringFormat 등)
        // PrintWriter: 출력물에 대한 형식 정의(레포팅)
        // 현업에서는 레포팅 툴을 사용한다(오즈, 크리스탈 레포트 등의 소프트웨어 사용)
        
        try {
            /*
            PrintWriter pw = new PrintWriter("C:\\Temp\\homework.txt"); //생성기능 포함
            pw.println("************************************************");
            pw.println("******************HOMEWORK*****************");
            pw.println("************************************************");
            pw.printf("%3s : %5d %5d %5d %5.1f","아무개", 100, 90, 50, (float)((100+90+50)/3));
            pw.println();
            pw.close();
            */
            //PrintWriter: line 단위로 작성했다
            // read도 line단위로 읽어오자
            
            FileReader fr = new FileReader("C:\\Temp\\homework.txt");
            BufferedReader br = new BufferedReader(fr);
            String str="";
            while((str = br.readLine()) != null) {
                System.out.println(str);
            }
            
            fr.close();
            br.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}
