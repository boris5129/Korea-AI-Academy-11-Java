package com.korai.study.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
// map() (함수,메서드)은 반복을하여 치환을 쉽게한다. ex[10,20,30] 을 [100,200,300] 똑같은규칙반복 새로운배열만든다.
// 자료형 Map 과 다르다
public class Stream01 {
    public static void main(String[] args) {
        // 반복작업을 하나의 라이브러리로 구조화 해둔 것 = Stream
        Stream<Integer> numStream = Stream.of(10, 20, 30, 40, 50);  //Stream은 new 하지 않는다.
        System.out.println(numStream);      //자료 주소가 나옴
        System.out.println(numStream.toList()); //주소를 list로 바꿔 준다.
        //numStream.map();        //맵의 자료형은 function이다.
        //System.out.println(numStream.map(num -> num *10).toList()); //num -> num *10 람다식 익명클래스의 값
        // 윗줄에서 한번써서 밑에 사용안되서 주석처리해서 밑을 연산시킨다
        Integer[] numArray = {10, 20, 30, 40, 50};   // 15번이랑 같은 코드다 map이 새로운배열을 만들어서 반복을 돌리니깐

        System.out.println(Arrays.stream(numArray).map(num -> {if(num % 4 ==0) return num * 10; return num;}).toList());
        //리턴된 값이 num(새로운 배열 즉 새로운 Stream)에 담기니깐

        System.out.println(Arrays.stream(numArray).map(num -> num * 10).toList());
        //stream 이러면 스트림으로 바꿔준다. 배열을 stream으로 바꿔라. stream이 아니면 map 못씀 / .toList() 리스트로 바꾸겠다
        Integer[] newNumArray = new Integer[5];
        for(int i = 0; i < numArray.length; i++){
            newNumArray[i] = numArray[i] * 10;
        }
        numArray = newNumArray;
        System.out.println(Arrays.toString(numArray));

        Function<Integer, Integer> fx = (num) -> num * 10;
        // (num) -> num * 10; <- 인스턴스의  주소값 변수에=(대입)되니깐 오버라이드해서 new한거(풀어쓰면 암)
//        Function<Integer, Integer> fx = 'new' Function<Integer, Integer>() {
//            '@Override'
//            public Integer apply(Integer integer) {           // 26번줄 익명의 클래스의 객체를 받는다 이걸 받는다
//                return 0;
//            }
//        }
        print(fx);
        print(num -> num * 20);

        List<String> names = List.of("김준일", "김준이", "김준삼");
        Stream<String> namesStream = names.stream();  //생성 되는 부분 // names를 카피해서 namesStream에 담는다.
        Stream<String> namesStream2 = namesStream.map(n -> n + "님");        //중간연산(map동작) map해서 반복 새로담는다.
        //map의 리턴이 스트림 map 돌면 namesStream은 지금 비게된다.
        Stream<String> namesStream3 = namesStream2.map(n -> "이름: " + n);   //중간연산
        //map의 리턴이 스트림 map 돌면 namesStream2는 지금 비게된다.
        //중간연산은 계속이어할수있고(Return이 stream이기 때문에) 중간연산의 결과는 다시 Stream이다.
        Stream<String> namesStream4 = namesStream3.filter(name -> !name.contains("일")); // 포함되지 않은것만 담아라
        //이것도 중간연산 filter도 있다 / filter조건을 충족(True)하는걸 담아라
        List<String> newNames = namesStream4.toList();                          //최종연산

        System.out.println(names.stream()
                .map(n -> n + "님")
                .map(n -> "이름: " + n)
                .filter(name -> !name.contains("일"))
                .toList());

        System.out.println(newNames);
        }
        static void print(Function<Integer, Integer> a){    //Function 는 인터페이스 ) implement 해서 new해야한다
                                                            //Function 을 implement한 익명의 클래스의 객체를 받는다
            System.out.println(a.apply(5));     //apply는 function의 추상메서드
        }
    }

//Stream은 생성 -> 중간 연산 -> 최종연산 형태
// 중간연산은 Stream 객체를 생성해준다(일회용) 스트림에는 카피본을담고 꺼내쓰면 없어짐(일회용) 그리고 끝까지 일해야함 남으면 안됨
//배열을 만들고싶으면 Array.Stream   말고 바로만들고싶으면 Stream.of
//Stream 이 리턴자료형이 스트림으로 리턴되는건 중간연산// Set, boolean,long(그냥 스트림리턴뺴고)로 리턴되면 최종연산.