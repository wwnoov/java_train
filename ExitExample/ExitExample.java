package com.myStudy.train.train1016.ex11;
/**
 * 자바 라이브러리
 * */
public class ExitExample {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            //i값 출력
            System.out.println(i);
            if (i ==5 ){
                //JVM 프로세스 종료
                System.out.println("프로세스 강제 종료");
                System.exit(0);
            }
        }
    }
}
