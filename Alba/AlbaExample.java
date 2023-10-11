package com.myStudy.Inheri.exam03;
/**
 * 상속 연습
 * */
public class AlbaExample {
    public static void main(String[] args) {
        Alba alba = new Alba("남원우", "풀스택", "천재교육");
        System.out.println(alba.getName());
        System.out.println(alba.getSchool());
        System.out.println(alba.getCompany());
    }
}
