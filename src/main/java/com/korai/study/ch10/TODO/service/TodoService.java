package com.korai.study.ch10.TODO.service;

import com.korai.study.ch10.TODO.config.SecurityConfig;
import com.korai.study.ch10.TODO.entity.Todo;
import com.korai.study.ch10.TODO.entity.TodoStatus;
import com.korai.study.ch10.TODO.entity.User;
import com.korai.study.ch10.TODO.repository.TodoRepository;
import com.korai.study.ch10.TODO.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;
    private final UserRepository userRepository;                //7-1todoRepository userRepository 생성

    public List<Todo> getTodoList() {       //7-2getTodoList는 getId를 받아 id를 찾는다.
        return todoRepository.findAllByUserId(SecurityConfig.getUserId());
    }
    public void register(String content){ //7-3register는 content를 받는다.content는 todo 리스트에서 넣고 받아온다.

        //Integer.parseInt(token.substring(token.indexOf("@") + 1)); // 7-4 substring 문자열을 자르곘다 위치부터/indexOf("@")의 인덱스번호 / parse int로 변환해라
        User foundUser = userRepository.findById(SecurityConfig.getUserId());       // 7-5founduser는 getId를 받아 id를 찾는다.
        Todo todo = new Todo(0, TodoStatus.todo, content, foundUser); //todo를 만들어 그안에 0, TodoStatus.todo, content, foundUser 넣는다.
        todoRepository.insert(todo);//insert에 todo를 넣고 실행 즉
    }

    public void updateStatus(int todoId, TodoStatus todoStatus){
        todoRepository.updateStatus(todoId, todoStatus);
    }
    //7-6 updateStatus는 todoId todoStatus를 받아 todoRepository에 넣어라
}
