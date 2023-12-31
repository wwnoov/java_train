package train.oc23;

import java.util.*;
/**
 * 각 콜렉션 클래스들의 특징이해
 * Arraylist는 중복 허용 저장순서 유지
 * HashSet은 중복허용 X
 * TreeSet은 정렬해서 저장
 * Stack은 FILO구조
 * */
public class Collection {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);
        HashSet set = new HashSet(list); // 중복요소들이 제거되고 순서유지 안됨 2,6,3,7
        TreeSet tset = new TreeSet(set); // 오름차순으로 정렬된다. 2,3,6,7
        Stack stack = new Stack(); // Stack에 넣었다 꺼내면 저장순서가 반대가 된다.
        stack.addAll(tset); // TreeSet의 저장된 모든 요소를 stack에 담는다.
        while(!stack.empty())
            System.out.println(stack.pop()); // stack에 저장된 값을 하나씩 꺼낸다.
    }
}