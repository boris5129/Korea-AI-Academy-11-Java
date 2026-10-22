package com.korai.study.ch13;

// 익명클래스        -> 1회용
// 클래스의 이름이 없음.
public class AnonymousClass01 {
    // 오브젝트 클래스를 상속받은 이름없는 클래스를 정의와 동시에 생성
    Object obj = new Object() {};
    //오브젝트를 상속받았기 때문에 생성가능하다.
    class A extends Object{}        //{} <- 정의헀다. >
    Object obj2 = new A();

    class B {}
    Object obj3 = new B();

    class C {}
    Object obj4 = new C() {};       //C클래스를 상속받아서 정의한 익명의 클래스

    abstract class D extends C {}       //D는 추상클래스라 생성불가능 하지만 D를 상속받은 이름없는 클래스를 생성
    D obj5 = new D() {};            //익명객체는 D로 업캐스팅된다. 이름이 없기때문에 다운캐스팅은 따로 안한다.

    interface E {}
    E obj6 = new E() {};        //E를 implements 한 익명의 클래스 생성
    }