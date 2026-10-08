package com.korai.study.ch10.PARKING;

import com.sun.jdi.VMOutOfMemoryException;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
@Data
@AllArgsConstructor
public class Car {

        private List<Car> cars;

        private String a;          //종류
        private String num;     // 번호
        private String time;
        private int money;


    public Car(String n1, String n2, String n3) {
        this.a = n1;
        this.num = n2;
        this.time = n3;
        this.money = 0;
        if("1".equals(n1)){
            n1 = "일반";
        } else if ("2".equals(n1)){
            n1 = "경차";
        }
    }
}
