package com.spring.boot.autoConfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value="/boot007")
@Controller
public class SpringBootController007 {

    @ResponseBody
    @RequestMapping(value="/auto_config")
    public String autoConfig(){
        return "autoConfig test success!";
    }
}
