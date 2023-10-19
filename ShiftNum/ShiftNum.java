package com.myStudy.train.train1019;
import java.util.Scanner;

/**
 * 요구명세서
 * 숫자를 입력받아 배열에 저장하고
 * 배열을 오른쪽으로 1칸 Shift한다.
 *  */
public class ShiftNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("배열의 크기를 입력하세요");
        int n = sc.nextInt();

        // 데이터를 담을 배열
        int[] data = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("data["+i+"] : ");
            data[i] = sc.nextInt();
        }

        // 바뀌기 전
        for(int i=0; i<n; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        // 오른쪽으로 1칸 Shift
        int temp = data[n-1];
        for(int i=n-1; i>=1; i--) {
            data[i] = data[i-1];
        }
        data[0] = temp;

        // 바뀐 후
        for(int i=0; i<n; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}