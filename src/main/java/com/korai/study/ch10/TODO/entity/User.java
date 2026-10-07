package com.korai.study.ch10.TODO.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User { // 3-1-1 user는 아래 4개를 사용하고 Data AllArgsConstructor 로 생성자 get set hashcode equals to string만듬
    private int id;
    private String username;
    private String password;
    private String name;
}
