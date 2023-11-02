package train.Nov02.Account;

public class Account {
    private String accountNo;
    private int balance;


    //생성자 작성
    public Account(String accountNo) {
        // TODO Auto-generated constructor stub
        System.out.println(accountNo + " 계좌가 개설되었습니다.");
    }

    //필요한 메소드 작성
    public void deposit(int money) {
        // TODO Auto-generated method stub
        balance += money;
    }

    public void withdraw(int money) {
        balance -= money;
    }

    public void showBalance() {
        // TODO Auto-generated method stub
        System.out.println(balance);
    }
}