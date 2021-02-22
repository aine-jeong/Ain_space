import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.bit.UserInfo;

public class Ex15_ObjectDataOutputStream {
    public static void main(String[] args) {
        String filename = "Userdata.txt"; // 여기다가 객체를 직렬화해서 write해둘 것
        
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream out = null;
        
        try {
            fos = new FileOutputStream(filename,true); // true -> append 하겠다
            bos = new BufferedOutputStream(fos);
            //직렬화 하고싶으면
            out = new ObjectOutputStream(bos);
            
            //직렬화 대상(객체)
            UserInfo u1 = new UserInfo("홍길동", "super", 500); //완제품
            UserInfo u2 = new UserInfo("scott", "tiger", 50); //완제품
            
            //벽에 구멍(전달해줄 통로)을 만들고 보낼것
            //직렬화 "Userdata.txt"
            out.writeObject(u1); //분해해서 "Userdata.txt"에 write
            out.writeObject(u2); //분해된 완제품 2개를 보냈다.
            
            //받은 것은 분해된 것이다~!~!~!
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                out.close();
                bos.close();
                fos.close();
            } catch (Exception e2) {
                
            }
        }
        
    }
}
