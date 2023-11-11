package com.myStudy.train.Nov11;
/**
 * 요구명세서
 * 랜덤함수를사용해 5가지 난수를 방생하여 1차원배열에 입력하고 배열의 최대 , 최소 , 중간값을 출력하는 프로그램
 * */
import java.util.Arrays;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1; // 1부터 100까지의 랜덤한 숫자 생성
        }


        System.out.println("배열에 저장된 숫자: " + Arrays.toString(numbers));


        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }


        Arrays.sort(numbers);
        int middleIndex = numbers.length / 2;
        int middleValue = numbers[middleIndex];


        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
        System.out.println("중간값: " + middleValue);
    }
}