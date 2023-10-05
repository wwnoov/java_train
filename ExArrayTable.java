package com.myStudy.train;
/**
 * 입력 한 배열의 데이터보다 가로 세로 1씩 더 큰 배열을 생성하고
 * 배열의 마지막 행과 열에 총합을 저장하고 출력하는 프로그램
 * */
public class ExArrayTable {
    public static void main(String[] args)
    {
        //배열 입력
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };
        // 2차원 배열의 값을 result 에 복사 하고 마지막행에는 각 열의 총합
        // 마지막 행에는 마지막 열의 총합이 저장된다.
        int[][] result = new int[score.length+1][score[0].length+1];
        for(int i=0; i < score.length;i++) {
            for(int j=0; j < score[i].length;j++) {
                result[i][j] = score[i][j];
                result[i][score[0].length] += result[i][j];
                result[score.length][j] += result[i][j];
                result[score.length][score[0].length] += result[i][j];
            }
        }
        for(int i=0; i < result.length;i++) {
            for(int j=0; j < result[i].length;j++) {
                System.out.printf("%4d",result[i][j]);
            }System.out.println();
        }
    }
}