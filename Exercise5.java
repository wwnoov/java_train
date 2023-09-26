package com.myStudy.train;

/**
 for 문을 while 으로 바꾸는 연습
 */
public class Exercise5 {
    public static void main(String[] args) {
     /*     for(int i=0; i<=10; i++) {
             for(int j=0; j<=i; j++)
                System.out.print("*");
             System.out.println();
        }
    } */
            int i=0;
            while( i<=10) {
                int j=0;
                while(j<=i) {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                i++;
            }
        }
}
