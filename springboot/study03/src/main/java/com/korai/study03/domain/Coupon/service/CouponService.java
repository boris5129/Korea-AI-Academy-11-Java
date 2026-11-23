package com.korai.study03.domain.Coupon.service;

import com.korai.study03.domain.Coupon.dto.CouponCreateRequest;
import com.korai.study03.domain.Coupon.dto.CouponResponse;
import com.korai.study03.domain.Coupon.entity.Coupon;
import com.korai.study03.domain.Coupon.mapper.CouponMapper;

public class CouponService {
    private CouponMapper couponMapper;

    public CouponResponse create(CouponCreateRequest request){
        Coupon coupon = request.toCoupon();
        couponMapper.insert(coupon);
        return coupon.toCouponResponse();
    }
}
