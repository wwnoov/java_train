package com.myStudy.Char;
/**
  switch로 학점 구하는 프로그램
 */

import java.util.Scanner;

public class SwitchGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학점을 입력하세요");
        String strX = scanner.nextLine();
        int score = Integer.parseInt(strX);
        char grade;
        switch (score/10){
            case 9 :
                grade = 'A';    break;
            case 8 :
                grade = 'B';    break;
            case 7 :
                grade = 'C';    break;
            case 6 :
                grade = 'D';    break;
            default :
                grade = 'F';
        }
        System.out.println("학점은 "+grade+" 입니다");
    }
}