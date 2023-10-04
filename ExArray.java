package com.myStudy.train;
/**
 배열에 담긴 모든 값의 총합과 평균을 구하는 프로그램
 */

public class ExArray {
    public static void main(String[] args){
    int[][] arr = {
            {5, 5, 5, 5, 5},
            {10, 10, 10, 10, 10},
            {20, 20, 20, 20, 20},
            {30, 30, 30, 30, 30}
    };
    int total = 0;
        // floast로 형변환을 하지 않으면 소숫점이 0이 될것이다.
    float average = 0;
        for(
    int i = 0;
    i<arr.length;i++)
    {
        for (int j = 0; j < arr[i].length; j++) {
            total += arr[i][j];
        }
    }
    average =total /(float)(arr.length *arr[0].length);

        System.out.println("합계 = "+total);
        System.out.println("평균 = "+average);
}
}