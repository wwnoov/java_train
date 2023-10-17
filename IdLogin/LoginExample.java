package com.myStudy.train.train1016.ex01;

/**
 *  예외처리 연습
 *  요구명세서
 *  존재하지 않는 ID를 입력했을경우 아이디 예외처리
 *  잘못된 비밀번호를 입력했을때는 비밀번호 예외처리 프로그램
 * */

public class LoginExample {

    public static void main(String[] args) {
        try {
            login("write","12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        try {
            login("blue","54321");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void login (String id , String password) throws Exception {
        //id가 "blue"가 아니라면 NoExistIdException 발생시킴
        if (!id.equals("blue")) {
            throw new NoExistIDException("아이디가 존재하지 않습니다.");
        }

        //password가 "12345"가 아니라면 WrongPasswordException을 발생시킴
        if (!password.equals("12345")) {
            throw new WrongPasswordException("패스워드가 틀립니다.");
        }
    }
}
