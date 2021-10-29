package com.springboot.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

//在测试程序中测试@ConfigurationProperties("user")，@Value等

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
