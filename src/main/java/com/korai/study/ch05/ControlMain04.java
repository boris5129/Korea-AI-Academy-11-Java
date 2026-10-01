package com.korai.study.ch05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ControlMain04 {
    public static void main(String[] args) throws IOException {
        //입력
        // 입력이 되기 전까지 실행이 종료되지 않는다.(계속 동작한다)
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);

        FileReader fileReader = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        String text = "";
        //반복횟수가 일정하지 않을때 while 정해져있으면 for
        while((text = bufferedReader.readLine()) != null){   // EOF 체크 ( 파일의 마지막인지 체크 - 아무것도 안오면 null 마지막)
            stringBuilder.append(text);
            stringBuilder.append("\n");

        }
        System.out.println(stringBuilder);
    }
}
