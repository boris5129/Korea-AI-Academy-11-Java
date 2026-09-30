package com.korai.study.ch05;

public class Dia {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2*i-2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++){
                System.out.print("*");
            }
            for (int j = 5; j < i-1; j++) {
                System.out.printf(" ");
            }
            System.out.println();

        }
    }
}
