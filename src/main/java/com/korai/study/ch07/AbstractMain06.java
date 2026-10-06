package com.korai.study.ch07;

import java.util.ArrayList;
import java.util.List;

public class AbstractMain06 {
    public static void main(String[] args) {
        List<RemoteControl> remoteControls = List.of(                   // class명.of 는 Static
                new TvRemoteControl(),
                new MonitorRemoteControl(),
                new TvRemoteControl(),
                new MonitorRemoteControl()
        );      //위에꺼 넣어두면 더이상 추가는 못함 가지고오는건 가능

    //     for(int i = 0; i < remoteControls.size(); i++){             // 밑에랑 같은 의미 코드
    //        RemoteControl r = remoteControls.get(i);
    //       r.powerOn();
    //    }

        for(RemoteControl r : remoteControls){                      //순서대로 data가 나온다 처음부터 끝까지 반복할떄만.
            r.powerOn();
        }
    }
}
interface  Sensor{                  // interface 무조건 추상객체
    void send();        // 함수인데 ;로 끝난다 추상메서드 (; 내용이없다)
    // default 를 사용해서 일반메서드 사용은 가능
    void on();

}// 추상메서드를 구현하는건 implements
// extends 는 1개만 상속 implements 여러개 가능
// extends는 개념(abstract) (리모컨) implements기능적인거(interface) (리모컨의 버튼, 건전지) 모여서 개념 느낌
//추상클래스는 생성 불가

abstract class RemoteControl01 {                // abstract를 사용하려면 class 명에도 해줘야한다.
    //추상메서드의 클래스는 추상클래스다
    // abstract 동작을 정의할필요가 없다 자식꺼로 생성될 객체
    abstract void powerOn();            //클래스는 인스턴스를 생성하기 위해 존재 클래스가 미완성이라 abstract붙여야한다.
    // 그래야 추상클래스다
    // 정의를 안넣으면 abstract가 필요 ( 추상이니깐) 아니면 abstract의 내용을 구현해라
    // 추상클래스는  강제성 and 가이드를 부여 ( 추상이되면 정의가 꼭필요) 설계도다 틀이다.
    // RemoteControl r = new RemoteControl01();   // 추상클래스는 생성할수 없다 (new못함)
}


class RemoteControl {
    //abstract class RemoteControl {  abstract를 사용하려면 class 명에도 해줘야한다.
    //abstract void powerOn();   // 오버라이드를 하기위해 틀만 주는거 함수나 아무것도 없다 이름만 있다 - 추상메서드

    void powerOn() {                //자식클래스 애들을 오버라이드로 하나로 묶어줌

    }
}

class TvRemoteControl extends RemoteControl{
    @Override
    void powerOn() {
        System.out.println("TV 회로에 맞게 전원 공급");
    }
}

class MonitorRemoteControl extends RemoteControl{
    @Override
    void powerOn() {
        System.out.println("모니터 회로에 맞게 전원 공급");
    }
}

// 추상화의 이유
// 다형성 - 자료형을 다양하게 변화 시킬수 있따. 업 다운 캐스팅
//기능적 추상화 -interface
// 본질 개념으로 추상화 단일 상속(extends)
// 다중구현 여러 기능을 추상화 interface , interface : interface , clss : class extends
// class interface 만 implements 즉 다르면 interface 같으면 interface
// 몸체에 기능을 더하는 개념 하나의 class에 interface 여러개 가능 하나의 객체(원형(객체)이 있다) 추상화된 객체로 형변화이 쉽다.
//객체를 벗어나는 기능을 혹은 형변환을 할 수 없다