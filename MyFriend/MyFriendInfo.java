package com.myStudy.Inheri.exam04;

public class MyFriendInfo extends  MyFriend{
    private String addr;
    private String phone;

    public MyFriendInfo(String name, int age, String addr, String phone) {
        super(name, age);
        this.addr = addr;
        this.phone = phone;
    }
    public void ShowMyFriendInfo()
    {
        ShowMyFriend();
        System.out.println("주소: "+ addr);
        System.out.println("전화: "+ phone);
    }
}