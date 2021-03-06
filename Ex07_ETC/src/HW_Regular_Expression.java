import java.util.Scanner;

public class HW_Regular_Expression {

//^ : 문자열이나 행의 처음
//[] : 대괄호 안의 형식 일치
//
//[A-Za-z0-9]
//: 알파벳 대문자(A~Z), 소문자(a~z), 숫자(0~9)와 일치
//
//{M,N} : 선행문자가 나타나는 횟수 또는 범위(최소 M번, 최대 N번 발생되는 패턴과 일치시킨다.)
//{6~12} : 반복 개수를 의미한다.
//
//$: 문자열이나 행의 끝을 뜻한다.

    public static void password() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\"6~12자의 영문자 또는 숫자\" 형식의 비밀번호를 입력해주세요.");

            String pattern = "^[A-Za-z[0-9]]{6,12}$"; // 영문, 숫자 / 6~12자리
            String data = sc.nextLine();

            boolean pwd = data.matches(pattern); // 유효성 검사

            if (pwd == true) {
                System.out.println("올바른 형식입니다.");
                break;
            } else {
                System.out.println("비밀번호는 6~12자의 영문자 또는 숫자이어야 합니다.");
            }

        }
    }

    public static void main(String[] args) {
        password();
    }
}
