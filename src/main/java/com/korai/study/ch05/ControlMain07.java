package com.korai.study.ch05;

public class ControlMain07 {
    public static void main(String[] args) {

        for(int i = 0 ; i < 10; i++){
            if(i % 2 == 0){ // 짝수에서
                continue; // 다음(반복)으로 넘어가라
            }
            System.out.println("i: " + i); // 홀수만 출력
        }
    }
}