package com.korai.study.ch12;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.*;

public class CollectionMain09 {
    public static void main(String[] args) {
        @Data
        @AllArgsConstructor
        class Student{
            private String name;
            private String address;

        }

        List<Map<String, Map<String, Map<String, Object>>>> data = List.of(
                Map.of("class1", Map.of(
                        "student1", Map.of(
                                "id", 1,
                                "object", new Student("김준일", "서울"),
                                "createdAt", LocalDate.of(2026, 1,1)
                        ),
                        "student2", Map.of(
                                "id", 2,
                                "object", new Student("김준이", "서울"),
                                "createdAt", LocalDate.of(2026, 1,2)
                        ),
                        "student3", Map.of(
                                "id", 3,
                                "object", new Student("김준삼", "서울"),
                                "createdAt", LocalDate.of(2026, 1,3)
                        )
                )),
                Map.of("class2", Map.of(
                        "student1", Map.of(
                                "id", 1,
                                "object", new Student("김준일", "부산"),
                                "createdAt", LocalDate.of(2026, 1,1)
                        ),
                        "student2", Map.of(
                                "id", 2,
                                "object", new Student("김준이", "부산"),
                                "createdAt", LocalDate.of(2026, 1,2)
                        ),
                        "student3", Map.of(
                                "id", 3,
                                "object", new Student("김준삼", "부산"),
                                "createdAt", LocalDate.of(2026, 1,3)
                        )
                )));
        System.out.println(data);
        //클래스별로 학생이름을 출력하라
        System.out.println
                (((Student)data.get(1).get("class2").get("student1").get("object")).getName());
        //object라 해당자료형으로 다운캐스팅해서 써야함
        for(int i = 0; i < data.size(); i++){
            Set<String> keySet = data.get(i).keySet();
            //1번쨰반복은 class1 2번째는 class2 index를 쓸수없으니 ketSey

            for(String key : keySet){
                //key를 꺼내 ketSet과 비교
                Map<String, Map<String, Object>> stringMap = data.get(i).get(key);
                Set<String> studentKeySet = stringMap.keySet();

                for(String studentKey : studentKeySet){
                    Map<String, Object> student = stringMap.get(studentKey);
                    Student s = (Student) student.get("object");
                    System.out.println(s.getName());
                }
            }
            //data.get(i);    //이게 class1 2 여기부터는 key인 string으로 되니 keyset으로
        }
        for(int i = 0; i < data.size(); i++){
           Set<Map.Entry<String, Map<String, Map<String, Object>>>> entries =
                   data.get(i).entrySet();
           for(Map.Entry<String, Map<String, Map<String, Object>>> entry : entries){
               System.out.println(entry.getKey());
               System.out.println(entry.getValue());
                //entry는 key와 value를 하나로 묶은 객체
               // get ket, get value로 나눠서 호출가능 Map을 나눈다고 보면됨.
           }
        }
        Map<String, Integer> ages = Map.of(
                "김준일", 33,
                "김준이", 34,
                "김준삼", 35
        );

        Set<Map.Entry<String, Integer>> entries = ages.entrySet();
        for(Map.Entry<String, Integer> entry: entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        //Map자료형을 entry들이 들어있는 set으로 바꾼다 그걸 변수 entries에 넣는다.
        //set 중복없을때 쓴다 Entry를 for each 돌려서 하는데 entry는 k, v 각각 뽑을수 있다.
        //왜 set으로 바꾸는지 entry 확인 이거 자체를 모르겠음

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>();
        entryList.addAll(entries);
        System.out.println(entryList.get(0));
        System.out.println(entryList.get(1));
        System.out.println(entryList.get(2));
    }
}
