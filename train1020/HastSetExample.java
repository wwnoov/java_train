package com.myStudy.train.train1020;

import java.util.*;

/**
 * 자바 HastSet
 * 요구명세서
 * 1~30 사이의 숫자로 빙고판 만들기
 * */

public class HastSetExample {
    public static void main(String[] args) {

        // HashSet을 사용하여 중복되지 않는 숫자를 저장할 집합 생성
        Set set = new HashSet();
        int[][] board = new int[5][5];

        // 1부터 30까지의 난수를 생성하여 set에 추가, 중복된 숫자는 추가되지 않음
        for (int i = 0; set.size() < 25; i++) {
            set.add((int) (Math.random() * 30) + 1 + "");
        }

        // set을 ArrayList로 변환
        ArrayList list = new ArrayList(set);
        Collections.shuffle(list);
        Iterator it = list.iterator();

        // 빙고판을 채워나감
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String) it.next());
                System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}
