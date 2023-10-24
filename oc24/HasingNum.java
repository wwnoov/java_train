package train.oc24;

import java.util.*;
/**
 * 요구명세서
 * 1~30숫자 빙고판을 만들어라
 * hastSet사용 (중복X)
 * */


public class HasingNum {
    public static void main(String[] args) {
        Set set = new HashSet();
        int[][] board = new int[5][5];
        for(int i=0; set.size() < 25; i++) {
            set.add((int)(Math.random()*30)+1+"");
        }
        ArrayList list = new ArrayList(set);
        Collections.shuffle(list);
        Iterator it = list.iterator();
        for(int i=0; i < board.length; i++) {
            for(int j=0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String)it.next());
                System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}