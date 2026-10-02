package com.korai.study.ch07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AbstractMain01 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(); // ArrayList 배열과 같다  클래스<자료형을 원하는걸로> 간단하게 자료형배열
        names.add("김주일");
        names.add("김주일");
        names.add("김주일");
        System.out.println(names);
            // 추상화 요소 Add , 둘다 추가하는 요소 부모가 가진 요소 같은 행동(기능) ex) 0.1 과 1 의 추상화는 숫자
        LinkedList<String> names2 = new LinkedList<>();
        names2.add("김주일");
        names2.add("김주일");
        names2.add("김주일");
        System.out.println(names2);
        // 추상화를하면 업캐스팅 다운캐스팅을 할수있다.캐스팅(자료형을 맞춘다 위나 아래로)

        ArrayList<List<String>> lists = new ArrayList<>(); // 2차원 배열 ArraylList배열안에 List 배열, add하면되서 크기x
        double[][] doubles = new double[2][2]; // 크기를 지정해야한다.
        lists.add(new ArrayList<>()); // 업캐스팅? 리스트 안에 Array 리스트를 넣는다
        lists.add(new LinkedList<>());
        lists.add(new ArrayList<>());
        lists.get(0).get(0);                 //애는 객체 []안씀  주소 참조 1번에 1번 객체 1번객 123 2번개 456  1을 꺼낸다

        double d = 10;  // 10을 실수로
        int i = (int) d;  // 실수를 다시 정수로
    }
}
