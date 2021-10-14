package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @ResponseBody
    @RequestMapping(value="/first")
    public String test(){
        return "done";
    }
}
