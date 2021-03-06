import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 Stream 중간 매개체(데이터 통로) -> Default가 Byte다
 
 JAVA API가 추상클래스로 생성해 두었다
 InputStream , OutputStream (추상자원)
 
 > 입출력 "대상"에 따라서 여러개의 추상클래스를 상속받아서 재정의해서 써야한다.
 1. Memory: ByteArray I/O Stream
 2. File: File I/O Stream (주로 사용하는 것은 요고다)
  
 */

public class Ex01_Stream {
    public static void main(String[] args) {
        //byte(-128~127까지의 정수값을 저장하는 타입)
        //연속적인 데이터를 다룬다 -> 배열!
        byte[] inSrc = {0,1,2,3,4,5,6,7,8};
        byte[] outSrc = null; // 현재 메모리를 가지고 있지 않다 (초기화x)
        
        //데이터를 read, write하자 / 대상: memory
        ByteArrayInputStream input = null; //이 스트림을 사용해서 memory를 read
        ByteArrayOutputStream output = null; //이 스트림을 사용해서 memory를 write
        
        input = new ByteArrayInputStream(inSrc); // read / 파라미터로 리소스를 준다 / 빨대를 배열에 꽂은 것
        output = new ByteArrayOutputStream(); // write
        
        System.out.println("ourSrc before: " + Arrays.toString(outSrc));
        
        //공식같은 로직
        int data = 0;
        while((data = input.read()) != -1) { // input.read(): 더이상 read할 data가 없으면 -1(읍써임마)이 리턴된다.
            //while(input.read() != -1) {
            //   System.out.println(input.read()) } >> 출력결과 1 3 5 7 -1 이렇게 나오는 이유 !!
            System.out.println("data: " + data); // read() 는 내부적으로 next() 기능을 가지고있다.
                                                // = 읽은다음에 다음으로 넘겨버린다.
                                               // 읽은 것을 바로 넣어서 저장해야대 (read()가 두번나오면 그냥 두칸씩 넘겨버린다.
            // 그래서 살려둔 코드와 같이 작성해야 한다.
            
            
            // read한 데이터를 다른 메모리에 write하기
            output.write(data); // write의 대상이 data가 아니고, ByteArrayOutputStream 자신의 통로가 data를 가지는 것
                                // "data에 write합니다" 가 아님
                                // " output.write(data);를 read해서 자기 자신(output)에 적어두는 것"
        }
        
        System.out.println(output.toByteArray()); // toByteArray() : output이 가지고 있는 것의 "주소"
        
        outSrc = output.toByteArray(); // outSrc에다가 output의 주소를 가져다가 넣어준다.
        
        System.out.println("ourSrc after: " + Arrays.toString(outSrc));
        
        
    }
}
