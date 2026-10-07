package com.korai.study.ch10.TODO.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {
    private int id;
    private TodoStatus Status = TodoStatus.todo; // 객체
    private String content;
    private User user;
}
