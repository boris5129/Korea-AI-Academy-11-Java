package com.korai.study.ch06;

public class Method03 {
    public static void main(String[] args) {
        System.out.println(new Student());
        System.out.println(new Student("김준일"));
        System.out.println(new Student("김준일", 33));
    }
}
//생성자 overloading
class Student {
    String name;
    int age;
    String address; // String이 2개가 되면 name이나 address만으로는 생성불가능

    Student(){
        System.out.println("이름, 나이 없이 생성");

    }
    Student(String name){
        System.out.println("이름만으로 생성");
        this.name = name;

    }
    Student(int age){
        System.out.println("나이만으로 생성");
        this.age = age;

    }
    Student(String name, int age){
        System.out.println("이름, 나이 생성");
        this.name = name;
        this.age = age;
    }
    Student(int age, String address){
        System.out.println("이름, 나이 생성");
        this.address = address;
        this.age = age;
    }

    @Override  // alt + ins
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", agd=" + age +
                '}';
    }
}
