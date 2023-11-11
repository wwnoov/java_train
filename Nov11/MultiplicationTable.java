package com.myStudy.train.Nov11;
/**
 * 요구명세서
 * 숫자로 단을 입력하면 정해진단을 출력하는 프로그램
 * */
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("구구단을 출력할 숫자를 입력하세요: ");
        int number = scanner.nextInt();

        System.out.println(number + "단을 출력합니다:");
        for (int i = 1; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        scanner.close();
    }
}