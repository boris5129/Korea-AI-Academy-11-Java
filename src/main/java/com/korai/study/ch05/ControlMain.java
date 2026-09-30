package com.korai.study.ch05;


//control 제어
// 1. 제어문 - if else, switch
// 2. 반복문 - while, for
// 3. 분기/점프문 - break, continue, return
public class ControlMain {
    public static void main(String[] args) {
        // 1. 조건문
        if (true){System.out.println("명령 실행 1");//if문의 원형, ; 하나로 끝
            if (false) System.out.println("명령 실행 2");
            boolean open = true;
            if (open) System.out.println("열림");//true 자리에 변수를 쓸 수 있다. boolean 자료형
            else System.out.println("닫힘"); // else를 같이 쓸 수 있다. if 없이는 쓸수없다.
            int score = 70;
            if (score < 60) {
                System.out.println("F");
            } else if (score < 70) System.out.println("D"); // 한가지 명령이라 {} 생략가능 2가지일경우 {} 사용
            else if (score < 80) System.out.println("C");
            else if (score < 90) System.out.println("B");
            else System.out.println("A");
            //삼학연산자는 값을 가져와라 if문은 명령을 해라
        }
    }
}
