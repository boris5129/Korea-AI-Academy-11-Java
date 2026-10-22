package com.korai.study.ch13;

//https://bangu4.tistory.com/215
//내장형 람다 인터페이스

import java.util.function.*;

public class Lambda03 {
    public static void main(String[] args) {
        Runnable runnable = () -> {};       //매개변수 리턴 없음/ 실행형 받는거 없이 그냥 실행만
        Supplier<Integer> supplier = () -> 100; //매개변수는 없지만 리턴있음  리턴자료형을 적어줘야함(제네릭) / 호출하면 리턴만
        Consumer<String> consumer = str -> {};  // 매개변수있고 리턴없음 /매개변수받고 쓰기만함
        Function<Integer, String> function = num -> Integer.toString(num); // 매개변수, 리턴 다있음 함수니깐
        Predicate<Integer> predicate = num -> num % 2 == 0; // 매개변수, 리턴 다있는데 리턴이 boolean이다 리턴이 T/F
        // 얘네 @FunctionalInterface 달린다 인터페이스안에 2개이상의 추상메서드 정의 못하게 막아준다.

        runnable.run();
        int r1 = supplier.get();        //get 해서 지금 위에서 int 리턴
        consumer.accept("");
        String r2 = function.apply(10);     //리턴타입을해서 호출
        boolean r3 = predicate.test(20);

        BiConsumer<String, Integer> consumer2 = (str, num) -> {};
        BiFunction<Integer, Integer, String> function2 = (num1, num2) -> Integer.toString(num1 + num2);
        //첫번쨰 매개 두번쨰 매개변수자료형 3번째 리턴자료형
        BiPredicate<Integer, Integer> predicate2 = (num1, num2) -> num1 % num2 == 0;
        predicate2.and((num1, num2) -> num1 > num2).test(10,2);
        //and를 넣음으로서 2조건 num1 % num2 == 0;, num1 > num2 이게 참이니?
        //바이너리 매개변수가 2개 일때 쓰는거


    }
}
