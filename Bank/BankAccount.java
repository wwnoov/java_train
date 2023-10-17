package com.myStudy.train.train1016.ex04;

public class BankAccount {
    int minmoney;
    int money;
    public BankAccount(int minmoney) {
        this.minmoney = minmoney;  // -100,000
        money=0;
    }
    void deposit(int money) throws Exception {
        if(money<0)
            throw new Exception("양수를 입력하세요");
        else {
            this.money += money;
        }
    }
    void withdraw(int money) throws Exception {
        this.money =  this.money + money;
        if(money<0)
            throw new Exception("양수를 입력하세요");
        else {
            if(this.money<this.minmoney)
                throw new Exception("최대 인출 금액을 초과했습니다.");

        }
        System.out.println(minmoney+"원을 인출 완료하였습니다");
    }
}
