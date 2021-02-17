/*
 Static 변수 >> 모든 객체가 같은 값을 가지게 할거야
 Instance 변수 >> 모든 객체가 다른 값을 가지게 할거야
 */

class InitTest {
    static int cv = 10; // 일반적으로 이런식으로 바로 초기화 하지 않음! (하더라도 문제는 없다)
    static int cv2;
    
    int iv = 11;
    
    static { // static block(static 초기자 설정 블럭) 
            // -> static member field의 변수에 초기값을 할당하는 것이 목적이다
        cv = 10; // 멤버필드에서 초기화 한 것과 다른 점은?
        cv2 = cv+222; // 변형된 값을 제공할 수 있다.
                // 특수한 경우일 뿐 자주 사용하는 것은 아님
        // 호출시점: static member field가 메모리에 올라간 직후 메모리에 자동 호출
    }
    
    { // instance variable 초기화 블럭 
        //new를 통해서 객체가 생성되고 int iv 변수가 메모리에 올라간 "직후 바로" 호출된다
        System.out.println("초기자 블럭");
        if(iv > 10) iv = 100; // 이렇게 조건문 작성 가능! (변수에 바로 작성하는건 안댕)
    }
}

public class Ex08_Static_Init {
    public static void main(String[] args) {
        System.out.println(InitTest.cv);
        System.out.println(InitTest.cv2);
        
        // 일반 자원
        InitTest inittest = new InitTest();
        System.out.println(inittest.iv);
    }
}
