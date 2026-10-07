package com.korai.study.ch10.TODO.repository;

import com.korai.study.ch10.TODO.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserRepository {   //3.내용
    private List<User> users;       //3-1얘는 users라는 list를 생성후 private

    public UserRepository() {
        User user1 = new User(1, "test1", "1111", "박관우");
        User user2 = new User(2, "test2", "2222", "박관이");
        User user3 = new User(3, "test3", "3333", "박관삼");
        User user4 = new User(4, "test4", "4444", "박관사");
        users = List.of(user1, user2, user3, user4);
    }                   //3-1. 얘는 user 1 2 3 4를 만들어 list에 넣는다

    public User findByUsername(String username) {       //3-2얘는 username이라는 문자열을 받고
        for (User user : users) {       //users에서 user를 하나씩 꺼내서
            if (Objects.equals(user.getUsername(), username)) { // list 안의 user 와 username이 같다면
                return user;            //user를 리턴 즉 user를 준다.
            }
        }
        return null;        //다르면 null값을 준다.  결론 이름으로 list안에 user 찾기
    }
    public User findById(int id) {          //3-3id라는 숫자값을 받는다.
        for (User user : users) {           // 리스트 users에서 user를 하나씩 꺼내서
            if (user.getId() == id) {       //user의 id와 받은 id값이 같다면
                return user;        //user를 리턴 즉 user를 준다.
            }
        }
        return null;        //다르면 null값을 준다.  결론 id로 list안에 user 찾기
    }

}
