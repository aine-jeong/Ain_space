import java.util.Properties;

/*
> Properties: Map 인터페이스를 구현한 클래스인데 특수한 목적을 가졌다.
  특수한 목적: <String, String> 으로 세팅되어있음 -> key, value가 String으로 강제되어있다.
 
 사용 목적
 0. DB연결정보 (id=kglim, pwd=1004)
 1. App 전체에 사용되는 자원을 관리할 때 사용
 2. 환경변수
 3. 프로그램의 버전 관리
 4. 공통 파일의 경로
 5. 공통 변수
 
 */

public class Ex16_Properties {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("admin", "bit@bit.co.kr"); 
        prop.setProperty("version", "1.x.x.x"); // 프로그램의 버전
        prop.setProperty("path", "C:\\Temp\\images"); // 고정된 경로
        // 각각의 개발 페이지에 사용 -> DB연결정보, 환경 세팅 정보 등등을 담아뒀다가 계속 사용할 수 있도록!
        // 유지보수성 up
        System.out.println(prop.getProperty("admin"));
        System.out.println(prop.getProperty("version"));
        
    }
}
