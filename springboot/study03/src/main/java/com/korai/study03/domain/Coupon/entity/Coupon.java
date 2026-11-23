package com.korai.study03.domain.Coupon.entity;

import com.korai.study03.domain.Coupon.dto.CouponResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {
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

    public CouponResponse toCouponResponse(){
        return new CouponResponse(0,
                code,
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
