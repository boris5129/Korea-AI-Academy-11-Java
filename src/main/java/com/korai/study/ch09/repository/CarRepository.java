package com.korai.study.ch09.repository;

import com.korai.study.ch09.entity.Car;

import java.util.List;

public class CarRepository {
    private Long autoIncrement = 1l;  //autoIncrement 자동으로 1씩 증가되는 걸 뜻하는 이름      static이 아니라 생성되면 사용가능
    private final List<Car> carList;        // List car carlist로 선언
    public  CarRepository(List<Car> carList){       // 외부로 부터 carlist를 받겠다. /배열안에 carklist를 담는다.
        this.carList = carList;             // 저장후 생김
    }

    public void insert(Car car) {
        car.setId(autoIncrement++);  //insert 될떄마다 car 객체에서 1씩 증가
        carList.add(car);           // 1씩증가시기고 carid를 car에 담는다.
    }

    public Car delete(Long id) {                //delete하면 아이디가 id인지 맞는지?
        for(int i = 0; i < carList.size(); i++){        //carlist 사이즈만큼 반복할떄
            if (carList.get(i).getId() != id){      // carlist안의 id랑 id 가 다르면 넘어가고
                continue;
            }
            return  carList.remove(i);      //같으면 i번쨰 리스트를 삭제한다.

        }
        return  null;  // for 다돌았는데 삭제할게없으면 retrun이 없으면 null
    }

    public void printAll() {
        System.out.println("Car 전체 조회");        // 프린트올을하면 이게 출력되고
        for (Car car : carList){                //carlist 안에 car를 하나씩 꺼내라
            System.out.println(car);            // car 출력해라
        }
        System.out.println();           // 그리고 줄을 바꿔라
    }
}
