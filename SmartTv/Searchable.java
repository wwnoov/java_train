package com.myStudy.train.train1012.ex03;

public interface Searchable {
    void search(String url);

    default void setChannel(int channel) {
        if (channel > 0 && channel < 15){
            channel = 10;
        } else if (channel >= 15 && channel < 23){
            channel = 20;
        } else if (channel >= 23 && channel < 47){
            channel = 25;
        } else {
            channel = 120;
        }
        System.out.println("가장 가까운 채널 " + channel+" 으로 이동");
    }
}
