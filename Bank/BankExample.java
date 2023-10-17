package com.myStudy.train.train1016.ex04;

import java.util.Scanner;
/** 예외처리 연습
 *  요구명세서
 *  은행에 최저 잔금을 설정하고 최저 잔고보다 큰 금액을 인출할시 예외처리
 * */
public class BankExample {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("인출할 금액을 입력하세요:");
        String input = scanner.nextLine();
        int min = Integer.parseInt(input);
        BankAccount ba = new BankAccount(min);
        ba.withdraw(500000);
    }
}