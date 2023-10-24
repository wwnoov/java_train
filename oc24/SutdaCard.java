package train.oc24;

import java.util.HashSet;
/**
 * 요구명세서
 * 섯다 프로그램
 * hashSet를 사용해도 중복이 나와서
 * hashcode 오버라이딩하여서 문제해결
 * */
public class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public boolean equals(Object obj) {
        if(obj instanceof SutdaCard) {
            SutdaCard c = (SutdaCard)obj;
            return num==c.num && isKwang==c.isKwang;
        } else {
            return false;
        }
    }
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
    //Hashcode를 오버라이딩하여 중복문제해결
    public int hashCode() {
        return toString().hashCode(); // String클래스의 hashCode()를 호출한다.
    }
}
class SutdaCardExample {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3,true);
        SutdaCard c2 = new SutdaCard(3,true);
        SutdaCard c3 = new SutdaCard(1,true);
        HashSet set = new HashSet();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        System.out.println(set);
    }
}