import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_Stream_imageCopy {
    public static void main(String[] args) {
        String orfile = "C:\\Users\\user\\Desktop\\Bitcamp\\1.jpg";
        String tarfile = "copy.jpg";
        // 어떤 경로도 명시하지 않으면 default 경로: 프로젝트 폴더
        FileInputStream fs = null;
        FileOutputStream fo = null;
        
        try {
            fs = new FileInputStream(orfile);
            fo = new FileOutputStream(tarfile,false); // 파일이 없으면 생성, write 둘다 한다.
            
            int data = 0;
            while((data = fs.read()) != -1) {
                fo.write(data); // copy.jpg 에서 byte write
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fs.close();
                fo.close();
            } catch (Exception e2) {
                
            }
        }
        
    }
}
