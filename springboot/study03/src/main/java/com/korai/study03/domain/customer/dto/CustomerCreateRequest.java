package com.korai.study03.domain.customer.dto;

import com.korai.study03.domain.customer.entity.Customer;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

//entity + 역할(생성) + 요청이지 응답인지
@Data   //DATA 안에 getter, setter, toString ,equals,hashcode
public class CustomerCreateRequest {
    private String name;
    private String phone;
    private String email;
    private LocalDate birthDate;
    private String district;
    private String address;
    private String grade;
    private boolean marketingAgreed;

    public Customer toCustomer(){
        return new Customer(0,
                name,
                phone,
                email,
                birthDate,
                district,
                address,
                grade,
                marketingAgreed,
                LocalDateTime.now());
    }
}
