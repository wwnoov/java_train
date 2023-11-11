package com.myStudy.train.Nov11;

import java.util.Scanner;
/**
 *  요구명세서
 * 역삼각혁 출력 프로그램
 * */
public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("삼각형의 크기를 입력하세요: ");
        int n = scanner.nextInt();


        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}