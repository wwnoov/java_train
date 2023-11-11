package com.myStudy.train.Nov11;

import java.util.Scanner;
/**
 * 요구명세서
 * 예금 출금 잔고 기능을 가진 은행프로그램
 * */
public class bank {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int balance = 0;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택> ");

            int a = sc.nextInt();
            sc.nextLine();
                //nextInt()는 꼭 같이 nextLine()이 따라와서 엔터 상쇄 / nextLine()은 한 번만 써주면 됨
                // String m이었으면, m.equals("4")로

            if (a == 4) {
                System.out.println("프로그램 종료");
                break;

            } else if (a == 1) {
                // 예금 액션 진행
                System.out.print("예금액> ");
                balance += sc.nextInt();
                sc.nextLine();

            } else if (a == 2) {
                // 출금 액션 진행
                System.out.print("출금액> ");
                balance -= sc.nextInt();
                sc.nextLine();

            } else if (a == 3) {
                // 잔고 액션 진행
                System.out.println("잔고> " + balance);

            }

        }

        sc.close();

    }

}