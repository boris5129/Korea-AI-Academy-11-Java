package com.korai.study03.domain.customer.controller;

import com.korai.study03.domain.customer.dto.CustomerCreateRequest;
import com.korai.study03.domain.customer.dto.CustomerResponse;
import com.korai.study03.domain.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/customers")  //URL 패턴 : /api/entity명(복수형)
@RestController
public class CustomerController {
    //컨트롤러 이름 규격
    //Entity명 + Controller
    // ex) UserCOntroller , OrderController, OrderItemController

    // CRUD(Create, Read, Update, Delete)
    // Method명 규칙
    // C -> post : 생성
    // CreateCustomer(), addCustomer(), registerCustomer()
    // R -> GET : 조회
    // 단건 조회 : getCustomer(), findCustomer()
    // 다건 조회 : getCustomers(), listCustomers(), getCustomerList()
    // U -> PUT(부분수정), PATCH(전체수정) : 수정
    // updateCustomer(), modifyCustomer()
    // D -> Delete : 삭제
    // deleteCustomer(), removeCustomer()
    @Autowired //springboot에서는 이렇게하면 자동으로 객체 주입 1개만 생성되게해줌 @service가 있어야한다.
    private CustomerService customerService;



    //DTO data transfer object 데이터 받는 거 자료형?
    //여기서 어노테이션 통해 자동으로 변환
    @PostMapping
    public CustomerResponse create(@RequestBody CustomerCreateRequest request){
        System.out.println(request);
        CustomerResponse customerResponse = customerService.create(request);
        return customerResponse;

    }
}
