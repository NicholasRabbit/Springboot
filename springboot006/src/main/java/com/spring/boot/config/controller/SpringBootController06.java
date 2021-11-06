package com.spring.boot.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/boot006")
@Controller
public class SpringBootController06 {

    @ResponseBody
    @RequestMapping("/outer_config")
    public String outerConfig(){
        return "outer config test success!";
    }
}
