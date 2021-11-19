package com.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 *引入Thymeleaf模板引擎范例
 * 1，Thymeleaf的相关默认配置在ThymeleafProperties.java里
 * 2，由源码可知该引擎默认对classpath:/templates/里的HTML页面进行渲染，别的位置渲染不了
 * */


@RequestMapping(value="/boot010")
@Controller
public class SpringBootController010 {

    @RequestMapping(value="/list")
    public String showList(Map<String, Object> map){
        map.put("username", "Tom");
        return "list";     //SpringBoot也和Spring一样，可转发到一个页面，默认是classpath:/**,即多层路径下找到list.html页面转发，并把数据过去
    }
}
