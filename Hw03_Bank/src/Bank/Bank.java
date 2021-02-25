package Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    
//    private ArrayList<Account> accounts; // 다형성이 가능하다면 List로 만들어주면 좋다
    private List<Account> accounts;
    private int totalAccount;
    
    public Bank() {
        this.totalAccount = 0;
        this.accounts = new ArrayList<Account>();
    }
    


    public void setTotalAccount(int totalAccount) {
        this.totalAccount = totalAccount;
    }

    @Override
    public String toString() {
        return "Bank [accounts=" + accounts + ", totalAccount=" + totalAccount + "]";
    }
    
    //-----------------------------------
    
   


    public void addAcount(String accountNo, String name) {
        accounts.add(new Account(accountNo, name));
        totalAccount++;
    }
    
    public Account getAccount(String accountNo) {
        int accountNum = -1;
        for(int i = 0; i < totalAccount; i++) {
            if(accounts.get(i).getAccountNo().equals(accountNo)) {
                accountNum = i; 
            }
        }
        return accounts.get(accountNum);
    }
    
    
    public List<Account> findAccounts(String name) {
        List<Account> allaccount = new ArrayList<Account>(); // 사용자 한명이 가진 계좌의 목록
       
        for(int i = 0; i < totalAccount; i++) {
            if(accounts.get(i).getName().equals(name)) {
               allaccount.add(accounts.get(i));
            }
        }
        
        return allaccount;
    }
    
    public List<Account> getAccounts() { // 계좌목록을 본다.
        return accounts;
    }
    
    public int getTotalAccount() {
        return totalAccount;
    }
    
    
    
}
