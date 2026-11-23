package com.korai.study04.service;

import com.korai.study04.repository.UserRoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor  //service 생성하려면 repository 생성자가 필요하다고 알려줌
//생성자에의한 종속도 가능하다.
public class UserRoleService {

    private UserRoleRepository userRoleRepository;
}
