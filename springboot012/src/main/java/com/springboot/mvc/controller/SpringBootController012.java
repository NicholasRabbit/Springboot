package com.springboot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value="/boot12")
@Controller
public class SpringBootController012 {

    @RequestMapping(value={"/config"})  //一般最简单的请求时get，因此这里不要加RequestMethod.POST, 易造无法访问此请求。
    public String mvcConfig(){
        return "done";
    }
}
