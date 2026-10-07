package com.korai.study.ch10.TODO.view;

import com.korai.study.ch10.TODO.router.RootRouter;
import com.korai.study.ch10.TODO.service.TodoService;

import java.util.Scanner;

public class TodoRegisterView implements View{      //9-1View 상속
    private final TodoService todoService;
    private Scanner scanner;        // 9-2todoService scanner 선언

    public TodoRegisterView(TodoService todoService){       //9-3TodoRegisterView하면 todoService값 받아서
        this.todoService = todoService;
        scanner = new Scanner(System.in);       //9-4입력해라
    }

    @Override
    public void show() {            // 9-5쇼 하면
        String content;     // content선언
        System.out.println("[ 할 일 등록하기 ]"); //출력
        System.out.print("내용: ");
        content = scanner.nextLine();       //content값 입력
        todoService.register(content);      //content값을 레지스타에 넣고
        RootRouter.setCurrent("todo-list");     // setCurrent에 todo-list 넣어서 실행
    }
}
