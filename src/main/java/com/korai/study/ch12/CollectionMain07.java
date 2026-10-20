package com.korai.study.ch12;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionMain07 {
    public static void main(String[] args) {
        Set<Integer> nums3 = new HashSet<>();        //키워드로 이름을 달아주겠다
        System.out.println(Objects.hash("ㄱ"));
        System.out.println(Objects.hash("ㄴ"));  //한글 문자열은 3byte씩 먹는다
        System.out.println(Objects.hash("ㄷ"));  //데이터에 정해진 순서가 있다
        System.out.println(Objects.hash("김"));  // 44639 "김"의 고유의 hash값
        System.out.println(Objects.hash("김"));  // hash값은 같은 문자에 동일한 값
        // hash를 쓰면 hash값에 의한 정렬이 일어난다. 중복 찾기 쉽다

        Set<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        nums.add(70);
        nums.add(80);
        nums.add(80);       // 중복허용안해서 1개만 나온다
        nums.add(80);
        System.out.println(nums);
        //hash 기법(hash값)에 의한 정렬이 일어나서 순서대로 안나옴
        //hash 연산을해서 나온다
        //데이터 입력이 많으면 hash 탐색이 많으면, Tree 순서대로니 찾다가 멈출수있어서 탐색에 유리
        //삽입삭제는 LinkedList, 순서는 ArrayList 조회는 이거 (인덱스 쳐서 찾을수 있다)
        Set<Integer> nums2 = new TreeSet<>();   //Tree 오름차순으로 나옴
        nums2.add(10);
        nums2.add(20);
        nums2.add(30);
        nums2.add(40);
        nums2.add(50);
        nums2.add(60);
        nums2.add(70);
        nums2.add(80);
        nums2.add(80);      // 중복허용안해서 1개만 나온다
        nums2.add(80);
        System.out.println(nums2);
        //TreeSet은 트리형태를 만든다. 정렬을해서 넣는다
        //정렬이 일어나야해서 속도가 조금 늦다. 위치정렬이 일어나야해서
        System.out.println(nums2.contains(80));
        System.out.println(nums2.containsAll(List.of(30,50,90)));
        //하나라도 없으면 false
        //집합개념 집합을 할때 쓴다.
        //인덱스가 없으니 get 안됨
        //set에는 remove에 index가 없다 값으로만 지울수있다.
        //세트자료형은 확인용이다. contains로 80이 잇으면 그냥 80을 뽑아쓴다. get없이.

        List<String> names = List.of(
                "김준일",
                "김준일",
                "김준이",
                "김준일",
                "김준이"
        );
        Set<String> nameSet = new HashSet<>();
        nameSet.addAll(names);
        System.out.println(nameSet);
        //중복 제거해서 들어감
        @Data
        @AllArgsConstructor
        class Student {
            String name;
            String address;
        }

        List<Student> students = List.of(
                new Student("김준일","서울"),
                new Student("김준일","부산"),
                new Student("김준이","서울"),
                new Student("김준이","경남"),
                new Student("김준삼","경남")
        );
        Set<String> addressSet = new HashSet<>();
        for(int i = 0; i < students.size(); i++){
            addressSet.add(students.get(i).getAddress());
        }       //get(i) 다음 getAddress 몰랐음 복습시 체크
        System.out.println(addressSet);
        //list안에 주소를넣고 중복제거 (student를 가져온게아니라 주소를 copy한거라 student는 남는다)
        System.out.println(students.stream().map(s -> s.getAddress()).collect(Collectors.toSet()));
        // stream 후 collection 꼭배운다고 함 복습 必
        for(String addr : addressSet){
            System.out.println(addr);//for each로 꺼낸다
        }

        Iterator<String> addr = addressSet.iterator();
        while(addr.hasNext()){
            System.out.println(addr.next());
        }
        //이렇게 반복시킬수있다 공부하기 잘안쓰기함
    }
}

