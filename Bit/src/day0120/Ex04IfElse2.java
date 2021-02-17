package day0120;

import java.util.Scanner;

public class Ex04IfElse2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        // 1. 사용자로부터 숫자를 입력 받아서 홀수인지 짝수인지 출력하는 코드를 작성하세요
        System.out.println("숫자를 입력해주세요.");
        int num = scanner.nextInt();
        
        if((num%2) != 0) {
            System.out.println("홀수입니다.");
        }else {
            System.out.println("짝수입니다.");
        }
        
        System.out.println("====================");
        
        // 2. 나이를 입력받아서 성인인지 미성년자인지 출력하는 코드를 작성하시오
        System.out.println("나이를 입력해주세요.");
        int age = scanner.nextInt();
        
        if(age >= 19) {
            System.out.println("성년입니다.");
        }else {
            System.out.println("미성년자입니다.");
        }
        
        System.out.println("====================");
        
        // 3. 사용자로부터 id와 비밀번호를 입력받아서
        //    id가 admin, 비밀번호가 12345가 맞으면 로그인 성공 그 외에는 로그인 실패가 출력되는코드를 작성하시오
        System.out.println("아이디를 입력해주세요");
        scanner.nextLine();
        String id = scanner.nextLine();
        
        System.out.println("비밀번호를 입력해주세요");
        String pw = scanner.nextLine();
        
        if(id.equals("admin") && pw.equals("12345")) {
            System.out.println("로그인성공");
        }else {
            System.out.println("로그인 실패");
        }
        
        System.out.println("프로그램을 종료합니다.");
        
        
        scanner.close();
 
        
    }

}
