package com.springboot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/boot011")
@Controller
public class SpringBootController011 {


    @RequestMapping(value="/list")
    public String showList(Model model){

        return "list";
    }
}
