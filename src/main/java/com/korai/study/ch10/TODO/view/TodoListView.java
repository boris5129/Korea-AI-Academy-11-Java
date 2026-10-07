package com.korai.study.ch10.TODO.view;

import com.korai.study.ch10.TODO.entity.Todo;
import com.korai.study.ch10.TODO.router.RootRouter;
import com.korai.study.ch10.TODO.service.TodoService;

import java.util.Scanner;

public class TodoListView implements View {  // 8-1 view 상속

    private Scanner scanner;
    private TodoService todoService;        //8-2scanner 와 todoService 호출

    public TodoListView(TodoService todoService) {  //8-3TodoListView얘는 todoService이 값을 받고
        this.scanner = new Scanner(System.in);
        this.todoService = todoService;         //8-4scanner 와 todoService 를 초기화
    }

    @Override
    public void show() {        // 8-5show 하면
        System.out.println("[ TODO LIST 목록 ]");//출력
        printTodoList();//실행
        showSelectList();//실행
    }

    private void printTodoList() { //8-6 얘하면
        if (todoService.getTodoList() == null) {    //8-6-1list가 null 이면
            System.out.println("등록된 할 일이 없습니다.");   //출력
            return;
        }
        for (Todo todo : todoService.getTodoList()) { //8-6-2리스트 돌면서 todoService.getTodoList() 이게 있으면
            System.out.println(todo);       //8-6-3todo 출력
        }
    }

    private void showSelectList() {     // 8 - 7 showSelectList 하면
        String cmd;                     //cmd 선언
        System.out.println("1: 할 일 등록");        //출력
        System.out.println("2: 완료상태 수정");
        System.out.println("q: 로그아웃");
        System.out.print(">>> ");
        cmd = scanner.nextLine();       // 8 - 8 cmd값 입력
        if ("1".equals(cmd)) {              //cmd 1 입력하면 setCurrent에 todo-register 입력
            RootRouter.setCurrent("todo-register");
        } else if ("2".equals(cmd)) {       //cmd 2 입력하면 setCurrent에 todo-status 입력
            RootRouter.setCurrent("todo-status");
        } else if ("q".equals(cmd)) {       //cmd q 입력하면setCurrent에 login 입력
            RootRouter.setCurrent("login");
        } else {
            System.out.println("다시입력하세요.");     // 1 2 q 가 아니면 출력
        }
    }

}
