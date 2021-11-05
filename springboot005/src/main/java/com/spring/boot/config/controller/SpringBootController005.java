package com.spring.boot.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/boot005")
@Controller
public class SpringBootController005 {

    @ResponseBody
    @RequestMapping(value="/config")
    public String configTest(){
        return "005 config test success!";
    }
}
