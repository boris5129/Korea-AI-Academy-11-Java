package com.korai.study.practice.ch04;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

// @Data // get set eq hc(데이터값비교) tostring 5개 만드는거
@Getter
@Setter         //이위치에하면 전체 적용
public class Author {
    @Getter
    @Setter     //이위치는 개별
    private String name;        //name에만 getter setter 적용됨
    private String birthday;

    public Author(){        //매개변수없다 NoArgsConstructor

    }

    public Author(String name,String birthday){ // AllArgsConstructor 2개 다받는건가능
        this.name = name;
        this.birthday = birthday;
    }
//    public Author(String birthday){       매서드명이같으면 자료형이달라야한다 오버로딩
//        this.name = birthday;
//    }
    @Data
    @RequiredArgsConstructor //매개변수 인자가 필수값이다. final 든것만 받는다 noArgs는 생성안됌
    class Publisher{
        private final String name;      //setter 존재 x 변하지않아야하니깐
        private final String address2;
        private String address;
    }
}

class AuthorMain{
    public static void main(String[] args) {
        Author a = new Author();
        Author.Publisher p = a.new Publisher("아아아", "집");
        // static이아니니깐 new로 생성한걸로 생성 a 인스턴스안에있는 Publisher를 호출
    }
}