import java.io.IOException;

/*
 >> PC에 게임 CD를 넣고 설치
 >> 1. 설치파일을 C:\Temp 에 복사
 >> 2. 복사한 파일로 게임을 설치
 >> 3. 정상설치가 되었다면, C:\Temp에 복사한 파일을 삭제한다.
 >> 4. 비정상적인 문제가 발생(강제종료)되어도, 복사한 파일을 삭제하고 싶다!! 
 
 '복사한 파일 삭제'를 강제하는 방법은??
 */

public class Ex03_finally {
    
    static void startInstall() {
        System.out.println("INSTALL");
    }
    
    static void copyFiles() {
        System.out.println("COPY FILES");
    }
    
    static void fileDelete() {
        System.out.println("FILE DELETE");
    }
    
    public static void main(String[] args) {
        // 현재 3개의 함수는 정상 처리 된다.
        // 예외를 사용자가 필요에 따라 강제할 수 있다.
        // >> 실제로는 예외가 아니지만 개발자가 어떤 상황에서 강제로 예외로 지정하는 것이 가능하다
        // ex) 1이면 정상 2이면 강제로 예외를 발생해서 catch로...
        // throw new IOException()
        
        try {
            copyFiles();
            startInstall();
            throw new IOException("install 도중 문제가 발생했습니다."); // 개발자가 임의로 발생한 예외
        } catch (Exception e) {
            System.out.println("예외 메시지 출력: " + e.getMessage());
//            fileDelete(); // 여기다 넣을 수도 있지만, 예외가 발생하지 않았을 경우 파일을 지우지 않게 될 것
        } finally { // 예외가 발생하던 발생하지 않던 무조건 실행되는 블럭
            fileDelete();
            // return을 통해 함수를 강제종료시킬 수 있다.
            // 예외 : finally블럭은 return에 의해서 종료되기 전에 호출된다.
            // finally는 무조건 살아남아서 실행시켜 준다는 것을 보장받을 수 있다!
        }
        
        System.out.println("main end");
    }
}
