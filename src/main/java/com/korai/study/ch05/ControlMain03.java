package com.korai.study.ch05;

public class ControlMain03 {
    public static void main(String[] args) {
        //System.out.println("*");
      //  System.out.println("**");
       // System.out.println("***");
      //  System.out.println("****");
      //  System.out.println("*****");


        for (int i = 0; i < 5; i++) {
            String s = "";  // * 0 1 2 3 4
            for (int j = 0; j < i + 1; j++) { // 1 2 3 4 5 로 늘어나고 *을 한개씩 넣어  없는거에 * 1개 1개에 2개
                s += "*";
            }
            System.out.println(s);
        }
        //   for(int i = 5; i > 0; i--){
      //      String a = "";
     //       for(int j = 0; j < i ; j++){
     //           a += "*";
     //       }
    //        System.out.println(a);
     //   }
        for(int i = 0; i < 5; i++){
            System.out.println(5-i);
        }
        for (int i = 0; i < 5; i++) {
            String s = "";
            for (int j = 0; j < 5 - i; j++) {
                s += "*";
            }
            System.out.println(s);
    }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + i; j++){
                System.out.print("*");
            }
            System.out.println();

}
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1 + i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 4 - i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
}

}