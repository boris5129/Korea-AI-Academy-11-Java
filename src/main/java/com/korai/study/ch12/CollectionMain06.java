package com.korai.study.ch12;

import java.util.ArrayList;
import java.util.List;

public class CollectionMain06 {
    public static void main(String[] args) {
        A1.run();       //A1의 리스트를 불러온다
        A2.run();
        A3.run();
        A4.run();
    }
}

class A1 {
    static void run() {
        ArrayList<String> strList = new ArrayList<>();
        // 값 추가
        strList.add("데이터1");
        //값 여러개 한번에 추가
        strList.addAll(List.of("데이터2", "데이터3", "데이터4"));
        //addAll Collection 상속받은애들/ list.of 불변리스트: 바뀌지않는 리스트자료로 한번에 가능(list가 collection)
        strList.addFirst("데이터5");   //제일앞에 넣겠다.
        strList.addLast("데이터6"); //제일뒤 add 기본이랑 똑같다
        strList.add(2, "데이터7"); //인덱스 위치에 추가

        System.out.println(strList);
    }
}
class A2 {
    static void run() {
        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(List.of("데이터1", "데이터2", "데이터3", "데이터4"));
        boolean isRemoved = strList.remove("데이터2"); // 데이터2를삭제해라 리턴 트루
        String removedObject = strList.remove(2);   // 2번인덱스를 지워라 리턴 2번인덱스값
        strList.addAll(List.of("데이터5", "데이터6", "데이터7", "데이터8"));
        strList.removeAll(List.of("데이터6", "데이터7"));
        System.out.println(strList);
        strList.removeLast();//size - 1
        strList.removeFirst(); //remove 0번 인덱스
        //strList.removeIf() 조건식(람다)넣어서 조건참일떄 삭제
    }
}
class A3 {
    static void run() {
        List<String> strList = List.of("데이터1","데이터2","데이터3");
        //ArrayList<String> strList = List.of("데이터1","데이터2","데이터3"); 자료형이 안맞아서 안됨
        // List에 넣어야함               현재 리턴이 List라서 ArrayList에 못들어감
        String data = strList.get(2);       //get 꺼내라
        System.out.println(data);
    }
}
class A4 {
    static void run() {
        List<String> strList = List.of("데이터1","데이터2","데이터3");
        boolean isContained = strList.contains("데이터2");
        boolean isContained2 = strList.contains("데이터5");
        //contains 포함하고있다. 완전 똑같은게 있는가 (리스트에 저게 있다 T/F)
        System.out.println(isContained);
        System.out.println(isContained2);
        boolean isContained3 = strList.get(1).contains("2");
        //get. contains 하면 인덱스에 x를 포함하고있는가
        System.out.println(isContained3);
    }
}