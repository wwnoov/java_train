package com.myStudy.train.train1012.ex05;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SubHumanExample {
    Scanner scan = new Scanner(System.in);
    public void changeChannel() {
        System.out.println("채널을 입력하세요.");
        System.out.println("ex) 20 30 45 70 120");
        System.out.print(">> ");

        String str = scan.nextLine();
        String[] Channel = str.split("\\s+");

        Alpha ap = new Alpha();
        Bravo br = new Bravo();
        Charlie ch = new Charlie();

        int a = 0;
        int b = 0;
        int c = 0;
        int i = 0;

        while (true) {
            i++;

            if (i % 3 == 0) {
                ch.changeChannel(Channel, 1, a, i);
                a++;

                if (i % 5 == 0) {
                    ap.changeChannel(Channel, 0, b, i);
                    b++;
                }

                if (i % 11 == 0) {
                    br.changeChannel(Channel, 0, c, i);
                    c++;
                }
            } else if (i % 5 == 0) {
                ap.changeChannel(Channel, 1, b, i);
                b++;

                if (i % 11 == 0) {
                    br.changeChannel(Channel, 0, c, i);
                    c++;
                }
            } else if (i % 11 == 0) {
                br.changeChannel(Channel, 1, c, i);
                c++;
            } else {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(i + " 시간이 가는 중...");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}