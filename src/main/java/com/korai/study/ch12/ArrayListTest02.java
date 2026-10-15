package com.korai.study.ch12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest02 {
    public static void main(String[] args) {
        List<String> list
                = List.of("Java", "Phyton", "Java", "C++", "Phyton","go");
        List<String> newList = new ArrayList<>();

        for (int i = 0; i < list.size();i++){
            if(newList.contains(list.get(i))){
                continue;
            }
            newList.add(list.get(i));
        }
        System.out.println(list);
        System.out.println(newList);
    }
}
