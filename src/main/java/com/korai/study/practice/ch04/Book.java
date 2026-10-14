package com.korai.study.practice.ch04;

public class Book {
    //static은 class(자료형) 자체에 붙어있다
    // static 붙은건 인스턴스호출해서 열고, 안붙은건 클래스의 변수에
    // ex) Book b = new Book     b.name    Book.author

    /* 클래스안에 들어가는거
     * 필드 - 1.인스턴스 필드, 2. static필드
     */
        String name;
        static String author; //변수 여러개 생기면안되서 static //상수 (final) 하려면 초기화해야한다(값1개는 있어야한다)
    // 메서드(함수) - 1.생성자, 2.인스턴스메서드, 3. static메서드 (밑에꺼)
    Book(){}    //생성자
    Book(String name){this.name = name;}
    String getName(){return name;}
    void print(){}
    static String getAuthor() {return  author;}
    static void staticPrint(){}
    // 내부클래스 - 1.인스턴스클래스 2. static필드
    class Page{}
    static class Page2{}        //클래스 정의는 존재하지않는 자료형을 정의하는것
}

class BookMain{
    static void main(String[] args) {
        int a = 10;
        Book b = new Book();
//        newBook(10, b);
//        Book.page p1 =
    }

    public static void newBook(int num){

    }
}