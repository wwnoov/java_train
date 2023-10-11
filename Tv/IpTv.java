package com.myStudy.Inheri.exam05;

public class IpTv extends ColorTv{
    private String address;

    public IpTv(String address, int size, int resolution) {
        super(size, resolution);
        this.address = address;
    }

    @Override
    public void printProperty() {
        System.out.println("나의 IPTV는 " + address + " 주소의 " + getSize() + "인치 " + getResolution() + "컬러");
    }
}