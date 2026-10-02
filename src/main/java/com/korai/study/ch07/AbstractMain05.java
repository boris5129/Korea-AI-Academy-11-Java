package com.korai.study.ch07;

public class AbstractMain05 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call();
        FeaturePhone featurePhone = new FeaturePhone();
        featurePhone.print1();
        featurePhone.print2();
        System.out.println(featurePhone.phoneNumber);  // 자식요소꺼
    }
}

class Phone {
    String phoneNumber;

    Phone(){            // 이경우는 둘다 호출
        System.out.println("Phone 생성자 호출");
    }
    void call(){
        System.out.println("전화를 건다");
    }
}

class SmartPhone extends Phone {
    SmartPhone(){
        System.out.println("Smart Phone 생성자 호출");
    }
    @Override                   // 단축기 ctrl + o  부모가 먼저 생성 부모먼저 푼다
    void call() {
        System.out.println("전화 어플에 들어가서 전화를 건다.");
        super.call();           // super 부모 / 자식호출하면 부모기능 사용이 기본/ 재정의 해야 자식꺼 사용
    }                           // super 가 없으면 호출 x main call 은 void call, super call 은 Phone.call
}                               // 둘다 있으면 부모객체먼저 호출

class FeaturePhone extends Phone{
    String phoneNumber;
    FeaturePhone(){
        System.out.println("FeaturePhone 생성자 호출");
        phoneNumber = "010-1234-5678";
        super.phoneNumber = "010-1111-1111";
    }

    void print1(){
        System.out.println(phoneNumber);
    }

    void print2(){
        System.out.println(super.phoneNumber);
    }
}
