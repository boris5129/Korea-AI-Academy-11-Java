package com.korai.study.ch12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTset05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("사과", "바나나", "포도", "딸기"));

        int a = list.indexOf("포도");
        if(a != -1){
            list.set(a, "망고");
        }
        list.remove("딸기");
        list.addFirst("멜론");


        System.out.println(list);
    }
}
