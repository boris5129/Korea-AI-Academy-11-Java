package com.korai.study.ch01;

public class ClassMain {
    public static void main(String[] args) {
        // [ 변수와 자료형 ]
        int num = 10;
        final String name = "김준일"; // 상수

        class Student {
            String name;
            int age;
        }

        Student jun = new Student();
        jun.name = "김준일";
        jun.age = 33;

        class Student2{
            String name;
            Object age; // 사용시 원래기능 잃음
        }

        Student2 jun2 = new Student2();
        jun2.name = "김준이";
        jun2.age = jun;

        Student2 jun22 = new Student2();
        jun22.name = "김준이이";
        jun22.age = "33";

        System.out.println("33" + 33);

        class Student3<A>{ //<> 자료형자체를 변수화 제네릭
            String name;
            A age;
        }

        Student3<String> jun3 = new Student3<String>();//회색은 생략이 가능하다는 의미
        Student3<Integer> jun33 = new Student3<>();//원래는 뒤 <>에 어떤 자료형인지 적어야하는데 앞에 있어서 생략가능

        jun3.age = "33";
        jun33.age = 33;

        int num2 = num;
        Student3<String> jun333 = jun3;//자료형이 같다 jun33은 Integer라 안됨
        Student3<?> jun444 = jun33; // ? 를 사용하면 가능 어떤자료형인지 모른다.
        // ? - 제네릭의 와일드카드(뭐든됨) 라고 함

    }
}
