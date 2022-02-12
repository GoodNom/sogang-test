package com.example.test.controller;

import com.example.test.dto.LoginInfo;
import com.example.test.service.LoginInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    private final LoginInfoService loginInfoService;

//    @PostMapping(value = "/test",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//    public void getTest(@RequestBody LoginInfo loginInfo){
//        loginInfoService.getLogin(loginInfo);
//    }
    @GetMapping(value = "/test")
    public void getTest(@RequestParam String id,
                        @RequestParam String pwd){
        loginInfoService.getLogin(new LoginInfo(id,pwd));
    }

    @GetMapping("/all")
    public List<LoginInfo> findAll(){
        return loginInfoService.findAll();
    }
}
