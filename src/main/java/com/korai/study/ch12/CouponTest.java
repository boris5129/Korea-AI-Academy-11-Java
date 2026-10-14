package com.korai.study.ch12;

public class CouponTest {
    public static void main(String[] args) {
        System.out.println(Coupon.issue(10));
        System.out.println(Coupon.issue(20));
    }
}

class Coupon{
    private int percent;
    private static int n = 0;

    private Coupon(int percent){
        this.percent = percent;
    }

    public static String issue(int percent){
        n++;
        return String.format("C-%03d", n);
    }
}