package com.myStudy.train.train1012.ex03;
import java.util.Scanner;
/**
 * 요구사항
 * TV자동 채널 변경 프로그램
 * 10,20,25,120 채널중에 가까운번호의 채널로 자동변경
 * */
public class SmartTvExample {
    public static void main(String[] args) {
        example1();
    }
    private static void example1() {

        System.out.println("이동할 채널을 입력해주세요");

        Scanner sc = new Scanner(System.in);
        int inputnum = sc.nextInt();

        SmartTv smartTV = new SmartTv();

        smartTV.setChannel(inputnum);

    }
}
