package com.springboot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value="/boot12")
@Controller
public class SpringBootController012 {

    @RequestMapping(value={"/config"}, method={RequestMethod.POST})  //一般最简单的请求时get，因此这里不要加RequestMethod.POST, 易造无法访问此请求。
    public String mvcConfig(){
        System.out.println("mvcConfig==>");
        return "done";    //使用@EnableWebMvc后视图解析器还是会起作用，原因待研究
    }

    //请求此路径会转到/templates/edit.html页面，因为底层得到了Thymeleaf模板引擎的解析
    @GetMapping(value="/modify")
    public String edit(){
        return "edit";  //表示转发到edit.html页面
        //return "success";  //如果是/static/success.html 则不会转发过去，因为Thymeleaf不会对staic目录进行解析
    }
}
