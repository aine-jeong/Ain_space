import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Bank.Account;
import Bank.Bank;
import Bank.Transaction;

public class BankMain {
    public static void main(String[] args) {
        
        
        
        //통일성 맞춰주기
        //생성자로 초기화할건지, 그냥 바로 초기화할건지 등등 ....
        
        //다형성 사용 가능하다면 사용해주기 (ArrayList<> 로 만들기보다는 List<>로 만들면 좋다)
        
        //Validation 추가
        // ㄴ> 만약 같은 계좌번호를 넣으면 어떻게 할건지....
        //  ㄴ> 만약 검색한 애가 없으면 어떻게 할건지.... 등등
        
        
        
        
        Bank bank = new Bank();
        // 은행은 계좌를 등록한다.
        bank.addAcount("1111", "kim");
        bank.addAcount("2222", "lee");
        bank.addAcount("3333", "park");
        bank.addAcount("4444", "hong");
        bank.addAcount("5555", "hong");
        bank.addAcount("6666", "kim");
        bank.addAcount("7777", "lee");
        
        //은행은 계좌번호로 계좌를 찾을 수 있다.
        System.out.println("***계좌번호가 2222인 계좌 조회***");
        Account getAccount = bank.getAccount("2222");
        System.out.println(getAccount);
        
        //은행읜 계좌의 소유자명으로 계좌를 찾을 수 있다.
        System.out.println("\n***이름이 hong인 사람의 계좌 조회***");
        List<Account> findAccount = bank.findAccounts("hong");
        for(Account a : findAccount) {
            System.out.println(a);
        }
        
        //은행은 모든 계좌의 목록을 볼 수 있다.
        System.out.println("\n***모든 계좌 목록 조회***");
        List<Account> accounts = bank.getAccounts();
        for(Account a : accounts) {
            System.out.println(a);
        }
        
        //계좌는 입금, 출금 기능과 잔고 확인 기능이 있다.
        System.out.println("\n***계좌번호가 1111인 계좌에 5만원 입금***");
        Account kim = bank.getAccount("1111");
        kim.deposit(50000);
        System.out.println(kim);
        
        System.out.println("\n***계좌번호가 1111인 계좌에 2만원 출금***");
        kim.withdraw(20000);
        System.out.println(kim);
        
        System.out.println("\n***계좌번호가 1111인 계좌에 5000원 출금***");
        kim.withdraw(5000);
        System.out.println(kim);
        
        System.out.println("\n***계좌번호가 1111인 계좌의 잔고 확인하기***");
        System.out.println("kim 님의 \'1111\' 계좌 잔액: " + kim.getBalance());
        
        //계좌에서 잔액의 변화가 있을 때 마다 입출금 명세에 기록된다.
        //입출금 명세는 거래일자, 거래시간, 입금/출금, 금액, 잔액으로 구성된다.
        System.out.println("\n***계좌번호가 1111인 계좌의 거래내역 확인하기***");
        ArrayList<Transaction> kimTransaction = kim.getTransaction();
        for(int i = 0; i <= kim.getNum(); i++) {
            System.out.println(kimTransaction.get(i));
        }
        
        System.out.println("\n***계좌번호가 1111인 계좌에 잔고 초과해서 출금시도해보기***");
        kim.withdraw(100000);
        
        
        
    }
    
    public static void main02(String[] args) {
        
        String accountNo2 = null;
        String name = null;
        long balance = 0;
        
        ArrayList<Account> account = new ArrayList<Account>();
        account.add(new Account("1111", "홍길동"));
        account.add(new Account("1234", "김유신"));
        account.add(new Account("1000", "ㅇㅇㅇ"));
        account.add(new Account("9999", "홍길동"));
        account.add(new Account("8888888", "홍길동"));
        
//        System.out.println(account.get(0).getAccountNo().equals("1111"));
        
        
        int ac=-1;
        for(int i = 0; i < account.size(); i++) {
            if(account.get(i).getAccountNo().equals("1234")) {
               ac = i; 
            }
        }
        
        //----------------------------------------------------------
        int accountNumber = 0; // 사용자 한명이 가진 계좌의 개수
        Account[] allaccount;
        int a =0 ;
        for(int i = 0; i < account.size(); i++) {
            if(account.get(i).getName().equals("홍길동")) {
                accountNumber++;
            }
        }
        System.out.println(accountNumber);
        
        allaccount = new Account[accountNumber];
        
        for(int i = 0; i < account.size(); i++) {
            if(account.get(i).getName().equals("홍길동")) {
               allaccount[a] = account.get(i);
               a++;
            }
        }
        
        for(int i = 0; i < accountNumber; i++) {
            System.out.println(allaccount[i]);
        }
        
//       System.out.println(account.get(ac));
        
        //---------------------------
        System.out.println("===================");
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        String transactionDate = format.format(date);
        System.out.println(transactionDate);
        
        SimpleDateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
        String transactionTime = timeformat.format(date);
        System.out.println(transactionTime);
        
        
        
        
        
    }
}
