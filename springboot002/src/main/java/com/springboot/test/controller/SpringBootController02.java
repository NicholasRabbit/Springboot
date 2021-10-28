package com.springboot.test.controller;

import com.springboot.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/controller02")
@Controller
public class SpringBootController02 {

    @Autowired
    User user;

    @ResponseBody
    @RequestMapping("/test")
    public List<String> test(){
        List<String>  arrayList = new ArrayList<>();
        arrayList.add("Liam");
        arrayList.add("Tom");
        System.out.println("user==>" + user);
        return arrayList;
    }
}
