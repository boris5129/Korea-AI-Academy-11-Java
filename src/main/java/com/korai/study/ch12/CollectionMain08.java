package com.korai.study.ch12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionMain08 {
    public static void main(String[] args) {
        Map<String, String> productMap = new HashMap<>();//hash 키값으로 데이터 다룸
        //키값으로 String 많이쓰고 value 값으로 String Object 많이씀
        productMap.put("productName", "상품1");              //put을 add로 사용 add 없다
        productMap.put("price", "20000");                  //상품하나에대한 정보를 묶음으로
        productMap.put("createdAt", "2026-10-19");          //객체랑 유사하다
        System.out.println(productMap);
        System.out.println(productMap.get("price"));        //get 쓸수있고 key값 입력

        Map<String, Object> student = new HashMap<>();  //hash값대로 출력
        student.put("name", "김준일");                     //순서대로하려면 LinkedHash맵
        student.put("age", 33);
        student.put("gender", true);    //뒤에 object를 줘서 33 true 가능
        System.out.println(student);        //object라 해당자료형으로 다운캐스팅해서 써야함

        Map<String, Object> student2 = new TreeMap<>();
        student2.put("name", "김준일");            //오름차순대로 키값을 기준으로
        student2.put("age", 33);
        student2.put("gender", true);
        System.out.println(student2);

        Map<String, Object> student3 = new LinkedHashMap<>();
        student3.put("name", "김준일");            //넣은순서대로
        student3.put("age", 33);
        student3.put("gender", true);
        System.out.println(student3);
    }
}
