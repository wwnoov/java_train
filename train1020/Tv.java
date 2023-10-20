package com.myStudy.train.train1020;
/**
 * 자바 롬복
 * */
import lombok.Data;

@Data
public class Tv {

    private boolean isPowerOn;
    private int channel;
    private int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // 볼륨 설정 메서드
    public void setVolume(int volume){
        if(volume > MAX_VOLUME || volume < MIN_VOLUME)
            return;
        this.volume = volume;
    }
    // 현재 볼륨을 가져오는 메서드
    public int getVolume(){
        return volume;
    }

    // 채널 설정 메서드
    public void setChannel(int channel){
        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return;
        this.channel = channel;
    }

    // 현재 채널을 가져오는 메서드

    public int getChannel(){
        return channel;
    }
}
class TvExample {
    public static void main(String args[]) {
        Tv t = new Tv();
        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:"+t.getVolume());
    }
}