package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("/index")
    public ModelAndView main(){
        return new ModelAndView("index");
    }
    @RequestMapping("/signIn")
    public ModelAndView signIn(){
        return new ModelAndView("signin");
    }
}
