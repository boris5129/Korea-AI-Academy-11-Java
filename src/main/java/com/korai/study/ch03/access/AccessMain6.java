package com.korai.study.ch03.access;

import com.korai.study.ch03.access.entity.Role; // 외부 폴더에서 가져옴 public 이 있으면

public class AccessMain6 { // public 은 이름과 동일한 class에만 붙는다.
    public static void main(String[] args) {
        AccessMain6 accessMain6 = new AccessMain6();
        accessMain6.run();
    }
    void run() {
        School2 s = new School2();
        AccessMain4 accessMain4 = new AccessMain4();
        Role role = new Role();

    }
}
