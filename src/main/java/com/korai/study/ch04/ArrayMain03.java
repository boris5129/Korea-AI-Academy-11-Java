package com.korai.study.ch04;

import java.time.LocalDateTime;

public class ArrayMain03 {
    public static void main(String[] args) {
        // 배열을 활용한 반복작업

        int[] nums = new int[100];
        int index = 0;

        while(index < 100){
            nums[index] = index + 1;
            index++;
        } // while문 -  조건이 false 면 stop


        for (int index2 = 0; index2 < 100; index2++ ){
            nums[index2] = index2 + 1;
        }

        long expired = LocalDateTime.now().getSecond() + (1000l * 60 * 60 * 24);

        while(true) {
            if(LocalDateTime.now().getSecond() == expired){
                break;
            }
    }
}
}
