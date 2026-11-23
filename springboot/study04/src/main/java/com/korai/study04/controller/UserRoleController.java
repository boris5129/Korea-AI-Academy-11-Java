package com.korai.study04.controller;

import com.korai.study04.service.UserRoleService;
import com.korai.study04.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor // 자동주입이되어야한다 알려주고 final로 조립에 필요한걸 선택한다.(생성자 생성)
//기능은 Component해서 싱글톤을 만든다,  데이터는 뉴해서 Component 안한다.
public class UserRoleController {

    private final UserRoleService userRoleService;
    private UserService userService;
    private String name;

}
