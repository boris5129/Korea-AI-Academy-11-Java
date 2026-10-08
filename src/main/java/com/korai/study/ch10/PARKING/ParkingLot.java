package com.korai.study.ch10.PARKING;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ParkingLot {
    List<Car> cars = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    FeeCalculator feeCalculator = new FeeCalculator();

    private static final int max = 10;
    private static int nextNo = 1;
    String n;
    private int total = 0;

    public void show() {
        while(true){
        System.out.println("[ 주차 관리 프로그램 ]");
        System.out.println("---------------------------------------------");
        System.out.println(" 1.입차   2.출차    3.주차현황    4.차량검색    5.오늘매출    6.종료");
        System.out.println("선택 >> ");
        n = scanner.nextLine();

        if ("1".equals(n)) {
            String n1;      //번호
            String n2;      //차종
            String n3;      //입차시간

            System.out.println("차량번호 >> ");
            n1 = scanner.nextLine();
            System.out.println("차종(1.일반 2.경차) >>");
            n2 = scanner.nextLine();
            System.out.println("입차시간(HH:MM) >> ");
            n3 = scanner.nextLine();
            if(!n3.matches("\\d{2}:\\d{2}")){
                continue;
            }

            if (nextNo == 11) {
                System.out.println("만차입니다. 입차 할 수 없습니다.");
                continue;
            }

            Boolean equals = false;
            for (Car car : cars) {
                if (Objects.equals(car.getNum(), n1)) {
                    System.out.println("이미 주차중인 차량입니다.");
                    equals = true;
                }
            }
            if (equals) {
                continue;
            }
            Car cars1 = new Car(n2, n1, n3);
            cars.add(cars1);

            System.out.println("[" + nextNo + "번]" + n1 + "입차완료" + "[남은 자리" + (max - nextNo) + "대]");
            nextNo++;

    } else if("2".equals(n)){
        String n1;      //번호
        String n2;      //차종
        String n3;      //출차시간

        System.out.println("차량번호");
        n1 = scanner.nextLine();
        System.out.println("출차 시각");
        n3 = scanner.nextLine();
        Car c = null;

            for (Car car : cars){
                if(Objects.equals(cars, n1)) {
                    System.out.println("주차된 차량이 없습니다.");
                    continue;
                } else if (Objects.equals(car.getNum(), n1)) {
                    c = car;
                    }
                    String cash1 = feeCalculator.cash(c, n3);
                    System.out.println(car.getNum() + "| 주차" + car.getTime() + "| 요금" + c.getMoney() + "원");


                }cars.remove(c);

        } else if ("3".equals(n)) {
            System.out.println("주차 현황");
            Boolean equals = false;
                if (cars.isEmpty()) {
                    System.out.println("주차된 차량이 없습니다.");
                    equals = true;
                }
                if (!equals){
                    for (int i = 0; i < cars.size(); i++){
                        Car car = cars.get(i);
                        System.out.println("[" + (i+1) + "번] " + car.getNum() + "|" + car.getA() + "|" + car.getTime()
                                + "입차");
                    }

            }

    } else if("4".equals(n)){
        String n2;
        System.out.println("차량검색");
        System.out.println("검색할 차량 번호를 입력하세요");
        System.out.println(">>>  ");
        n2 = scanner.nextLine();
        Car Fcar = null;

        for(Car car : cars){
            if(Objects.equals(car.getNum(), n2) ){
                Fcar = car;
                break;
            }
        }
        if(Fcar != null){
            System.out.println("주차된 차량은");
            System.out.println(Fcar.getNum() + "|" + Fcar.getA() + "|" + Fcar.getTime());
        }else {
            System.out.println("차량번호가 다르거나 주차된 차량이 없습니다.");
        }

    } else if("5".equals(n)){
        System.out.println("오늘의 매출은");
        System.out.println(total);

    } else if("6".equals(n)){
        break;

    } else {
        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        return;
    }
}


    }
}