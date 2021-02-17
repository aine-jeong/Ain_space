

/*
 오류
 1. 에러(error)     : 개발자가 만드는 오류가 x / 네트워크 장애, 메모리나 하드웨어의 문제 등...
                     개발자가 코드적으로 해결이 불가하다.
 2. 예외(exception) : 개발자의 코드 실수에 의해 발생 >> 방어적인 코드 (-> 예외처리)
 >> 개발 중 예외가 발생하면 프로그램은 강제종료시킨다 (비정상적인 종료)
 
 try{
     // 문제가 발생할 수도 있는 코드
     // 문제가 발생하면 catch로 보내겠다.
 } catch(Exception e) {
     // 문제가 생기면 catch를 통해 문제를 파악하겠다
     // 문제가 처리된 것은 아니고, 처리를 유도하는 것
     // 1. 관리자에게 email로 알려주거나
     // 2. 로그파일에 기록을 남긴다
     // 3. 일단 강제 종료를 막는다(문제가 발생했음을 알려주는 것!)
     // 개발자의 코드 수정이 필요하다~!~!~!
 }finally{
     // 만약 try에서 문제가 발생하던, 발생하지 않던 강제로 수행되어야 할 코드
     // Db 연결해제 등의 코드 .....
 }
 
 예외가 발생하면 개발자는 예외 발생건에 대해서 파악(어떤 자원에서, 어떤 행위에의해서... ?)
 자바가 예외에 관련된 클래스를 미리 설계해 두었다.
  ㄴ> 예외가 발생하면 자동으로 그 예외에 맞는 class를 객체로 생성한다
      그리고 다양한 정보를 그 객체에 넣어준다.
 
 */

public class Ex01_Exception {
    public static void main(String[] args) {
        System.out.println("main start");
        
        try {
            System.out.println(0/0); // java.lang.ArithmeticException: / by zero
                                // new ArithmeticException() 
                                // 이 객체를 catch에 던진다
                // 근데 왜 Exception으로 잡았지?
                // ArithmeticException가 Excepction을 상속하고 있으므로
                // 부모 타입이 자식 타입의 주소를 받을 수 있다
                // 모든 예외를 다 받을 수 있도록 부모타입인 Exception으로 받은 것 ( 다형성)
        } catch (Exception e) {
            // 문제에 대한 파악
            // Exception -> 타입이당 / e라는 참조변수는 Exception이라고 하는 클래스의 주소값이 들어간당
//            System.out.println("발생 원인: " + e.getMessage());
            e.printStackTrace();
        }
        
        
        
        System.out.println("main end");
    }
}
