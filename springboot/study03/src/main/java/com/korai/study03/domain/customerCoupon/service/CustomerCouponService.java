package com.korai.study03.domain.customerCoupon.service;

import com.korai.study03.domain.customerCoupon.dto.CustomerCouponResponse;
import com.korai.study03.domain.customerCoupon.entity.CustomerCoupon;
import com.korai.study03.domain.customerCoupon.mapper.CustomerCouponMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerCouponService {
    @Autowired
    private CustomerCouponMapper customerCouponMapper;

    public List<CustomerCouponResponse> getAll(int customerId){
        return customerCouponMapper.findAll(customerId)
                .stream()
                .map(CustomerCoupon::toCustomerCouponResponse)
//                .map(cc -> cc.toCustomerCouponResponse())  둘중 하나 사용
                .toList();
    }
    public CustomerCouponResponse get(int customerCouponId){
        return customerCouponMapper.findById(customerCouponId).toCustomerCouponResponse();
    }

}
