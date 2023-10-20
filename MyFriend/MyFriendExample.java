package com.myStudy.Inheri.exam04;
/**
 * 자바 상속 연습
 * 친구정보를 기록하고 상세 정보를 기록하는 클래스에 상속하고
 * 이름 나이는 친구정보에서 주소 번호는 상세정보에서
 * */
public class MyFriendExample {
    public static void main(String[] args)
    {
        MyFriendInfo friend = new MyFriendInfo("남원우", 33, "부천", "010-1000-8888");
        friend.ShowMyFriendInfo();

    }
}