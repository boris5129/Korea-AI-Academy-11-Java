package com.korai.study.ch10.TODO.service;

import com.korai.study.ch10.TODO.config.SecurityConfig;
import com.korai.study.ch10.TODO.entity.User;
import com.korai.study.ch10.TODO.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;        // 4. userRepository를 부른다.

    public String login(String username, String password) {     //4-1 로그인을 위해서 문자열(이름), 문자열(비밀번호)를 받는다.
        User foundUser = userRepository.findByUsername(username);   // founduser는 저장소의 이름으로 찾기를 한다.
        if (foundUser == null) {            //만약에 founduser 가 null이면 null 입력
            return null;
        }
        if (!Objects.equals(foundUser.getPassword(), password)) {       //4-2 비밀번호가 안과 입력된값이 다르면 널 입력
            return null;
        }
        return SecurityConfig.generateSessionToken(foundUser);      //4-3둘다 아니면 즉 username과 password가 같다면
        //SecurityConfig.generateSessionToken 안에 founduser를 넣어라
    }
}
