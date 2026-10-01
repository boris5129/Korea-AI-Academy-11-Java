package com.korai.study.ch05;

import java.util.Arrays;
import java.util.Scanner;

public class ControlMain06 {
    public static void main(String[] args) {
        String[] names = new String[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름 입력 프로그램");

        while (true){
            System.out.println("이름을 추가하시겠습니까?(y/n) : ");
            String YN = scanner.nextLine();
            if(YN.equalsIgnoreCase("y")){
                System.out.println("이름 : ");
                String name = scanner.nextLine();
                String[] newNames = new String[names.length + 1]; // 새로운 배열을 만든다 새로운 입력을 넣어줄
                for(int i = 0; i < names.length; i++){ // 기존 배열만큰 반복
                    newNames[i] = names[i];  // 기존배열값을 새배열값으로 이동
                }
                newNames[newNames.length - 1] = name; //새배열에 마지막 입력을 넣는다
                names = newNames; // 새배열을 기존 배열로 다시 이동
            }else if(YN.equalsIgnoreCase("n")){ //equalsIgnoreCase 대소문자 상관없이
                break;
            }else{
                System.out.println("다시 입력하세요");
            }
        } System.out.println(Arrays.toString(names));
    }
}
