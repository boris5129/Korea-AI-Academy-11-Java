package com.korai.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Stream03 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 2, 10, 30, 22, 33, 50, 53);
        System.out.println(nums.stream().filter(num -> num % 5 == 0).toList()); //5의배수를 담은 List를 출력하시오.
        System.out.println(nums.stream().map(num ->num % 5 == 0 ? num * 1000 : num ).toList()); //5의배수를 담은 List를 출력하시오.

        System.out.println(new CustomStream<>(nums).filter(num -> num % 5 == 0).toList());
        System.out.println(new CustomStream<>(nums).map(num -> num % 5 == 0 ? num * 1000 : num).toList());
    }
}

@Data
@AllArgsConstructor
class CustomStream<T> {
    private List<T> list;               //T를 담는 List를 class만 쓰게 private한다. T는 매개변수타입

    public CustomStream<T> map(Function<T, T> fx) {   //map을 만드는데 map은 Function<T,T>를 받는 익명클래스의 객체 fx를 받는다.(매개변수)
        List<T> newList = new ArrayList<>();        // list를 담을 새 ArrayList를 만들고
        for(T t : list){                    // list에서 T타입의 t를 하나씩 뺴서
            newList.add(fx.apply(t));       //T의 변수 t(list내용물을 담은 변수)를 Function의 객체에 변수를넣고 그값을 newList에 넣는다.
        }
        this.list = newList;        //그렇게 완성된 리스트를 newList로 대입한다.
        return this;                //this를 리턴 자신을 돌려준다. 같은주소를 계속 참조하게해준다 (체이닝 chaining)
    }

    public CustomStream<T> filter(Predicate<T> predicate) {     //filter를 기능 정의하는데
        List<T> newList = new ArrayList<>();        //newLisT를 만들고
        for(T t : list){                //똑같이 list에서 한개씩 꺼내서 t에 담아
            if(predicate.test(t)){      //매개변수 predicate에 위에서 담은 t가 True면
                newList.add(t);         //newList에 t를 넣어
            }
        }
        this.list = newList;            //list에 newList를 대입해
        return this;
    }

    public List<T> toList() {
        return list;
    }
}
