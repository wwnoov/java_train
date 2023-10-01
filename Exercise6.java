package com.myStudy.train;

/**
 조건문 연습
 1~20까지의 정수중 2또는3의 배수가 아닌수 의 총합 구하기
 */

public class Exercise6 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0 && i % 3 != 0)
                sum += i;
        }
        System.out.println("sum=" + sum);
    }
}