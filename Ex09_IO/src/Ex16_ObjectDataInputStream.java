import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import kr.or.bit.UserInfo;

// #####프로젝트할 때 필요할 것이다~~~~ 15~16번 ####
//분해된 것을 다시 조립하기 : 역직렬화

public class Ex16_ObjectDataInputStream {
    public static void main(String[] args) {
        String filename = "Userdata.txt";
        
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream in = null;
        
        try {
            fis = new FileInputStream(filename);
            bis = new BufferedInputStream(fis);
            in = new ObjectInputStream(bis); // 분해된 부품을 조립하는 행위
            
            /*// 이 경우 몇개를 보냈는지 알아야 하는 것... 몇개를 보내던 읽고싶다~~~~
            UserInfo r1 = (UserInfo)in.readObject(); // ###나눠진 부품을 객체로 만들어서 읽겠다!!!!
                            // ㄴ> 내가 만든 타입으로 다운캐스팅 해야된다. Object는 다읽으니까~~
            
            UserInfo r2 = (UserInfo)in.readObject();
            
            System.out.println(r1.toString());
            System.out.println(r2.toString());
            */
            
            Object users = null;
            while((users = in.readObject()) != null) {
                System.out.println(((UserInfo)users).toString());
            }
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (EOFException eofe) {
            System.out.println("끝" + eofe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe.getMessage());
        } finally {
            try {
                in.close();
                bis.close();
                fis.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        
        
    }
}
