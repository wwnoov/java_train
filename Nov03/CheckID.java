package train.Nov03;

import java.util.HashMap;
import java.util.Scanner;
/**
 * 요구명세서
 * 아이디 비번을 체크 하는 프로그램 작성
 * 팀프로젝트에서 로그인 체크기능
 * */
public class CheckID {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        //아이디,비번 기본 지정
        map.put("mokoko", 123);
        map.put("admin", 12345);
        map.put("test", 111);

        Scanner sc = new Scanner(System.in);
        System.out.print("id : ");
        String id = sc.next();

        System.out.print("pw : ");
        int pw = sc.nextInt();

        if(!map.containsKey(id)) {//map.containsKey(id) == false
            System.out.println("아이디가 존재하지 않습니다.");
        }
        else {
            //존재하는 아이디를 입력받은 경우
            if(map.get(id) != pw) {
                System.out.println("비밀번호 불일치");
            }
            else {
                System.out.println("로그인 성공!");
            }

        }

    }

}
