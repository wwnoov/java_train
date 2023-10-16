package com.myStudy.train.train1016.ex10;

public class InExample {
    public static void main(String[] args) throws Exception {
        int speed = 0;
        int keyCode = 0;

        while (true) {
            //enter키를 읽지 않았을 경우에만 실행
            if (keyCode != 13 && keyCode != 10) {
                if (keyCode == 49) { //숫자 1키를 읽었을경우
                    speed++;
                } else if (keyCode == 50) { //숫자 2키를 읽었을경우
                    speed--;
                } else if (keyCode == 51) { //숫자 3키를 읽었을경우
                    break;
                }
                System.out.println("--------------------");
                System.out.println("1 . 증속 ㅣ 2. 감속 ㅣ 3.중지");
                System.out.println("--------------------");
                System.out.println("현재 속도 = " + speed);
                System.out.println("선택:");
            }

            keyCode = System.in.read();
        }
        System.out.println("프로그램 종료");
    }
}