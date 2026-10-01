package com.korai.study.ch06;

public class Method01 {
    public static void main(String[] args) {
        new Method0101().run(); // 도 가능
        Method0101 m0101 = new Method0101(); // new 생성자 호출
        m0101.run();
        Method0102.run();
    }
}
class Method0101 {//생성자 - java에서는 클래스명   생성자() 이렇게 생김  힙메모리에 주소를 할당, (주소를 리턴)
    // 생성자도 함수도 자기자신을 리턴하는
    void run() {// void 리턴이 없다  -- 함수명이 자료명
        // 인스턴스 메소드 / 메모리에 (생성해야)실존하는 객체 - 인스턴스
        System.out.println("1");
    }
}
class Method0102{
    static void run() {
        System.out.println("2");
    }
}
