package com.korai.study.ch04;

public class ArrayMain01 {
    public static void main(String[] args) {
        //배열 -> 나열하고자 하는 개수만큼 자료형의 크기대로 배정한것  index = 0 x 자료형크기
        byte[] a1 = new byte[4]; // 자료형이 byte인 배열(배열자료형)
        short[] a2 = new short[4];
        int[] a4 = new int[4]; // 내가 원하는 공간을 만들어야 하니깐 new  배열자체가 하나의 자료형 공간을 만든거

        a1 = new byte[5]; // 여기서 [4]는 가지비컬렉터로 사라짐
        a1 = null; // a1 값은 없어진다 참조할 "주소"가 없다

        class Student{
            String name;
            double[] scores;
        }
        Student s = new Student();
        s.name = "김준삼";
        s.scores = new double[3];
        s.scores[0] = 70.0;

        Student[] students = new Student[4]; // class 배열에는 객체를 담을수있다.
        students[0] = new Student(); // 객체니깐  new
        students[0].name = "김준일";
        students[1] = new Student();
        students[1].name = "김준이";

        Student[] students2 = students; // 19번과 같다
        students2[0] = s; // 17번을 대입해라
        students2[2].scores[1] = 80.5; // 22번 배열의 1번index는 80.5

    }
}