package com.korai.study01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     //이거하면 responsebody 안써도 됨
public class StudyController02 {

    @GetMapping("/api/study02/get01")
    public String get01(){
        return "응답!!!";
    }

    @PostMapping("/api/study/post01")
    public String post01(){
        return "포스트!!";
    }
}
