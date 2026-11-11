package com.korai.study01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudyController01{

    @Value("${user.dir}")
    private String projectDid;


     //@ResponseBody           //응답을 바디로 할거다 바디는 데이터 값 바디로 안받으면 자동으로 html @ResponseBody
    @GetMapping("/api/get01")   //얘로 요청을 날렸는데 / 요청왔는데 responsebody 가 있으면 리턴이 값이고
    public String get01(){
        return "/index.html";         //얘로 요청이 들어왔따    response가 없으면 경로로 사용
    }
    @GetMapping("/api/get02")
    public String get02(){
        System.out.println(projectDid + "/scr/main/resources/upload");
        String uploadPath = projectDid + "/scr/main/resources/upload";
        return "/" + uploadPath + "/SQLD_60.pdf";
    }
    @ResponseBody
    @GetMapping("/api/get03")
    public String get03(){
        return "데이터 응답!!";
    }
}