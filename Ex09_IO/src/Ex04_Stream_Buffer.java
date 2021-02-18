import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
 # 성능을 생각해서 만들어보쟈 01~03 은 성능 고려 x #
 File처리 중 Disk에 가록하는 작업이 가장 느린 작업이다
 (왜? -> 원칙: 1 byte 단위로, read - write 한다)
 ㄴ> read와 write를 한번에 모아서 하자!! 
 (버스 대절해서 20명씩 묶어서 데려다주기 -> 요기서 버스가 버퍼!(=캐시메모리))
 
 buffer 사용
 1. I/O의 횟수를 줄여서 성능을 개선한다.
 2. Line단위(엔터) 처리가 가능하다. -> 버퍼만 가능한 일!
 
 보조스트림 (혼자서는 못쓰이고 다른애랑 같이쓰이는 애)
 대표적으로 BufferedInputStream 이 있다! (독자적으로 사용되는 것이 아니라 주 클래스에 의존해서 쓰인다)
 
 개발자는 의무적으로 사용하면 된다. (성능이 좋아지는거니까~~~)
 
 
 
 */
public class Ex04_Stream_Buffer {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        
        try {
            fos = new FileOutputStream("data.txt"); 
            //디폴트(프로젝트)경로에 data.txt가 없다면 파일도 생성하고 write도 해라
            bos = new BufferedOutputStream(fos); // 생성자가 강제되어있다. (주 스트림을 파라미터로 넣어줘야 한다)
            
            for(int i = 0; i <10; i++) {
                bos.write('A');
            }
//            bos.flush(); // ####2번방법 (명시적으로 flush 호출)
            
            //JAVA Buffer 크기 : 8kbyte(8192byte) >> 버퍼가 "가득차지 않으면" 스스로 출발하지 않는다.
            // 1. buffer 안의 내용이 채워지면 스스로 출발한다. (비운다 = 사용한다): flush
            // 2. buffer를 강제로 비운다: 명시적으로 flush를 호출한다: flush()
            // 3. 자원을 해제하기: bos.close() >> 자원을 해제하면 자동으로 flush()를 호출한다.
            
            
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            try {
                bos.close(); // ###3번 방법 (자원을 해제하기)
                fos.close();
            } catch (Exception e2) {

            }
        }
        
        
        
    }
}
