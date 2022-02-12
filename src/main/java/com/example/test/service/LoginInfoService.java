package com.example.test.service;


import com.example.test.db.entity.LoginInfoEntity;
import com.example.test.db.repository.LoginInfoRepository;
import com.example.test.dto.LoginInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LoginInfoService {

    private final LoginInfoRepository loginInfoRepository;

    private LoginInfoEntity dtoToEntity(LoginInfo loginInfo){

        var entity = new LoginInfoEntity();
        entity.setUserId(loginInfo.getId());
        entity.setUserPassword(loginInfo.getPwd());
        return entity;
    }
    public void getLogin(LoginInfo loginInfo){
        System.out.println(">>> " + loginInfo.toString());
        loginInfoRepository.save(dtoToEntity(loginInfo));
    }

    public List<LoginInfo> findAll() {
        return loginInfoRepository.findAll().stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    private LoginInfo entityToDto(LoginInfoEntity entity) {
        var dto = new LoginInfo();
        dto.setId(entity.getUserId());
        dto.setPwd(entity.getUserPassword());
        return dto;
    }

    public void getLogin(String id, String pwd) {
    }
}
