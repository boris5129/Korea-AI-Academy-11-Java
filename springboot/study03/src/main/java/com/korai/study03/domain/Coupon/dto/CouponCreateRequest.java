package com.korai.study03.domain.Coupon.dto;

import com.korai.study03.domain.Coupon.entity.Coupon;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CouponCreateRequest {
    private int couponId;
    private String code;
    private String name;
    private String discountType;
    private int discountValue;
    private int maxDiscount;
    private int minOrderAmount;
    private int validDays;
    private boolean isActive;
    private LocalDateTime created_at;

    public Coupon toCoupon(){
        return new Coupon(
                0,
                name,
                discountType,
                discountValue,
                maxDiscount,
                minOrderAmount,
                validDays,
                isActive,
                created_at
        );
    }
}
