package com.myStudy.train;

/**
 반복문 연습
 문자열이 숫자인지 판별
 */

public class Exercise9 {
    public static void main(String[] args)
    {
        String value = "1789A";
        char ch = ' ';
        boolean isNumber = true;
        for(int i=0; i < value.length() ;i++) {
            ch = value.charAt(i);
            if(!('0'<=ch && ch<='9')) {
                isNumber = false;
                break;
            }
        }
        if (isNumber) {
            System.out.println(value+"는 숫자입니다.");
        } else {
            System.out.println(value+"는 숫자가 아닙니다.");
        }
    } // end of mai
}
