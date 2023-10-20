package com.myStudy.train.train1020;

import java.util.*;
/**
 *자바 제네릭
 * */
class Student implements Comparable<Student>{

    // 학생 정보를 저장하는 필드들
    String name;
    int ban;
    int no;
    int kor, eng, math;

    // 생성자: 학생 정보를 초기화
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        }

    // 총점을 계산하는 메소드
        int getTotal() {
        return kor+eng+math;
        }

    // 평균을 계산하고 소수점 둘째 자리에서 반올림하여 반환하는 메소드
        float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
        }

    // 학생 정보를 문자열로 표현하는 메소드 (toString 오버라이딩)
public String toString() {
        return name +","+ban +","+no +","+kor +","+eng +","+math
        +","+getTotal() +","+getAverage();
        }
    // 이름을 기준으로 학생 객체를 비교하기 위한 compareTo 메소드 구현
public int compareTo(Student s) {
        return name.compareTo(s.name);
        }
        }
class StudentExample {
    public static void main(String[] args) {
        // Student 객체를 담는 ArrayList 생성
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("남원우",1,1,100,100,100));
        list.add(new Student("김원우",1,2,90,70,80));
        list.add(new Student("박원우",1,3,80,80,90));
        list.add(new Student("이원우",1,4,70,90,70));
        list.add(new Student("금원우",1,5,60,100,80));
        // 학생 객체를 이름을 기준으로 정렬
        Collections.sort(list);
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}