package com.korai.study.ch10;

public class SingletonMain {
    public static void main(String[] args) {
        StudentService studentService = StudentService.getInstance();
        StudentService studentService2 = StudentService.getInstance();  //2개가 같은 인스턴스 주소가 같다 if떄문에
        //  StudentService studentService = StudentService.call();
        //StudentService studentService2 = StudentService.call();  // 이게 가능함 if안쓰면
    }
}

class StudentService {
    private static  StudentService instance;

    private StudentService(){}          //생성자 + private(외부에서 호출 불가,class 내부에서만 호출)

    public static StudentService getInstance(){                      //외부에서 접근 불가능하니 static
        if(instance == null){                                   //1개의 유일한 객체 만들기.
            instance = new StudentService();   //인스턴스가 null 일떄문 호출
        }
        return instance;

        //  StudentService studentService = new StudentService();      //자기 클래스니 호출가능
      //  return new StudentService();            //외부에서 생성자를 통해 호출 x static 메서드를 통해서만 가능
    }

}
