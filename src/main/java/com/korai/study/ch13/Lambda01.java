package com.korai.study.ch13;

// 람다
// 추상 메서드를 하나만 가지고 있는 인터페이스를 익명객체로 생성할 때
// 편리하게 생성할 수 있도록 만들어진 문법
public class Lambda01 {
    public static void main(String[] args) {
        KeyboardEvent keyboardEvent = new KeyboardEvent(){
            @Override
            public void keyUp() {
                System.out.println("키를 뗴다");
            }

            @Override
            public void keyDown() {
                System.out.println("키를 누르다");
            }
        };

        keyboardEvent.keyDown();
        keyboardEvent.keyUp();

        Speaker speaker = () -> System.out.println("A 사운드를 재생");        //생성하는거지 실행X
        //명령어 한줄이니깐 중괄호 생략
        //Speaker speaker = () -> {System.out.println("A 사운드를 재생");}
        speaker.play();
        //인터페이스 안에 추상메서드가 1개일때만 람다 사용가능
        //객체생성하고있다 상속받자말자
    }
}

interface KeyboardEvent {
    void keyUp();
    void keyDown();
}

interface Speaker {
    void play();
}