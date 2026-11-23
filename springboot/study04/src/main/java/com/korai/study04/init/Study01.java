package com.korai.study04.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Study01 implements CommandLineRunner {
    //CommandLineRunner 얘기 implement가 되고 Component하면(인스터스(객체)자동 생성 springboot에서 자동호출
    //Component 가 달리면 자동으로 컨테이너에 넣는다.
    @Override
    public void run(String... args) throws Exception {
        System.out.println("실행!");
    }
}
