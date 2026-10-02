package com.korai.study.ch07;

public class AbstractMain03 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        Tiger2 tiger = new Tiger2();
        Animal2 animal = new Animal2();
        Animal2 animal1 = dog;  // 이때 상위개념 (dog의 bark)는 쓸수 없다
        Animal2 animal2 = tiger;

        animal1.move(); // animal꺼는 사용가능
        animal2.move();
        // 오버로딩은 같은거 쓰는거 오버라이드 는 덮어쓴다.

    }
}

class Animal2 {
    String name;

    void move(){
        System.out.println("움직인다.");
    }
}

class Dog2 extends Animal2 {          // extands 확장시키다 동물을 확장 개
    void bark(){
        System.out.println("짖다");
    }
    @Override // 재정의한거 앞에는 쓴다 다른사람 보라고  - @붙은거 -  어노테이션 이라고 함
    void move(){System.out.println("많이움직인다.");  // 같은 move 이게 사용  오버라이드
    }
}

class Tiger2 extends Animal2 {
    //void move() {                         Animal이 가지고 잇으니깐 지워도 된다.
    //    System.out.println("움직인다.");
    //}
    void hunt(){
        System.out.println("사냥하다");
    }
}