package com.myStudy.train.train1019;
import java.util.Scanner;

/**
 * 요구명세서
 * 숫자를 입력받아 그숫자까지의
 * 소수를 구하기.
 * */

public class DecimalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        int n = sc.nextInt();


        for(int i=2; i<=n; i++) {
            boolean isPrime = true; // 초기 값
            for(int j=2; j*j<=i; j++) {
                if(i % j == 0) {
                   // 소수가 아니다.
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                // 소수 일때만 값을 출력
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}