package com.korai.study.ch08;

public class Object01 {
    public static void main(String[] args) {
        // 최상위 class (Object)
        // 상속관계에 있어 가장 위에 있는 클래스
        // 재정의 override 하기 위해서는 상위 class 가 있어야한다.
        System.out.println(Student.class.getName());
        System.out.println(new Student().getClass().getName());
        System.out.println(new Student() instanceof Student);
        System.out.println(new Student().getClass() == Student.class);
        // 동일하게 나온다.
        //get class 를 호출하면 class Class를 리턴.
        // 인스터스 개념과 다르다 클래스의 정보를 확인. 즉 new 를 해도 객체가 아니라 클래스가 같아서 true
        System.out.println(new Student().hashCode());
        Student s = new Student();
        System.out.println(s.hashCode());
        System.out.println(Integer.toHexString(s.hashCode()));
        System.out.println(s.toString());
        System.out.println(s);
        //toString 클래스 전체의 주소값 호출 toString 생략해도 된다.
        String str1 = s.toString();  // 주소값을 대입하는거고
       // String Str2 = s;    // String이 아니라 student가 되어야한다. 아래  얘는 스트링 리턴
        Student s2 = s;   // print에만 된다, 얘는 오브젝트 리턴
        // 모든 객체는 Object를 상속받기 떄문에 toString을 overide 할수 있다.
        HighStudent hs1 = new HighStudent();
        System.out.println(hs1);  // toString 호출이 된다.
    }
}

class Student extends  Object{          //extends  Object 이게 생략되어있따.

}

class HighStudent extends Student{  // 다중상속 x, 상속상속상속 제일위에 Object

    @Override
    public String toString() {
       // return super.toString();  toString 호출해서 내가 바꿔도 됨.
        return "내마음대로 정의가능";
        //toString 쓰는곳 - 객체가 가지고 있는 데이터를 문자열로 시각화 할 때 사용
    }
}

class Teacher {
    private String name;
    private  int age;
    private String address;

    public Teacher(String name, int age, String address) {
       this.name = name;
       this.age = age;
       this.address = address;
    }

    @Override
    public String toString() {                  //alt + insert 해서 toString 사용
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}