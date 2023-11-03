package train.Nov03;

import java.util.Scanner;

/**
 * 요구명세서
 *  최종적으로 도착할 지점의 좌표를 출력하는 프로그램을 작성하시오.
 * L : 왼쪽으로 한 칸 이동
 * R : 오른쪽으로 한 칸 이동
 * U : 위로 한 칸 이동
 * D : 아래로 한 칸 이동
 * 가장 왼쪽 위 좌표는 (1,1) 이며, 시작 좌표는 항상 (1,1)이다.
 * */
public class Moving {
    public static void main(String[] args) {
        // 입력 값 받기
        Scanner scan = new Scanner(System.in);
        System.out.println("이동할 칸을 입력해주세요");
        int n = scan.nextInt();
        System.out.println("위치값을 입력해주세요.");
        scan.nextLine();
        String route = scan.nextLine().replaceAll(" ", "");

        // 이동 명령어에 따라 좌표 이동
        int x = 1, y = 1;

        for(char direction : route.toCharArray()){
            switch(direction){
                case 'U':
                    x = (x - 1 < 1 ? x : x - 1);
                    break;
                case 'D':
                    x = (x + 1 > n ? x : x + 1);
                    break;
                case 'L':
                    y = (y - 1 < 1 ? y : y - 1);
                    break;
                case 'R':
                    y = (y + 1 > n ? y : y + 1);
                    break;
            }
        }

        System.out.println(String.format("현재좌표 :  (%d, %d)", x, y));
    }
}