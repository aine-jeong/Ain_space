
//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ... 하는 문제

//main 함수 Scanner  사용 주민번호 입력받고
//앞:6자리     뒷:7자리
//입력값 : 123456-1234567 
//1. 자리수 체크 (기능)함수 (14 ok)  return true , false 
//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수  return true, false
//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수  void  출력

//3개의 함수 static 
import java.util.Scanner;

public class HW0208_String {
    static Scanner sc = new Scanner(System.in);

    static boolean juminLength(String jumin) { // 길이 확인 함수
        return jumin.length() == 14 ? true : false;
    }

    static boolean jumingenderRange(String jumin) { // 1~4범위 확인 함수
        int jumingen = Integer.parseInt(jumin.substring(7,8));

        return (jumingen <= 4 && jumingen >= 1) ? true : false;
    }

    static void juminPrint() { // 1,3 남자 / 2,4 여자 출력 함수

        System.out.println("주민등록번호를 입력해주세요");
        System.out.println("ex) 123456-1234567");
        String jumin = sc.nextLine();

        while (true) {
            if (!juminLength(jumin) || !jumingenderRange(jumin)) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("주민등록번호를 입력해주세요");
                System.out.println("ex) 123456-1234567");
                jumin = sc.nextLine();
            } else break;
        }

        int gender = Integer.parseInt(jumin.substring(7,8)) ;
        
        if (gender == 1 || gender == 3) {
            System.out.println("남자입니다.");
        } else {
            System.out.println("여자입니다.");
        }

    }

    public static void main(String[] args) {
        juminPrint();
    }
    
    
}
