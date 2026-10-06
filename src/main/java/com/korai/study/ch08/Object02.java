package com.korai.study.ch08;

import java.util.Objects;

public class Object02 {
    public static void main(String[] args) {

        class Student {
            private  String name;
            private  int age;

            public Student(String name, int age) {          //alt + insert  생성자
                this.name = name;
                this.age = age;
            }


            @Override
            public boolean equals(Object o) {
                if (o == null || this.getClass() != o.getClass()) return false; // 패키지 위치까지 본다. 전체를 본다.
                Student student = (Student) o;
                return age == student.age && Objects.equals(name, student.name);
                //return age == student.age && name.equals(student.name); name이 null 이면 실행x 불안정
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, age);     // 뒤에 s 가 붙으면 util 클래스 (도구) 클래스가 뭐든 값만 비교한다
                // equals는 자료형까지 보는거 hashcode는 값만
            }
        }

        Student student1 = new Student("김준일", 33);  // 주민등록번호에 이름  hash 값은 같다.
        // equals 로 인해 값비교가 되었다.
        Student student2 = new Student("김준일", 33);  // 운전면허증에 이름   같은 이름이지만 주소가 다르다.
        Student student3 = student1;


        boolean reult1 = student1.equals(student2);     // this(나)는 1
        boolean reult2 = student1.equals(student3);

        System.out.println(reult1);
        System.out.println(reult2);

        System.out.println(student1 == student2);  //위와 동일 코드다.
        System.out.println(student1 == student3);   // 이건 주소비교

        System.out.println(student1.hashCode() == student2.hashCode()); // hash코드 값은 같다.
        System.out.println(student1.hashCode());              // hash값으로 비교 출력에 숫자
        System.out.println(Objects.hash("김준일", 33)); // hash값으로 비교 출력에 숫자
        System.out.println(Objects.hash("김준일")); // hash값으로 비교 /  조합된 값이 다르다.
        System.out.println(Objects.hash( 33)); // hash값으로 비교
    }
}
