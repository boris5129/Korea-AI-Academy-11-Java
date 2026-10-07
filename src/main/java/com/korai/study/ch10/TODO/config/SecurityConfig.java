package com.korai.study.ch10.TODO.config;

import com.korai.study.ch10.TODO.entity.User;

import java.util.UUID;

public class SecurityConfig {
    private static String loginSession = null;      //4-3-1얘는 null로 초기화

    public static String getLoginSession() {        //4-3-2getLoginSession 하면 LoginSession을 실행
        return loginSession;
    }

    public static void setLoginSession(String loginSession) {   //4-3-3setLoginSession 하면
        SecurityConfig.loginSession = loginSession;     //loginSession을 loginSession으로 초기화
    }

    public static String generateSessionToken(User user) {      //4-3-4generateSessionToken은 user의 user를 받고
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        //문자열 uuid를 생성 uuid는 램덤으로 정해서 uuid의 -를 빈칸으로 변경해 toString 출력한다.
        int userId = user.getId();  //userId는 user에서 id를 받아온다.
        String token = uuid + "@" + userId; //token은 uuid 뒤에 @ 붙이고 userID를 넣는다.
        return token;       // 그후 실행시 토큰을 사용한다.
    }

    public static int getUserId(){          //4-3-5getUserID실행하면
        int startIndex = loginSession.indexOf("@") + 1;     // StartIndex는 로그인섹션의 인덱스의 @ 뒤에 1을 더한 위치를 찾는다
        String userIdStr = loginSession.substring(startIndex);  //userIdStr는 로그인섹션안에 startIndex 를 잘라가져온다.
        return Integer.parseInt(userIdStr);         // 위에 문자타입의userIdStr를 정수타입으로 변경해 사용한다.
    }
}
