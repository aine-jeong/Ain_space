import java.io.FileReader;
import java.io.FileWriter;

/*
 문자 기반의 데이터 처리가 가능하도록(한글처리...) >> String Date를 처리하겠다 > char[] !!
 한글 1자, 영문자 1자 >> 2byte
 
 Reader, Writer -> 문자처리
 
 대상: File 
 
 */
public class Ex05_Reader_Writer {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        
        try {
            fr = new FileReader("Ex01_Stream.java"); // 파일 read
            fw = new FileWriter("copy_Stream.txt"); // 파일 생성, 파일 write
            
            int data = 0;
            while((data = fr.read()) != -1) {
//                System.out.println((char)data); // 통로가 2byte니까 한글도 안깨지고 잘 나온당!
//                fw.write(data); // 그대로 카피 완료!
                
                //일반적으로 배포 파일은 압축되어있다. (엔터와 공백, 스페이스가 없는 파일)
                //Compressed 버전 생성하는 if문! (배포 용량을 줄일 수가 있다)
                if(data != '\n' && data !='\r' && data != '\t' && data !=' ') {
                    fw.write(data);
                }
                System.out.println((char)data);
            
            }
            
        } catch (Exception e) {
            
        } finally {
            try {
                fw.close();
                fr.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }
        
        
    }

}
