package com.korai.study.ch12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest01 {
    public static void main(String[] args) {
        List<Integer> score = List.of(85, 92, 78 ,96, 88);
        double avg = 0.0;
        int sum = 0;
        int max = 0 ;
        for(int i = 0; i < score.size();i++){
            sum += score.get(i);
            if (max < score.get(i)){
                max = score.get(i);
            }
        }
        avg = (double)sum/score.size();

        System.out.println("전체 점수 : " + score);
        System.out.println("평균 : " + avg);
        System.out.println("최고 점수 : " + max);
    }

}
