package com.myStudy.Array;
/**
 * 자바 배열
 * 배열의 값중에 가장 큰값을 반환하는 프로그램
 */
public class ArrayMax {
     public static int max(int[] arr) {
        if(arr==null || arr.length==0)
            return -999999;
        int max = arr[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다.
        for(int i=1; i< arr.length;i++) { // 배열의 두 번째 값부터 비교한다.
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args)
    {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
    }
}
