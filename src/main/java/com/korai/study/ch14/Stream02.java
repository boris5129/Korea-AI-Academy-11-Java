package com.korai.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
class Role {
    private int id;
    private String name;
}
@Data
@AllArgsConstructor
class User {
    private int id;
    private String username;
    private List<Role> roles;
}

public class Stream02 {
    public static List<User> generateUser() {
        List<User> users = new ArrayList<>();

        for(int i = 0; i < 10; i++){            //nextInt 하면 범위내 랜덤 값을 만들어준다
            int num = i + 1;
            User user = new User(num, "user" + num, new ArrayList<>()); //반복하고 순서대로 생성
                                                                    //비어있는 roles라는 ArrayList
            Random random = new Random();
            if (random.nextInt(10) % 2 == 0){
                user.getRoles().add(new Role(1, "ROLE_ADMIN")); //roles에 추가해라
                user.getRoles().add(new Role(2, "ROLE_USER"));
                users.add(user);
                continue;
            }
            user.getRoles().add(new Role(2, "ROLE_USER"));
            users.add(user);
        }
        return users;
    }

    public static void main(String[] args) {
        //System.out.println(generateUser());  //주석 뺴면 출력
        //List<User> adminUsers
        //List<User> Users
        List<User> userAll = generateUser();

        List<User> adminUsers = userAll.stream()
                .filter(user -> !user.getRoles()
                    .stream()
                        .filter(role -> role.getId() == 1)
                        .toList()
                        .isEmpty())
                .toList();

        List<User> users = userAll.stream().filter(user -> {
            List<Role> roles = user.getRoles();
            List<Role> adminRoles = roles.stream().filter(role -> role.getId() == 1).toList();
            return adminRoles.isEmpty();
        }).toList();

        System.out.println(adminUsers);
        System.out.println(users);

    }
}
