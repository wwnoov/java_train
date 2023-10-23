package train.oc23;

import java.util.Calendar;
/**
 * 요구명세서
 * 두개의 날짜를 입력해서 두날짜의 차이를 일단위로 출력
 * */
public class DayDiff {
    static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
        int diff = 0;
        try {
            int year1 = Integer.parseInt(yyyymmdd1.substring(0,4));
            int month1 = Integer.parseInt(yyyymmdd1.substring(4,6)) - 1;
            int day1 = Integer.parseInt(yyyymmdd1.substring(6,8));
            int year2 = Integer.parseInt(yyyymmdd2.substring(0,4));
            int month2 = Integer.parseInt(yyyymmdd2.substring(4,6)) - 1;
            int day2 = Integer.parseInt(yyyymmdd2.substring(6,8));
            Calendar date1 = Calendar.getInstance();
            Calendar date2 = Calendar.getInstance();
            date1.set(year1, month1, day1);
            date2.set(year2, month2, day2);
            diff = (int)((date1.getTimeInMillis()-date2.getTimeInMillis())
                    /(24*60*60*1000));
        } catch(Exception e) {
            diff = 0; // substring(), parseInt()에서 예외가 발생하면 0을 반환한다.
        }
        return diff;
    }
    public static void main(String[] args){
        System.out.println(getDayDiff("20231023","20230919"));
    }
}