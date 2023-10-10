package com.myStudy.ex_myClass;
/**
 * 클래스 연습 문제
 * */
public class Product {
        int price; // 제품의 가격
        int bonusPoint; // 제품구매 시 제공하는 보너스점수
        Product() {

        }
        Product(int price) {
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }
    }
    class Tv extends Product {
        Tv() {
            super(); //Product()를 호출
        }
        public String toString() {
            return "Tv";
        }
    }
    class Ex_product {
        public static void main(String[] args) {
            Tv t = new Tv();
        }
}