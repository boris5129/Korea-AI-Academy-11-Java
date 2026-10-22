package com.korai.study.ch13;

public class Lambda02 {
    public static void main(String[] args) {
        //모든건 추상메서드가 1개라서 가능하다
        Calculator01 calculator01 = () -> {
            System.out.println("명령이 두개면");
            System.out.println("중괄호 써야한다.");
            };
            //람다는 매개변수와 몸체(함수)만 남기고 사이에 화살표를 넣는다. 생성의 코드니깐 ';' 필수
            //calc가 호출되야지만 실행된다.
        Calculator01 calculator01_1 = () -> System.out.println("명령하나면 {}생략가능");

        Calculator02 calculator02 = () -> {     //명령이 2개니깐 중괄호써야한다.
            System.out.println("명령이 하나");
            System.out.println("명령이 둘");
                return 0;
            };
        //명령이랑 리턴이 있으면 중괄호 생략이 안된다.
        Calculator02 calculator02_1 = () -> 0; //return 값만 있으면 중괄호 생략 return값만 적는다.

        Calculator03 calculator03 = (int num) -> {
                return 0;
            };
        //자료형 생략가능
        Calculator03 calculator03_01 = (num) -> {
            return 0;
        };
        //매개 변수가 하나일때는 () 생략가능, 자료형도 생략가능
        Calculator03 calculator03_02 = num -> {
            return 0;
        };
        //() {} 자료형 다생락하고 리턴 값만
        Calculator03 calculator03_03 = num -> num * 10;
        //매개변수명을 바꿀수 있다.
        Calculator03 calculator03_04 = a -> a * 10;

        Calculator04 calculator04 = (int num1, int num2) -> {
                return num1 + num2;
            };
        //자료형 생략 가능하다
        Calculator04 calculator04_01 = (num1, num2) -> {
            return num1 + num2;
        };
        //매개변수 2개는 () 생략 불가 리턴 생략가능
        Calculator04 calculator04_02 = (num1, num2) -> num1 + num2;
        //매개변수 명 바꿀수있다.
        Calculator04 calculator04_03 = (data1, data2) -> data1 + data2;
        //호출자체는 '인스턴스.추상메서드명' 으로로 호출해야한다.
    }
}
//@FunctionalInterface 달면 람다쓰기위해 1개의 추상메서드만 쓰라고 강제함
@FunctionalInterface
interface Calculator01 {
    void calc();
}
@FunctionalInterface
interface Calculator02 {
    int calc();
}
@FunctionalInterface
interface Calculator03 {
    int calc(int num);
}
@FunctionalInterface
interface Calculator04 {
    int calc(int num1, int num2);
}
