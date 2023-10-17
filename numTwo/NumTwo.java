package com.myStudy.train.train1016.ex03;

import java.util.InputMismatchException;
import java.util.Scanner;
/** 예외 처리 연습
 * 요구명세서
 * 두개의 정수를 입력받아 곱셈 연산 결과 출력
 * 정수가아닌 값을 입력되면 예외가 발생하여 실행중단
 * */

public class NumTwo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x=0,y=0,z=0;
        Scanner input = new Scanner(System.in);
        System.out.print("정수 두 개 입력 : ");
        try {
            x = input.nextInt();
            y = input.nextInt();
            z =x*y;
            System.out.printf("%d * %d = %d %n",x,y,z);
        }catch(InputMismatchException e) {
            System.out.println("정수만 입력해주세요");
        }
    }
}