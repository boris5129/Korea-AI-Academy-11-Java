package com.korai.study.ch10.TODO.view;

import com.korai.study.ch10.TODO.config.SecurityConfig;
import com.korai.study.ch10.TODO.router.RootRouter;
import com.korai.study.ch10.TODO.service.UserService;

import java.util.Scanner;

public class LoginView implements View {        // 5-1 loginview는 view를 상속?한다.

    private UserService userService;            //5-2userService를 만든다.
    private Scanner scanner;                    //5-3scanner 만든다

    public LoginView(UserService userService) { // 5-4 loginview는 유저서비스를 받는다.
        this.userService = userService;     // 5-5userService는 여기꺼다 선언
        scanner = new Scanner(System.in);       //5-6스캐너도 준비한다.
    }

    @Override
    public void show() {                // 5-7 show에 username 과 password 선언
        String username;
        String password;

        System.out.println("[ TODO LIST 로그인 ]"); // 5-8 출력
        System.out.print("username: ");
        username = scanner.nextLine();              //5-9 name를 외부 스캐너로 입력받는다.
        System.out.print("password: ");
        password = scanner.nextLine();              //5-10 passwoed를 외부 스캐너로 입력받는다.

        String token = userService.login(username, password);       //5-11 토큰은 유저서비스의 네임과 패스워드를 받는다
        if (token == null) {            //만약에 토큰이 없다면 출력 및 엔터를 위한 입력을한다.
            System.out.println("로그인 정보를 다시 확인하세요.");
            System.out.print("계속 진행하시려면 엔터를 눌러주세요...");
            scanner.nextLine();
            return;
        }

        SecurityConfig.setLoginSession(token);                  // 토큰을setLoginSession에 넣고
        System.out.println(String.format("로그인 성공. %s님 환영합니다.", username));//출력
        RootRouter.setCurrent("todo-list");//setCurrent에 todo-list를 넣으며 실행 앞뒤 연결하면 CurrentView값은 todo-list
    }

}
