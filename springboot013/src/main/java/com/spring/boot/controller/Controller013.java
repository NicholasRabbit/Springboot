package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller013 {

    @ResponseBody
    @RequestMapping(value="/boot013")
    public String list(){
        return "test war deploy";
    }
}
