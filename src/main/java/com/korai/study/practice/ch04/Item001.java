package com.korai.study.practice.ch04;

public class Item001 {
    public static void main(String[] args) {
        String a = "hi";
        String b = "hi";
        String c = new String("hi");
        System.out.println((a == b) + " " + (a == c) + " " + a.equals(c));
    }
}

class Item {
    int v;

    static void change(int n, Item b) {
        n = 100;
        b.v = 100;
    }
//    int x = 1;      //x값은 1
//    Item bx = new Item();   //item을 bx라는 변수로 생성
//    bx.v = 1;       //아이템 v의 값에 1
//    change(x, bx);      // 체인지메서드에 n에x b에 bx값
//    System.out.println(x + " " + bx.v);
//
//    static void reset(Item it) {
//        it = new Item();
//        it.v = 0;
//    }
//    Item item = new Item();
//    item.v = 5;
//    reset(item);
//    System.out.println(item.v);


}


