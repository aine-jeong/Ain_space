package kr.or.bit;
import java.io.IOException;

// 설계도 == 타입 == 클래스

// 내 설계도를 사용하는 개발자가 [예외를 강제로 처리] 했으면 좋겠다.

// 생성자함수 같은 곳에서 강제로 예외를 처리할 수 있게...


public class MyClass {
    public MyClass(String path) throws IOException, NullPointerException {
                        // 예외들의 목록을 작성해두었다.
                        // 예외를 처리하도록 강제해두었다. 
                        // 사용자가 예외를 처리하지 않으면 사용할 수 없음
        System.out.println(path);
    }
}
