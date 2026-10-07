package com.korai.study.ch10.TODO.repository;

import com.korai.study.ch10.TODO.entity.Todo;
import com.korai.study.ch10.TODO.entity.TodoStatus;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class TodoRepository {
    private  int autoIncrement = 1;     // 6-1 얘는 1로 시작
    @Getter
    private List<Todo> todos;       //6-2 todos라는 list 만듬

    public TodoRepository() {
        todos = new ArrayList<>();
    }       // 6-3 얘하면 todos 안에 어레이리스트 넣음

    public  void  insert(Todo todo){        // 6-4 insert는 Todo의 todo를 받는다
        todo.setId(autoIncrement++);        // 6-5 todo의 setId는 하나 만들고 그다음쨰는 1을 더한다.
        todos.add(todo);                //6-6 todo list에 넣는다.
    }

    public List<Todo> findAllByUserId(int userId){          //6-7 Todo 리스트 안에서 findAllByUserId를 하면 얘는 userID를 받는다.
        List<Todo> filteringTodos = new ArrayList<>();  //6-8 어레이리스트로 초기화
        for (int i = 0; i < todos.size(); i++){
            if(todos.get(i).getUser().getId() == userId){       // 6-9 todos사이즈만큼 반복 i번쨰 유저의 id가 userid랑 같으면
                filteringTodos.add(todos.get(i));       // 6- 10-1filteringTodos에 todosi번쨰를 넣는다.
            }
        }
        if(filteringTodos.size() == 0 ){        // 6-10-2만약에 사이즈가 0이면 널 그말은 id가 하나도 없다
            return null;
        }
        return filteringTodos;      //6-10-3 넣은 리스트로 변환
    }

    public void updateStatus(int todoId, TodoStatus todoStatus){    // 6-11updateStatus는 todoId,todoStatus 값을 받는다.
        for(int i = 0; i < todos.size(); i++){
            if(todos.get(i).getId() == todoId){  // 6-12 반복돌떄 id 가 같다면
                todos.get(i).setStatus(todoStatus);  //6-12-1 i번쨰 를 status를 todoStatus로 바꾸고 끝
                break;
            }
        }
    }
}
