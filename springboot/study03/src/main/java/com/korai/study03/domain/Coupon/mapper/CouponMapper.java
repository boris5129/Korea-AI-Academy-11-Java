package com.korai.study03.domain.Coupon.mapper;

import com.korai.study03.domain.Coupon.entity.Coupon;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CouponMapper {
    Coupon findAll(@Param("couponId")int couponId);
    int insert(Coupon coupon);
}
