package com.myStudy.ex_myClass;
/**
 * 코드실행시 호출되는 생성자 순서 연습
 * */
public class Parent {
        int x=100;
        Parent() {
            this(200); // Parent(int x)를 호출
        }
        Parent(int x) {
            super(); // Object()를 호출
            this.x = x;
        }
        int getX() {
            return x;
        }
    }
    class Child extends Parent {
        int x = 3000;
        Child() {
            this(1000); // Child(int x)를 호출
        }
        Child(int x) {
            super(); // Parent()를 호출
            this.x = x;
        }
    }
    class ExParent{
        public static void main(String[] args) {
            Child c = new Child();
            System.out.println("x="+c.getX());
        }
}