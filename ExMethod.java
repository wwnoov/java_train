package com.myStudy.train;
/**
 * 메서드 정의
 * */
public class ExMethod {
    public static void main(String args[]) {
        Student s = new Student();
        s.name = "남원우";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 90;
        s.math = 86;
        System.out.println("이름:"+s.name);
        System.out.println("총점:"+s.getTotal());
        System.out.println("평균:"+s.getAverage());
    }
}
    class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    // 국어 영어 수학의 점수의 합계를 구하는 매서드 생성
    int getTotal() {
        return kor + eng + math;
    }
        // 국어 영어 수학의 점수의 평균를 구하는 매서드 생성
    float getAverage() {
        // 소수점 반올림을 하기위한 식(둘째 자리)
        return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
    }
}