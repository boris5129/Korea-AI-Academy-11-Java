package com.korai.study.ch10.TODO.router;

import com.korai.study.ch10.TODO.repository.TodoRepository;
import com.korai.study.ch10.TODO.repository.UserRepository;
import com.korai.study.ch10.TODO.service.TodoService;
import com.korai.study.ch10.TODO.service.UserService;
import com.korai.study.ch10.TODO.view.*;

import java.util.Map;

public class RootRouter {
    private static String current = "login";
    private static Map<String, View> viewMap;

    public static void setUp() {//2. setUP을 하면
        UserRepository userRepository = new UserRepository(); //3. 3-x번 기능이 있는 애를 생성
        UserService userService = new UserService(userRepository);
        // 4. 4-x의 기능이 있느 얘를 생성 거기에는 userRepository의 값을 넣는다.
        LoginView loginView = new LoginView(userService);   //5. 얘 생성후 userservice를 넣는다.

        TodoRepository todoRepository = new TodoRepository();       // 6. todoRepository 생성
        TodoService todoService = new TodoService(todoRepository, userRepository); // 7. 생성하여 todoRepository, userRepository 요값을 넣어
        TodoListView todoListView = new TodoListView(todoService); // 8.todoListView 생성 후 todoService값을 넣는다.

        TodoRegisterView todoRegisterView = new TodoRegisterView(todoService);  // 9.todoRegisterView 생성하고 todoService값을 넣어라
        TodoStatusView todoStatusView = new TodoStatusView(todoService);  // 10.

        viewMap = Map.of(       //  이값들이 들어가면 옆에꺼 해라
                "login", loginView,
                "todo-list", todoListView,
                "todo-register", todoRegisterView,
                "todo-status", todoStatusView
        );
    }

    public static String getCurrent() {
        return current;
    }       //getCurrent는 Current값을 받고

    public static void setCurrent(String path) {        //setCurrent는 path를 받는데
        current = path;     //Current값은 path값으로 바꾼다.
    }

    public static View getCurrentView() {       //getCurrentView는
        return viewMap.get(current);
    }
}












