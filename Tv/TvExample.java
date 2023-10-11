package com.myStudy.Inheri.exam05;
/**
 * 상속 연습
 * Tv를 상속하는ColorTv와 IpTv를 만들어서 출력
 * */
public class TvExample {
    public static void main(String[] args) {
        IpTv iptv = new IpTv("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
