package com.korai.study04.controller;

import com.korai.study04.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    //service가 있어야 controller가 생성된다. 의존
    //service가 있어야 조립이된다. 이 조립을 자동으로 해주는게 IOC
    //Component 가 있어야 자동조립(controller,service 도 Component 종류)
    //service(빈)가 조립이되면 controller도 빈이 된다
    @Autowired      //controller에 service가 있어야 조립된다. 조립부품찾기
    private UserService userService;
}
