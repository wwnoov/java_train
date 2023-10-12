package com.myStudy.train.train1012.ex01;
/**
 * 요구사항
 * 이름과 주민등록 번호를 저장하는 기능의 클래스 생성
 * 주빈등록번호를 기반으로 이름을 찾는 기능
 */

public class PersonInfoExample {
    public static void main(String[] args)
    {
        PersonNumber storage=new PersonNumberStorage(100);
        storage.addPersonalInfo("남원우", "900000-1122333");
        storage.addPersonalInfo("김원우", "950000-1122334");

        System.out.println(storage.searchName("900000-1122333"));
        System.out.println(storage.searchName("950000-1122334"));
    }
}