package com.korai.study.ch10.PARKING;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;



//public class ParkingApp {
   // public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<Car> cars = new ArrayList<>();
//        FeeCalculator feeCalculator = new FeeCalculator();
//        String n;
//
//
//        int max = 10;               //o
//        int a = 1;                  //o
//        int total = 0;

//        while(true){
//            System.out.println("[ 주차 관리 프로그램 ]");
//            System.out.println("---------------------------------------------");
//            System.out.println(" 1.입차   2.출차    3.주차현황    4.차량검색    5.오늘매출    6.종료" );
//            System.out.println("선택 >> ");
//            n = scanner.nextLine();
//            if("1".equals(n)){
//                String n1;      //번호
//                String n2;      //차종
//                String n3;      //입차시간
//
//                System.out.println("차량번호 >> ");
//                n1 = scanner.nextLine();
//                System.out.println("차종(1.일반 2.경차) >>");
//                n2 = scanner.nextLine();
//                System.out.println("입차시간(HH:MM) >> ");
//                n3 = scanner.nextLine();
//
//                if(a == 11){
//                    System.out.println("만차입니다. 입차 할 수 없습니다.");
//                    continue;
//                }
//
//                Boolean equals = false;
//                for (Car car : cars){
//                    if (Objects.equals(car.getNum(), n1)){
//                        System.out.println("이미 주차중인 차량입니다.");
//                        equals = true;
//                    }
//                }
//                if (equals){
//                    continue;
//                }
//
//                Car cars1 = new Car(n2, n1, n3);
//                cars.add(cars1);
//
//                System.out.println("[" + a + "번]" + n1 + "입차완료" + "[남은 자리" + (max - a) + "대]" );
//                a++;
//                continue;
//
//            } else if("2".equals(n)){
//                String n1;      //번호
//                String n2;      //차종
//                String n3;      //출차시간
//
//                System.out.println("차량번호");
//                n1 = scanner.nextLine();
//                System.out.println("출차 시각");
//                n3 = scanner.nextLine();
//                Car c = null;
//
//                for (Car car : cars){
//                    if(Objects.equals(car.getNum(), n1)){
//                        c = car;
//                        String[] f1 = n3.split(":");
//                        String[] f2 = car.getTime().split(":");
//                        int time1 = Integer.parseInt(f1[0]) * 60 + Integer.parseInt(f1[1]);
//                        int time2 = Integer.parseInt(f2[0]) * 60 + Integer.parseInt(f2[1]);
//
//                        int times = time1 - time2; //
//                        int moneys = 0;
//                        if (times <= 10){
//                            moneys = 0;
//                        }else if(times <= 30){
//                            moneys = 2000;
//                        } else if (times > 30) {
//                            moneys = 2000 + (((times-30)/10)*500);
//                        } else if (times > 390) {
//                            moneys = 20000;
//                        }
//                        if("2".equals(car.getA())){
//                            moneys = moneys/2;
//                        }
//                        System.out.println(car.getNum() + "| 주차"
//                                + times + "| 요금" + moneys + "원");
//                        cars.remove(c);
//                        total = total + moneys;
//                    }
//                }
//
//            } else if("3".equals(n)){
//                System.out.println("주차 현황");
//                for (Car car : cars){
//                    if(car.getNum() == null){
//                        System.out.println("주차된 차량이 없습니다.");
//                    } else { for (int i = 0; i < cars.size(); i++){
//                        System.out.println("[" + (i+1) + "번] " + car.getNum() + "|" + car.getA() + "|" + car.getTime()
//                                + "입차");
//                        }
//                    }
//                }
//            } else if("4".equals(n)){
//                String n2;
//                System.out.println("차량검색");
//                System.out.println("검색할 차량 번호를 입력하세요");
//                System.out.println(">>>  ");
//                n2 = scanner.nextLine();
//                Car Fcar = null;
//
//                for(Car car : cars){
//                    if(Objects.equals(car.getNum(), n2) ){
//                        Fcar = car;
//                        break;
//                    }
//                }
//                if(Fcar != null){
//                    System.out.println("주차된 차량은");
//                    System.out.println(Fcar.getNum() + "|" + Fcar.getA() + "|" + Fcar.getTime());
//                }else {
//                    System.out.println("차량번호가 다르거나 주차된 차량이 없습니다.");
//                }
//
//            } else if("5".equals(n)){
//                System.out.println("오늘의 매출은");
//                System.out.println(total);
//
//            } else if("6".equals(n)){
//                break;
//
//            } else {
//                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
//                return;
//            }
//        }
//
//    }
//}
