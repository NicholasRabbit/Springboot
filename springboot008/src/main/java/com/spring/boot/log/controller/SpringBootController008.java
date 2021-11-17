package com.spring.boot.log.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value="/boot008")
@Controller
public class SpringBootController008 {

    @ResponseBody
    @RequestMapping(value="/log")
    public String doSome(){
        return "logTest success!";
    }

}
