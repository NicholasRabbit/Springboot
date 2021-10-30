package com.springboot.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootController003 {

    @ResponseBody
    @RequestMapping("/config")
    public String configTest(){
        System.out.println("configTest execute!");
        return "sucess";
    }
}
