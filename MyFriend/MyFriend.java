package com.myStudy.Inheri.exam04;

public class MyFriend {
    private String name;
    int age;

    public MyFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void ShowMyFriend() {
        System.out.println("이름: "+ name);
        System.out.println("나이: "+ age);
    }
}
