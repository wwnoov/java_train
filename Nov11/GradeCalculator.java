package com.myStudy.train.Nov11;

import java.util.Scanner;
/**
 * 요구명세서
 * 스위치문을 이용한 학점프로그램
 * */
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        char grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }


        System.out.println("학점: " + grade);

        scanner.close();
    }
}