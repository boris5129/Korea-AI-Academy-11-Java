package com.korai.study.ch03.access;

public class AccessMain2 {
    static int age = 10;
     class School {//클래스 정의
        String name; //변수 정의
    }

    public static void main(String[] args) {
        AccessMain2 am2 = new AccessMain2(); // school을 쓰기위해 AM2 틀 을 호출
        School s1 = am2.new School();// am2에대한 new 행위( 붕어빵을 만들자)
        s1.name = "부경대"; // 힙메모리

        System.out.println(s1);
        System.out.println(s1.name); // 힙메모리를 참조

    }

    public static void run() {


        age = 10;
    }
}
// 인스턴스와 스태틱
// new - > 인스턴스 = 붕어빵 힙영역
// class 정의 안에 static 이 있으면 메모리에 계속 존재 new 안해도 됨. static이 틀
// static 영역은 부르는 순간 존재 인스턴스 는 new 해야 사용가능

// AM2 는 붕어빵체인점 int,school 은 틀, static은 빵집 int 쓰려면 빵틀을 만듬 이게 new
class AccessMain3{
    static void run(){
        AccessMain2 am2 = new AccessMain2();
        AccessMain2.School s1 = am2.new School();
    }
}