package com.korai.study.ch11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

public class TodoMain {
    public static int pathIndex = 0;
    public static  boolean running = true;

    public static void main(String[] args) {
        List<View> viewList = new ArrayList<>();    // list인 viewList를 arrayList로 생성 / list는 값을 넣는다(값 : 변수, 상수, 주소값 등)
        //viewList.add(new HomeView());               // viewList에 Homeview를 생성해서 넣는다.(객체)
        viewList.add(HomeView.getInstance());               // viewList에 Homeview를 가져온다 넣는다.(객체)
        viewList.add(RegisterView.getInstance());           // viewList에 Registerview를 생성해서 넣는다.
        viewList.add(ListView.getInstance());               // viewList에 Listview를 생성해서 넣는다.

        //viewList.get(0).show();  //  homeview의 쇼를 호출

        Scanner scanner = new Scanner(System.in);

        while (running){
            viewList.get(pathIndex).show();
           // scanner.nextLine();         //무한루프 막기위해서
        }
    }
}

// 정보를 관리할 수 있도록 도와줄 Entity 클래스 / 할일은 계속 생성된다 이런건 Entity / 정보 저장 틀 /얘는 정보

//Object(최상위) 클래스
@Data
@NoArgsConstructor
@AllArgsConstructor
class Todo{
    private int id;
    private  String content;
}
// 기능을 추상화시키기 위해서  / 둘다 클래스인데 얘기는 기능을 묶기위해 / 추상화된거라 단독으로 생성할 수 없다/ new 안됨
// 인터페이스로 기능을 추상화 했으면 구현 객체는 무조건 존재할 것이다.
interface View {
    void show();
}

//클래스는 생성(메모리에 인스턴스를 실존하게 하는 것)이 가능해야한다.
//class HomeView implements View{} 이것만 있으면 에러 구현할 메서드가 없어서
class HomeView implements View{

    // 싱글톤  -> 하나의 유일한 객체를 만들어 사용  /정처기 공부때 확인/ 힙메모리를 사용
    // 2번 해당 클래스 자료형의 인스턴스를 담아둘 static 변수를 선언한다.
    //static HomeView homeView;   //선언            / 클래스 로딩될때 static이 사용된다.
    //private으로 외부 접근 제한
    private static HomeView instance; //인스턴스생성  private 떄문에 쓸려면 getter 해ㅐ야함
    // 교칙 변수명을 인스터스로 하자 그러면 무조건 싱글톤

    // 싱클톤
    // 1번. 생성자를 private로 정의한다.
    // private 접근제한자는 해당 class 내부에서만 접근할 수 있다.
    // 생성자를 private(숨겼다)는 외부에서 생성을 제한하기 위함이다.
    private HomeView(){

    }

    // 싱글톤
    // 3번 static 변수 homeView가 null 일 때 인스턴스를 생성 / 메모리부족으로 null 이 되어서 생성이 안되는 걸 방지
    // static getter를 통해서만 instance를 접근할 수 있게 유도
    public static HomeView getInstance(){
        while (instance == null){
            instance = new HomeView();      // 생성되면 null 아니니깐 반복해제
        }
        return instance;
    }

    @Override       // ctrl + i / 재정의했다.
    public void show() {
        Scanner sc = new Scanner(System.in);
        String cmd;
        System.out.println("[ HOME ]");
        System.out.println("R. TODO 등록하기");
        System.out.println("L. TODO 목록조회");
        System.out.println("Q. 프로그램 종료");
        System.out.print(">>> ");
        //cmd = sc.nextLine().trim().charAt(0) + ""; // charAt 첫1글자만 가져와라(0번 Index)
        cmd = sc.nextLine().trim(); // charAt 첫1글자만 가져와라(0번 Index)
        cmd = String.valueOf(cmd.charAt(0));
//        System.out.println(cmd.matches("[a-zA-Z]"));      //정규표현식
        boolean isAlphabet = cmd.matches("[a-zA-Z]");
        //String.valueOf 문자열로 만들어라 / string -> char -> String 다시해라

        if(!isAlphabet){
            System.out.println("영문자만 입력 가능합니다.");
            return;
        }
        cmd = cmd.toUpperCase();
        if ("Q".equals(cmd)) {
            System.out.println("프로그램을 종료합니다.");
            TodoMain.running = false;
            //return;  // 현재는 elseif로 묶여 실행되지않는다.
        } else if("R".equals(cmd)){
            TodoMain.pathIndex = 1;
        }else if("L".equals(cmd)){
            TodoMain.pathIndex = 2;
        }else {
            System.out.println("다시입력하세요.");
        }

    }
}

class RegisterView implements View{

    private static RegisterView instance;

    private RegisterView(){

    }

    public static RegisterView getInstance(){
        while (instance == null){
            instance = new RegisterView();
        }return instance;
    }


    @Override
    public void show() {
        Scanner sc = new Scanner(System.in);
        String content;
        System.out.println("[ REGISTER ]");
        System.out.println("내용입력하세요");
        System.out.print(">>>");
        content = sc.nextLine().trim();
        Todo newTodo = new Todo();      //Todo newTodo = new Todo(0, content);  생성될떄 넣고  생성자오버로딩
        newTodo.setContent(content);        //setter 통해
        TodoRepository.getInstance().insert(newTodo);
        System.out.println("TODO 등록 완료.");
        TodoMain.pathIndex = 0;
    }
}

class ListView implements View{

    private static ListView instance;

    private ListView(){

    }

    public static ListView getInstance(){
        if (instance == null){
            instance = new ListView();
        }return instance;
    }


    @Override
    public void show() {
        System.out.println("[ LIST ]");
        List<Todo> todos = TodoRepository.getInstance().findAll();
        if(todos.size() == 0) {
            System.out.println("등록된 TODO가 없습니다.");
            TodoMain.pathIndex = 0;
            return;
        }
        for (Todo todo : todos){
            System.out.println(todo);
        }
        TodoMain.pathIndex = 0;
    }
}
interface Repository<T>{
    void insert(T t);
    void update(T t);
    T delete(int id);
    T findById(int id);
    List<T> findAll();
}

class TodoRepository implements Repository<Todo>{           //위에 T 가 Todo로 바뀜
    private static TodoRepository instance;
    private int lastId;     //autoincrement 같은 말
    private List<Todo> todos;

    private TodoRepository(){
        lastId = 1;
        todos = new ArrayList<>();
    }

    public static TodoRepository getInstance(){
        if(instance == null){
            instance = new TodoRepository();
        }return instance;
    }

    @Override
    public void insert(Todo todo) {
        todo.setId(lastId++);
        todos.add(todo);
    }

    @Override
    public void update(Todo todo) {     //update 있는걸 업데이트
        for (int i = 0; i < todos.size(); i++){
            if(todos.get(i).getId() == todo.getId()){
                todos.set(i, todo);                             //set 바꾸는거 i를 todo로 바꾼다.
                break;
            }
        }
    }

    @Override
    public Todo delete(int id) {
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getId() == id) {
                return todos.remove(i); // 삭제와 동시에 리턴
            }
            //remove 는 index로 찾을수있고 객체로 할수있다. index는 return이 객체, 객체는 boolean
        }return null;
    }

    @Override
    public Todo findById(int id) {
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getId() == id) {
                return todos.get(i);
            }
        }return null;
    }

    @Override
    public List<Todo> findAll() {
//        List<Todo> copyTodos = new ArrayList<>();     얘는 변경이가능한 리스트
//        copyTodos.addAll(todos);
//        return copyTodos;
        return List.copyOf(todos);      //불변리스트 추가삭제 X
    }
}