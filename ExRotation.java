package com.myStudy.train;
/**
 * 배열을 시계방향으로 회전시키는 프로그램
 * */
public class ExRotation {
    public static void main(String[] args) {
        char[][] star = {
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'}
        };
        // star배열이 4*5 2차원 배열이므로 회전시키려면 5*4 2차원 배열로 변경
        char[][] result = new char[star[0].length][star.length];
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        // star  배열의 값을 result의 적절한 위치로 옮기기
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                int x = j;
                int y = star.length - 1 - i;
                result[x][y] = star[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}