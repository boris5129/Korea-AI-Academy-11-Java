package com.korai.study03.domain.customer.entity;

import com.korai.study03.domain.customer.dto.CustomerResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    //entity는 데이터 테이블에 맞추고
    //DTO는 클라이언트의 요청과 응답에 맞춘다.
    private int customerId;
    private String name;
    private String phone;
    private String email;
    private LocalDate birthDate;
    private String district;
    private String address;
    private String grade;
    private boolean marketingAgreed;
    private LocalDateTime joinedAt;

    public CustomerResponse toCustomerResponse(){
        return new CustomerResponse(
                customerId,
                name,
                phone,
                email,
                birthDate,
                district,
                address,
                grade,
                marketingAgreed,
                joinedAt
        );
    }
}
