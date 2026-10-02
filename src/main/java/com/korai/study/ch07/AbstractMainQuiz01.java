package com.korai.study.ch07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AbstractMainQuiz01 {
    /*
    단일 리스트 생성 및 요소 추가문자열(String)을 담는 ArrayList 객체를 생성하고 변수명을  fruits로 지정하세요.
    fruits에 "사과", "바나나", "딸기"를 순서대로 add() 하세요.
    문자열(String)을 담는 LinkedList 객체를 생성하고 변수명을 vegetables로 지정하세요.
    vegetables에 "당근", "양파"를 순서대로 add() 하세요.
     업캐스팅을 활용한 2차원 리스트 구성List<String>을 요소로 가지는 ArrayList 객체를 생성하고 변수명을 cart로 지정하세요.
     (타입: ArrayList<List<String>>)cart에 fruits(ArrayList)와 vegetables(LinkedList)를 각각 add()하여 담으세요.
      (하위 구현체가 상위 인터페이스 List로 업캐스팅되어 들어감)조회 및 출력fruits와 vegetables를 각각 출력해보세요.
      cart의 0번째 리스트에서 1번째 요소(인덱스 0의 인덱스 1 $\rightarrow$ "바나나")를 .get()으로 꺼내서 출력해보세요.
      cart의 1번째 리스트에서 0번째 요소(인덱스 1의 인덱스 0 $\rightarrow$ "당근")를 .get()으로 꺼내서 출력해보세요.
      기본 타입 캐스팅 복습double price = 1500.75; 변수를 선언하세요.
      price를 정수형(int)으로 강제 형변환(다운캐스팅)하여 int roundedPrice 변수에 대입하고 출력해보세요.
     */
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("딸기");
        LinkedList<String> vegetables = new LinkedList<>();
        vegetables.add("당근");
        vegetables.add("양파");
        ArrayList<List<String>> cart = new ArrayList<>();
        cart.add(fruits);
        cart.add(vegetables);
        System.out.println(cart);
        System.out.println(fruits);
        System.out.println(vegetables);
        System.out.println(cart.get(0).get(1));
        System.out.println(cart.get(1).get(0));

        double price = 1500.75;
        int roundedPrice = (int)price;
        System.out.println(roundedPrice);
    }
}
