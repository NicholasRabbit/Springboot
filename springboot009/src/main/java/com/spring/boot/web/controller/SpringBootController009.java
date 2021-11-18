package com.spring.boot.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping(value="/boot009")
@Controller
public class SpringBootController009 {

    @ResponseBody
    @RequestMapping(value={"/list"})
    public String showList(){
        return "done";
    }
}
