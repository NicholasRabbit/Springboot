package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootController004 {

    @ResponseBody
    @RequestMapping("/list")
    public String showList(){
        return "004 success!";
    }
}
