package com.korai.study.ch07;

public class AbstractMain02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Animal animal = new Animal();
        // Animal animal1 = dog;  / animal을 상속을 안시켜줘서 안됨 extends 전에
        Animal animal1 = dog;
        Animal animal2 = tiger;

    }
}

class Animal {
    String name;

    void move(){
        System.out.println("움직인다.");
    }
}

class Dog extends Animal {          // extands 확장시키다 동물을 확장 개
    String name;

    void move(){
        System.out.println("움직인다.");
    }
    void bark(){
        System.out.println("짖다");
    }
}

class Tiger extends Animal {
    String name;

    //void move() {                         Animal이 가지고 잇으니깐 지워도 된다.
    //    System.out.println("움직인다.");
    //}
    void hunt(){
        System.out.println("사냥하다");
    }
}