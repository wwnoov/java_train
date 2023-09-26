package com.myStudy.train;

/**
 대소문자 변경 연습
 */
public class Exercise3 {
        public static void main(String[] args) {
            char ch = 'A';
            char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch+32): ch;
            System.out.println("ch:"+ch);
            System.out.println("ch to lowerCase:"+lowerCase);
        }
    }

