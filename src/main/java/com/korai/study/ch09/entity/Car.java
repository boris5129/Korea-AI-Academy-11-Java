package com.korai.study.ch09.entity;

//엔티티 클래스(정보를 저장하는 클래스
// 생성자 , getter, setter, equals, toString, hashcode

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@AllArgsConstructor
@Data
public class Car {  // Car 에는 id number, model, owner 가 들어간다.
    private Long id;
    private String number;
    private String model;
    private String owner;


}
