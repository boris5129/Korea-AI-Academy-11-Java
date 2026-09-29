package com.korai.study.ch04;

import java.util.Arrays;

public class ArrayMain04 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++){
            nums[i] = i + 1;  // nums[] = {1,2,3,4,5,6,7,8,9,10}
        }
        System.out.println(arrayToString(nums));
        System.out.println(Arrays.toString(nums));// 밑에꺼를 넣는데 배열을 10번까지해라
    }

    static String arrayToString(int[] arr){  // arr 배열을 담은 STRing
        String str = ""; // class의 변수x 지역변수(무조건 초기화)는 찌꺼기가 남아있어 초기화 필요 ""로하면 공백으로 초기화
        // 안에 뭐가있을지 모르기에 += 기능을 사용할수없다.
        for(int i = 0; i < arr.length; i++){ // i를 arr 수만큼 반복해라
            if (i == 0)
                 str += "[";   // i가 0일때 [ 를 써라
                 str += arr[i] + ",";
                 if (i == arr.length - 1) str += "]";  // i가 arr의 길이 -1 일때 ] 를 써라//arr 배열에 i 다음에는 , 를 써라
            }  // [1,2,3,4,5,6,7,8,9,10    ] 쭉 간다
        return str;  // 이 값을 str에 return해라 13번으로
    } // 한줄로 끝나지면 중괄호 생략가능
}
