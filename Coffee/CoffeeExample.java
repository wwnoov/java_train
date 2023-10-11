package com.myStudy.Inheri.exam02;
/**
 * 오버라이딩 연습 커피 맛 출력
 * */
public class CoffeeExample {
    public static void main(String[] args) {
        
        Espresso espresso = new Espresso();
        espresso.taste();
        Americano americano = new Americano();
        americano.taste();
        CafeLatte cafeLatte = new CafeLatte();
        cafeLatte.taste();
    }

}
