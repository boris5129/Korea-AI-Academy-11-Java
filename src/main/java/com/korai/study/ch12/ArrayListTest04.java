package com.korai.study.ch12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest04 {
    public static void main(String[] args) {
        List listA = List.of(5 ,2, 8);
        List listB = List.of(3 ,9, 1);
        List<Integer> list = new ArrayList<>(); // 3 9 1 5 2 8
        List<Integer> list2 = new ArrayList<>();
        list.addAll(listB);
        list.addAll(listA);

        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i)>list.get(j)){
                    list.set(i, j);
                }
            }
        }

        System.out.println(list);
//        for (int i = 0; i < list.size(); i++){
//            int a = list.get(i);        // 3 9 1 5 2 8
//            for (int j = i + 1; j < list.size(); j++){
//                int b = list.get(j);    // 9 1 5 2 8
//                    if(a - b > 0){//a가커
//                        list2.add(b);
//                    }else if(a - b < 0){
//                        list2.add(b);
//                    }
//            }
//        }System.out.println(list2);
    }


}
