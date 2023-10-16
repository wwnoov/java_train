package com.myStudy.train.train1016.ex07;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        
        Student s1 = new Student(1,"남원우");
        hashSet.add(s1);
        System.out.println("저장된 객체 수 :"+hashSet.size());

        Student s2 = new Student(1,"김원우");
        hashSet.add(s2);
        System.out.println("저장된 객체 수 :"+hashSet.size());

        Student s3 = new Student(2,"박원우");
        hashSet.add(s3);
        System.out.println("저장된 객체 수 :"+hashSet.size());
    }
}
