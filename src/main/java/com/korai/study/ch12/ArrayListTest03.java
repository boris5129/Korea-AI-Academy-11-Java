package com.korai.study.ch12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest03 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        ArrayList<Integer> newNums = new ArrayList<>();
        for(int i = 1; i < 21; i++){
            nums.add(i);
        }
        for(int i = 0; i < nums.size();i++){
            if((nums.get(i)%3) == 0){
                newNums.addFirst(nums.get(i));
            }
        }
        System.out.println(nums);
        System.out.println(newNums);

    }
}
