package com.korai.study.ch07;

public class ObjectMain01 {
    public static void main(String[] args) {
        int num = 10;
        num = 11; // 변수는 대입이 가능하다.
        final int num2 = 10;
        //num2 = 12;   // 불가능
        Student s1 = new Student(111111, "sss");
        Student s2 = new Student();

        School school = new School("ㅇㅇㅇㅇ");
    }
}

class School{
    String name;

 //   School(){                   //자바 특징 기본으로 얘기 되어있는데 밑에꺼가 만들어지면서 사라짐 쓰고싶으면 새로 만들어야함

  //  }

    School(String name){        // 위에꺼를 안적어주면 무조건 정의한대로 적혀야한다
        this.name = name;
    }
}

class Student{
   // final int code; // 초기값이 들어가서 쓸수없는 공간이 되어서 쓰지마라
   // final int code = 2026; // 필수
    final int code; // 필수            // 변하지않는 기본값으로 지정하겠다
    final String name ; //필수
    String address; //선택

    //Arguments => 인자
    //NoArgumentsConstructor (인자들이 없는 생성자. 즉, 생성자의 매개변수가 없음)
    Student(){
        code = 0;           //default 기본값을 넣어 준다.
        name = null;
    }

    //RequiredArgumentsConstructor (필수인자들만 받는 생성자.) Final
    Student(int code, String name){     //new 했을때 호출(생성자) 생성자를 통해 값이 정해짐 9번 라인때 9번의 값으로 정해짐
        this.code = code;           //초기화가 되어야함 초기화될떄 지정하거나 20번처럼
        this.name = name;
    }

    //AllArgumentsConstructor (모든 인자들을 다 받는 생성자)
    Student(int code, String name, String address){
        this.code = code;
        this.name = name;
        this.address = address;
    }

}
