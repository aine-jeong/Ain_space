/*
 프로그램 >> 실행 >> 프로세스 >> 최소 하나의 스레드 (stack) >> JVM이 하나의 main thread(stack)을 생성해준다.
 지금까지 싱글 프로세스, 싱글 스레드(stack 1개) >> main함수가 올라가서 실행
 
 JVM이 call stack을 생성하고, 거기에 main 함수를 동작하도록 함
 
 stack은 한번에 1개의 함수만 실행 가능 (10개의 함수가 있더라도 순차적으로 1개씩)
 
 ************************************
 * 지금까지 하나의 stack 메모리만 사용했다 * 
 ************************************
 ***** 이제부터 여러개 만들어보자~~~~ *****
 ************************************
 
 */
public class Ex01_Single_Thread {
    public static void main(String[] args) {
        System.out.println("나 main 함수 일꾼이야");
        worker();
        worker2();
        System.out.println("main 종료");
    }
    
    static void worker() {
        System.out.println("나 1번 일꾼이야");
    }
    
    static void worker2() {
        System.out.println("나 2번 일꾼이야");
    }
}
