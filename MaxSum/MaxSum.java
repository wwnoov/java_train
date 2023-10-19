package com.myStudy.train.train1019;
import java.util.Scanner;

/**
 * 요구명세서
 * 숫자의 갯수를 입력받어
 * 그 숫자들의 합과 최댓값을 출력해라
 * */
public class MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("숫자의 갯수를 입력하세요");
        
        int n = sc.nextInt();
        int[] data = new int[n];

        int sum = 0; // 합
        int max = Integer.MIN_VALUE; // 가장 큰 값

        // 데이터 입력받기
        for(int i=0; i<n; i++) {
            System.out.print(i+1+"번째 값 : ");
            data[i] = sc.nextInt();
        }

        // 최댓값과 총 합 구하기
        for(int i=0; i<n; i++) {
            if(max < data[i]) {
                max = data[i];
            }
            sum += data[i];
        }

        System.out.println("총 합 : " + sum);
        System.out.println("최댓값 : " + max);

        sc.close();
    }
}