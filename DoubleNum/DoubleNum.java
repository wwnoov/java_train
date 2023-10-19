package com.myStudy.train.train1019;
import java.util.Scanner;

/**
 * 요규명세서
 * 배열의 크기를 입력받고
 * 배열을 입력받아 중복된 쌍의 갯수를 출력하는 프로그램
 * */
public class DoubleNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하세요");
        // 배열 크기 입력
        int n = sc.nextInt();
        int[] data = new int[n];

        // 데이터 입력
        for(int i=0; i< n; i++) {

            System.out.print("data["+i+"] : ");
            data[i] = sc.nextInt();      
         

        }

        int count=0;
        // 중복된 쌍 찾기
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(data[i] == data[j]) {
                    // 중복된 쌍 출력
                    System.out.println("(" + data[i] + "," + data[j] + ")");
                    count++;
                }

            }
        }
        // 중복된 쌍의 개수 출력
        System.out.println("중복된 쌍의 개수 : "+count);
        sc.close();
    }
}