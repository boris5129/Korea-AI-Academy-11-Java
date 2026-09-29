package com.korai.study.ch03.access;

public class AccessMain4 {
    public static void main(String[] args) {
        School2 s = new School2();
        //s.name = "부경대"; private 로 인해 name 사용 불가능
        s.setName("부경대"); // setName 을 통해 name 을 불러옴
    }
}

class AccessMain5 {
    static void run(){
        School2 s = new School2();
    }
}

class School2 {
    private String name; // private - 비공개 자기 class 에서만 사용가능 다른 class 사용 불가능

    //setter 저장하는애
    void setName(String name){ //setName 한테 private를 가르쳐줘
        this.name = name; //static이 없어서 인스턴스끼리 참조 (위 private를 참조)
    }
    //getter 가져오는애
    String getName(){
        return name; // 가져오니깐 리턴
    }


}
