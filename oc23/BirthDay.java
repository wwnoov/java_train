package train.oc23;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 * 요구명세서
 * 태어난날부터 오늘까지 며칠이 지났는지 계산해서 출력
 * */
public class BirthDay {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1990, 1, 19); // 자신의 생일을 지정
        LocalDate now = LocalDate.now();
        long days = birthDay.until(now, ChronoUnit.DAYS);
        System.out.println("태어난날 = "+birthDay);
        System.out.println("오늘은 = "+now);
        System.out.println(days +"일이 지났습니다.");
    }
}