package com.korai.study.ch09.service;

import com.korai.study.ch09.repository.CarRepository;

import java.util.ArrayList;

public class InitService implements  Runnable{

    private static CarRepository carRepository;     // static 메모리기떄문에 1개만 존재
        // static은 1개만 생성해야하거나 자주쓸대만 써라 메모리 아끼게
        // 객체 중복 생성도 막을수 있다.
    public InitService(){       //생성되면
        if(carRepository == null){          //null 이니깐 값이 들어간적없다 만약에 null이 아닐때는 실행하지마라
            run();                  // run 이 실행된다. 데이터가없는 최초의 한번만 null이 실행된다.
        }                               // if가 없으면 초기화되버림
    }

    @Override  //Ctrl + i
    public void run() {                 // run 은
        System.out.println("프로그램 초기 설정 시작...");     // 출력하고
        carRepository = new CarRepository(new ArrayList<>());   // CarRepository안에 ArrayList배열을 담아 초기화
        System.out.println("프로그램 초기 설정 완료"); // 이걸 저장       출력한다.
    }
    public static CarRepository getCarRepository(){     //getter만 만들어서 수정안된다 setter들어가면 수정이 된다
        return carRepository;
    }// init안에꺼 수정불가능
}       // get 은 carre 를 리턴한다.
