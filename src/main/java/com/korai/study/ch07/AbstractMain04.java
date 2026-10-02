package com.korai.study.ch07;

import java.util.ArrayList;
import java.util.List;

public class               AbstractMain04 {
    public static void main(String[] args) {
        Dog3 dog = new Dog3();
        Tiger3 tiger = new Tiger3();
        Animal3 animal = new Animal3();
        Animal3 animal1 = dog;  // 이때 상위개념 (dog의 bark)는 쓸수 없다
        Animal3 animal2 = tiger;

        animal1.move(); // animal꺼는 사용가능
        animal2.move();
        // 오버로딩은 같은거 쓰는거 오버라이드 는 덮어쓴다.
        List<Animal2> animals = new ArrayList<>(); // animal2 담을수있다            정확한 배열은 아니라 lauth 대신 size
        animals.add(new Dog2());  //자동 업캐스팅
        animals.add(new Tiger2()); // 추상화시켜서 애니멀로 묶어서 관리

        Dog3 animal1ToDog = (Dog3) animal1; //Dog3 로 다운캐스팅해라 애니멀 자료니깐 앞에 괄호
        animal1ToDog.bark(); // 위에서 다운캐스팅 했으니깐 사용가능
        ((Dog3) animal1).bark();   // animal.bark(); 는 안됨 강제 다운캐스팅

    //    Dog3 animal2ToDog = (Dog3) animal2; // tiger 한테 dog 다운캐스팅하니깐 런타임오류 ClassCastException
      //  animal2ToDog.bark(); //
     //   ((Dog3) animal2).bark(); //



    }
}
// 각 다른 움직임을( 걷고 뛰고) 움직인다 라는 공통적인걸로 한번에 하려고 업 다운 캐스팅 씀
//instanceof ==> 생성된 객체 맞는지 묻는  ex>  instanceof x -> x의 객체가 맞니? t/F

class Animal4 {
    String name;

    void move(){
        System.out.println("움직인다.");
    }
}

class Dog4 extends Animal3 {          // extands 확장시키다 동물을 확장 개
    void bark(){
        System.out.println("짖다");
    }
    @Override // 재정의한거 앞에는 쓴다 다른사람 보라고  - @붙은거 -  어노테이션 이라고 함
    void move(){System.out.println("많이움직인다.");  // 같은 move 이게 사용  오버라이드
    }
}

class Tiger4 extends Animal3 {
    //void move() {                         Animal이 가지고 잇으니깐 지워도 된다.
    //    System.out.println("움직인다.");
    //}
    void hunt(){
        System.out.println("사냥하다");
    }
}