package com.springboot.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/controller02")
@Controller
public class SpringBootController02 {

    @ResponseBody
    @RequestMapping("/test")
    public List<String> test(){
        List<String>  arrayList = new ArrayList<>();
        arrayList.add("Liam");
        arrayList.add("Tom");
        return arrayList;
    }
}
