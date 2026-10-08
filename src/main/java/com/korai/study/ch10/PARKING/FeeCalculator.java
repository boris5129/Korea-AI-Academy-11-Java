package com.korai.study.ch10.PARKING;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FeeCalculator {
    List<Car> cars = new ArrayList<>();


    public String cash(Car car, String n3) {

        String[] f1 = n3.split(":");
        String[] f2 = car.getTime().split(":");
        int time1 = Integer.parseInt(f1[0]) * 60 + Integer.parseInt(f1[1]);
        int time2 = Integer.parseInt(f2[0]) * 60 + Integer.parseInt(f2[1]);

        if (Objects.equals(car.getNum(), n3)) {
            int times = time1 - time2; //
            int moneys = 0;
            if (times <= 10) {
                    moneys = 0;
                } else if (times <= 30) {
                    moneys = 2000;
                } else if (times > 30) {
                    moneys = 2000 + (((times - 30) / 10) * 500);
                } else if (times > 390) {
                    moneys = 20000;
                }
                if ("2".equals(car.getA())) {
                    moneys = moneys / 2;
                }

            }
        return n3;
    }


    }


