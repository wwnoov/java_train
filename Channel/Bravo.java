package com.myStudy.train.train1012.ex05;
import java.util.concurrent.TimeUnit;

public class Bravo implements Human {
    String name = "브라보";

    public void changeChannel(String[] arr, int second, int num, int i) {
        try {
            String[] Channel = arr.clone();

            TimeUnit.SECONDS.sleep(second);
            System.out.println(i + " " + name + "의 현재 채널: " + Channel[num % Channel.length]);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}