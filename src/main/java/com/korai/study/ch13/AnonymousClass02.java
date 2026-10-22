package com.korai.study.ch13;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Scanner;
//어뎁터 패턴 - 중간에 연결한다. 그런거할때 쓴다 익명클래스
public class AnonymousClass02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //마우스이벤트는 인터페이스라 생성불가 인플리먼츠해야함(class만들어야함)
//        MouseEvent homeMouseEvent = new MouseEvent() {            //같다
//            @Override     //상속받았으니깐 override
//            public void click() {
//                System.out.println("홈으로 이동");
//            }
//        };

        Button homeButton = new Button("홈", new MouseEvent() {
            @Override
            public void click() {
                System.out.println("홈으로 이동");
            }
        });         //마우스이벤트를 상속받은 익명클래스 생성되고 오버라이트만 됨
        //조금헷갈림 위랑 같은게 왜인지??? button 에 랑 저거랑
        Button loginButton = new Button("로그인", new MouseEvent() {
            @Override
            public void click() {
                System.out.println("로그인으로 이동");
            }
        });

        Button logoutButton = new Button("로그아웃", new MouseEvent() {
            @Override
            public void click() {
                System.out.println("로그아웃");
            }
        });

        while(true){
            System.out.print("버튼 클릭: ");
            int in = scanner.nextInt();
            scanner.nextLine();

            switch (in) {
            case 1:
                homeButton.OnClick();
                break;
            case 2:
                loginButton.OnClick();
                break;
            case 3:
                logoutButton.OnClick();
                break;
            default:

            }
        }
    }
}

interface MouseEvent{
    void click();
}

@Data
@AllArgsConstructor
class Button {
    private String text;
    private MouseEvent mouseEvent;

    public void OnClick(){
        mouseEvent.click();
    }
}