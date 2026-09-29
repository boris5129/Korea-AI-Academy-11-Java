package com.korai.study.ch04;

public class ArrayMain02 {
    public static void main(String[] args) {
        // 배열 선언 및 생성, 초기화
        // 배열 선언 => 자료형[] 배열 변수명;
        int[] nums1;
        int[][] nums2; // int 배열의 배열

         nums1 = new int[3];
         nums2 = new int[2][3]; // 3개짜리를 2개 0,0 0,1 0,2 1,0 1,1 1,2

        nums2[0][0] = 10;
        nums2[0][1] = 20;
        nums2[0][2] = 30;
        nums2[1][0] = 40;
        nums2[1][1] = 50;
        nums2[1][2] = 60;

        int[] nums3 = nums2[0];
        nums3[0] = 100; // 0,0 의 값이 100

//        int[] nums4 = new int[] {10, 20, 30, 40}; // 0, 1, 2, 4
        int[] nums4 = {10, 20 ,30 ,40};  // new는 생략가능 앞에 자료형이 정해져있어서 최초 선언용으로만 생략가능
        //배열을 초기화 함과 동시에 배열의 수를 지정

        run(new int[] {1, 2, 3}); // run 의 배열을 당겨온다. new 생략 불가능
        //run({1 ,2 ,3 ,4}) 는 안됨.

    }

    static void run(int[] arr) {

    }
}


