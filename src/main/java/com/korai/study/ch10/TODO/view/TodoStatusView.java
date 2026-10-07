package com.korai.study.ch10.TODO.view;

import com.korai.study.ch10.TODO.entity.Todo;
import com.korai.study.ch10.TODO.entity.TodoStatus;
import com.korai.study.ch10.TODO.router.RootRouter;
import com.korai.study.ch10.TODO.service.TodoService;

import java.util.List;
import java.util.Scanner;

public class TodoStatusView implements View{        //10-1 view 상속
    private final Scanner scanner;
    private final TodoService todoService;
    private int selectedTodoId;             //10-2 scanner todoService selectedTodoId 선언

    public TodoStatusView(TodoService todoService){     // 10-3TodoStatusView로
        this.scanner = new Scanner(System.in);
        this.todoService = todoService;         //todoService scanner 초기화
    }
    @Override
    public void show() {        //10-4 show하면 아래꺼 출력
        System.out.println("[ TODO STATUS 변경 ]");
        System.out.println("-----------------------------------------------------------------------");
        if(selectedTodoId == 0 ){       // selectedTodoId 0이면 밑에꺼 출력
            System.out.println("TODO를 선택하세요.");
        }else {     //10-4-1selectedTodoId 0이 아니면 아래꺼 출력
            System.out.printf("[todoId: %d] TODO를 선택하였습니다.\n", selectedTodoId); //printf 프린트 포멧
            System.out.println("----------------------------------------------------------------------");
        }
        showSelectList(); // 10-4-2를 실행
    }

    private void printTodoList() {          //10-5 printTodoList 하면
        if (todoService.getTodoList() == null) {        // 리스트가 null 이면
            System.out.println("등록된 할 일이 없습니다.");   //출력
            return;
        }
        for (Todo todo : todoService.getTodoList()) {   // 10-5-1getTodoList에서 todo를 꺼내와서 출력
            System.out.println(todo);
        }
    }

    private void selectedTodo(){            // 10-6 selectedTodo 실행하면
        int todoId;
        printTodoList();            //todoId printTodoList() 를 초기화
        System.out.println("todoId 선택 >>>");    // 출력
        todoId = scanner.nextInt();//10-6-1todoId를 입력
        scanner.nextLine(); // 10-6-2엔터한번더
        List<Todo> todos = todoService.getTodoList(); // 10-6-3리스트인 todos에 getTodoList 넣고
        boolean foundStatus = false;            //10-6-4foundStatus 를 false로 지정
        for(Todo todo : todos){         //10-6-5리스트 다꺼낸다.
            if(todo.getId() == todoId){     // getId랑 todoID 같으면
                foundStatus = true;     //foundStatus를 true로 변환
            }
        }

        if (!foundStatus){      // 10-6-6 id가 다르면 false가 트루가 되서 if 진입 출력
            System.out.println("선택하신 TODO ID의 정보가 존재하지 않습니다.");
            return;
        }
        selectedTodoId = todoId;        //10-6-7 selectedTodoId를 todoId로 대입

    }

    private void modificationStatus(TodoStatus todoStatus){     //10-7modificationStatus 에 todoStatus값 넣고
        todoService.updateStatus(selectedTodoId, todoStatus);       //selectedTodoId , todoStatus 을 업데이트해서 저장소에 넣는다
        System.out.printf("TODO ID[%d] %s 상태변경완료", selectedTodoId, todoStatus.toString());//그리고 출력
    }


    private void showSelectList(){          //10-8 showSelectLis 하면
        String cmd;         //cmd 선언하고 출력
        System.out.println("1: TODO 선택하기");
        System.out.println("2: 진행전으로 변경");
        System.out.println("3: 진행중으로 변경");
        System.out.println("4: 완료로 변경");
        System.out.println("b: 뒤로가기");
        System.out.print(">>> ");
        cmd = scanner.nextLine();  //cmd값 입력
        if ("1".equals(cmd)){       //cmd 값이 1이면  selectedTodo() 실행
            selectedTodo();
        } else if("2".equals(cmd)){     //cmd 값이 2이면  modificationStatus(TodoStatus.todo) 실행
            modificationStatus(TodoStatus.todo);
        } else if("3".equals(cmd)){     //cmd 값이 3이면 modificationStatus(TodoStatus.inProgress실행
            modificationStatus(TodoStatus.inProgress);
        } else if("4".equals(cmd)){     //cmd 값이 4이면 modificationStatus(TodoStatus.done실행
            modificationStatus(TodoStatus.done);
        } else if("b".equals(cmd)){     //cmd 값이 b이면  selectedTodoId값을 0으로 초기화하고 RootRouter.setCurrent에 todo-list넣기
            selectedTodoId = 0;
            RootRouter.setCurrent("todo-list");
        } else{         // 1 2 3 4 b 가 아니면 아래 출력
            System.out.println("다시 입력하세요.");
        }
    }
}
