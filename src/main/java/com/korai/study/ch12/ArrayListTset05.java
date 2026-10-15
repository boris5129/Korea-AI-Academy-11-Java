package com.korai.study.ch12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTset05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("사과", "바나나", "포도", "딸기"));

        for(int i = 0; i < list.size(); i++){
            if(list.contains("포도")){
                list.remove("포도");
                list.add("망고");
                list.remove("딸기");
                list.addFirst("체리");
            }
        }
        System.out.println(list);
    }
}
