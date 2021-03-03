import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Study0302_2 {
    private static Study0302[] accountArray = new Study0302[100];
    private static Scanner scanner = new Scanner(System.in);
    
    private static String ano, owner;
    private static int balance;
    public static List<Study0302> accountList = new ArrayList<Study0302>();
    
    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("-----------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("-----------------------------------------------");
            System.out.print("선택 > ");
            int selectNo = scanner.nextInt();
            scanner.nextLine();
            if (selectNo == 1) {
                creatAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
    // 계좌생성하기
    private static void creatAccount() {
        // 작성위치
        System.out.printf("계좌번호: ");
        ano = scanner.nextLine();
        System.out.printf("계좌주: ");
        owner = scanner.nextLine();
        System.out.printf("초기입금액: ");
        balance = scanner.nextInt();
        scanner.nextLine();
//        Study0302 account = new Study0302(ano, owner, balance);
        accountList.add(new Study0302(ano, owner, balance));
        System.out.println("결과: 계좌가 생성되었습니다.");
    }
    // 계좌목록 보기
    private static void accountList() {
       // 작성위치 
        System.out.println("-------");
        System.out.println("계좌목록");
        System.out.println("-------");
        System.out.println(accountList.toString());
    }
    // 예금하기
    private static void deposit() {
        // 작성위치 (findAccount를 호출해서 이용)
        System.out.println("-------");
        System.out.println("  입금");
        System.out.println("-------");
        System.out.printf("계좌번호: ");
        String userAno = scanner.nextLine();
        scanner.nextLine();
        Study0302 user = findAccount(userAno);
        System.out.printf("예금액: ");
        int userDeposit = scanner.nextInt();
        user.setBalnace(user.getBalnace()+userDeposit);
        System.out.println("결과: 예금이 성공되었습니다.");
    }
    // 출금하기
    private static void withdraw() {
        // 작성위치 (findAccount를 호출해서 이용)
        System.out.println("-------");
        System.out.println("  출금");
        System.out.println("-------");
        System.out.printf("계좌번호: ");
        String userAno = scanner.nextLine();
        scanner.nextLine();
        Study0302 user = findAccount(userAno);
        System.out.printf("출금액: ");
        int userWithdraw = scanner.nextInt();
        user.setBalnace(user.getBalnace()-userWithdraw);
        System.out.println("결과: 출금이 성공되었습니다.");
    }
    // Account 배열에서 ano와 동일한 Account 객체 찾기
    private static Study0302 findAccount(String ano) {
//        Study0302 findAccount = new Study0302();
        for(int i = 0; i < accountList.size(); i++) {
            if( accountList.get(i).getAno().equals(ano) ) {
//                System.out.println(accountList.get(i).toString());
                return accountList.get(i);
            }
        }
        return null; 
    }
}