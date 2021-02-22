/*
 Thread : 프로세스에서 하나의 최소 실행 단위(흐름) >> method
 >> 멀티 스레드는 스택을 여러개 만들어서 함수를 동작시키는 것 이라고 생각하자~~~~
 
 Thread 생성 방법
 1. Thread 클래스를 상속 >> class Test extends Thread >> 새로운 stack에서 놀거야
     >> run() 함수 >> 새로운 stack 가장 먼저 실행
     >> Thread 클래스 >> Thread 스스로 객체 생성이 가능
     
     
     
 2. Runnable 인터페이스를 구현한 이유는 ?
 >> 다중상속이 안된다.... 만약에 다른 클래스를 상속해야 할 경우 스레드를 상속하는 것이 불가능하다!
 >> so, 인터페이스를 하나 만든 것
 class Test extends Car implements Runnable >> 인터페이스에서 run() 구현 강제
 
 여기까지는 Test 클래스가 스레드가 아니다.
 
 스레드처럼 사용하려면 ?
 Thread thread = new Thread(new Test()); // ()안에 run을 오버라이드 한 객체를 넣을 수 있다.
     
 */
class Thread_2 implements Runnable { // run() 재정의를 강제함
    
    @Override
    public void run() {
        for(int i = 0; i < 10000 ; i++) {
            System.out.println("Tread_2: " + i);
        }
        System.out.println("Tread_2 run() END.............");
    }
}

class Thread_1 extends Thread {
    @Override
    public void run() { // run() 함수는 main() 함수와 동일한 역할
                        // 새로운 stack에 처음올라가서 실행되는 함수!
        for(int i = 0; i < 10000 ; i++) {
            System.out.println("Tread_1: " + i + this.getName());
        }
        System.out.println("Tread_1 run() END.............");
    }
    
}

public class Ex02_Multi_Thread {
    public static void main(String[] args) {
        //1번
        Thread_1 th = new Thread_1();
        th.start(); // ## POINT ##
        //   ㄴ> 메모리에 새로운 call stack을 생성하고, 그 위에 run()을 stack에 올려놓고 종료
        
        //2번
//        Thread_2 th2 = new Thread_2(); // 얘 자체는 Thread가 아니다.
//        Thread thread = new Thread(th2);
//        thread.start(); // 이 세 줄이 스레드를 만들어주는 코드
        Thread thread = new Thread(new Thread_2());
        thread.start();
        
        
        
        for(int i = 0; i < 10000 ; i++) {
            System.out.println("Tread_1: " + i);
        }
        System.out.println("Main END");
        
        
    }

}
