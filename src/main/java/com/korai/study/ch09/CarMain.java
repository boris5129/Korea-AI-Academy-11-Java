package com.korai.study.ch09;

import com.korai.study.ch09.entity.Car;
import com.korai.study.ch09.service.InitService;

public class CarMain {
    public static void main(String[] args) {
        new InitService();     // 생성하겠다

        InitService.getCarRepository().printAll();     //run을 호출하면서 한번 부른다. 그리고 전체조회도 부른다. 아직 전체에 아무것도 없음
        Car car1 = new Car(null, "189누 3446", "K8", "김준일");     //car1번에 id는 없고 뒤에꺼 넣는다.
        Car car2 = new Car(null, "123가 4567", "아반떼", "이서연");
        Car car3 = new Car(null, "234나 5678", "쏘나타", "박민준");
        Car car4 = new Car(null, "45다 1234", "그랜저", "최지우");
        Car car5 = new Car(null, "312로 7890", "투싼", "정하늘");
        Car car6 = new Car(null, "67마 2468", "쏘렌토", "강도윤");
        Car car7 = new Car(null, "158보 1357", "K5", "윤서아");
        Car car8 = new Car(null, "221소 9753", "카니발", "임재현");
        Car car9 = new Car(null, "89우 8642", "G80", "한예린");
        Car car10 = new Car(null, "376주 3141", "팰리세이드", "오승우");
        InitService.getCarRepository().insert(car1);                // 넣다가 id는 insert에 의해 autoIncrement 1씩 증가된다.
        InitService.getCarRepository().insert(car2);
        InitService.getCarRepository().insert(car3);
        InitService.getCarRepository().insert(car4);
        InitService.getCarRepository().insert(car5);
        InitService.getCarRepository().insert(car6);
        InitService.getCarRepository().insert(car7);
        InitService.getCarRepository().insert(car8);
        new InitService();
        InitService.getCarRepository().insert(car9);
        InitService.getCarRepository().insert(car10);
        InitService.getCarRepository().printAll();//  InitService안에 getcar(얘는 carre를 return) 그리고 전체 출력
        InitService.getCarRepository().delete(5L);  // id가 5 인 걸 삭제한다.
        InitService.getCarRepository().printAll();


    }
}
