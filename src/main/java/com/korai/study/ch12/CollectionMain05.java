package com.korai.study.ch12;

import java.util.*;

//프레임워크 - 공용도구 // 컬렉션프레임워크 다수의데이터를 클래스로 구조화했다
public class CollectionMain05 {
    public static void main(String[] args) {
        Collection<String> names1 = new ArrayList<>();        //interface  무조건 구현
        Collection<String> names2 = new LinkedList<>();        //interface  무조건 구현
        Collection<String> names3 = new HashSet<>();        //interface  무조건 구현
        Collection<String> names4 = new TreeSet<>();        //interface  무조건 구현
        //업캐스팅으로 전부 가능하다 다 Collection 밑이라서 가능
        Map<String, Integer> ageMap = new HashMap<>(); //Map만 다르다

    }
}
