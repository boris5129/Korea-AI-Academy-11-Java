package com.korai.study.ch06;

public class Method02 {
    public static void main(String[] args) {
        System.out.println("100");
        System.out.println(100);
    }
}
//Parameter => 매개변수 => 함수를 사용하는 위치에 값을 전달해주는 변수
//Parameter Overloading
// 함수명이 같을 땐 매개변수의 자료형에 따라 실행될 함수가 결정된다.
// overloading 변수명과 상관없이 자료형에 따라간다. 호출은 매개변수에 의해 정해진다. 리턴자료형에 의해 되는건 아니다.
class Parameter01 {
    static void 세탁하기() {

    }
    static void 세탁하기(int 세제) {

    }
    static void 세탁하기(double 세제) {

    }
    static void 세탁하기(int 세제, int 섬유유연제) {

    }
}