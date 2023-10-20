package com.myStudy.train.train1020;

import java.util.ArrayList;
/**
 * 요구명세서
 * 숫자 집합에서 교집합,차집합,합집합 구하는 프로그램
 * */
public class ArrayListExample {
        public static void main(String[] args) {
            ArrayList list1 = new ArrayList();
            ArrayList list2 = new ArrayList();
            ArrayList kyo = new ArrayList(); // 교집합
            ArrayList cha = new ArrayList(); // 차집합
            ArrayList hap = new ArrayList(); // 합집합
            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(4);
            list2.add(3);
            list2.add(4);
            list2.add(5);
            list2.add(6);
            kyo.addAll(list1); // list1의 모든 요소를 kyo에 저장한다.
            kyo.retainAll(list2); // list2와 kyo의 공통요소만 남기고 삭제한다.
            cha.addAll(list1);
            cha.removeAll(list2); // cha에서 list2와 공통된 요소들을 모두 삭제한다.
            hap.addAll(list1); // list1의 모든 요소를 hap에 저장한다.
            hap.removeAll(kyo); // hap에서 kyo와 공통된 모든 요소를 삭제한다.
            hap.addAll(list2); // list2의 모든 요소를 hap에 저장한다.
            System.out.println("list1="+list1);
            System.out.println("list2="+list2);
            System.out.println("kyo="+kyo);
            System.out.println("cha="+cha);
            System.out.println("hap="+hap);
        }
    }