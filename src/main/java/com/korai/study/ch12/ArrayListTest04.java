package com.korai.study.ch12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest04 {
    public static void main(String[] args) {
        List listA = List.of(5 ,2, 8);
        List listB = List.of(3 ,9, 1);
        List<Integer> list = new ArrayList<>(); // 3 9 1 5 2 8
        list.addAll(listB);
        list.addAll(listA);

        for (int i = 0 ; i < list.size()-1; i++){       // 비교횟수 01 12 23 34 만하면됨 마지막x
            for (int j = 0; j < list.size() -i -1;j++){ // 반복횟수가 바퀴마다 1개씩 확정나니 -i만큼 적게
                int temp = list.get(j);                 // 빈컵에 담고
                if(list.get(j) > list.get(j+1)){        // 앞에가 뒤보다 크면
                    list.set(j, list.get(j+1));         // j 자리에 j 다음데이터
                    list.set(j+1, temp);                // j+1 자리에 j 데이터
                }
            }
        }System.out.println(list);


    }
}
