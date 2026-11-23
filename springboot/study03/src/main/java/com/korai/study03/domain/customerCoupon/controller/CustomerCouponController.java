package com.korai.study03.domain.customerCoupon.controller;

import com.korai.study03.domain.customerCoupon.dto.CustomerCouponResponse;
import com.korai.study03.domain.customerCoupon.service.CustomerCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer/{customerId}/coupons")//customer/PK를 넣고/ 쿠폰즈 PK(프라이머키)의 쿠폰들
public class CustomerCouponController {

    @Autowired
    private CustomerCouponService customerCouponService;
    @GetMapping
    public List<?> getAll(@PathVariable int customerId){
        return customerCouponService.getAll(customerId);
    }
    @GetMapping("/{customerCouponId}")
    public CustomerCouponResponse get(@PathVariable int customerId, @PathVariable int customerCouponId){
        return customerCouponService.get(customerCouponId);
    }
}
