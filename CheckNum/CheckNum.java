package com.myStudy.train.train1016.ex05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("이름 전화번호 이메일을 입력하세요:");
        String name = scanner.next();
        String tel = scanner.next();
        String email = scanner.next();

        boolean name_check = Pattern.matches("^[가-힣]*$", name);
        boolean tel_check = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", tel);
        boolean email_check = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", email);

        System.out.println("이름 : "+name+" "+name_check);
        System.out.println("전화번호 : "+tel+" "+tel_check);
        System.out.println("이메일 : "+email+" "+email_check);
    }
}

