package com.springboot.thymeleaf.controller;

import com.springboot.thymeleaf.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

/**
 *引入Thymeleaf模板引擎范例
 * 1，Thymeleaf的相关默认配置在ThymeleafProperties.java里，其上有@ConfigurationProperties
 * 2，由源码可知该引擎默认对classpath:/templates/里的HTML页面进行渲染，别的位置渲染不了
 * 3，Thymeleaf表达式用法见list.html
 * */


@RequestMapping(value="/boot010")
@Controller
public class SpringBootController010 {

    @Autowired
    User user01;

    @RequestMapping(value="/list")
    public String showList(Map<String, Object> map){

        user01.setId(1001);
        user01.setName("Nathan");
        map.put("username", "Tom");
        map.put("userList", Arrays.asList("Jerry", "Serena", "Liam"));
        map.put("user01",user01);

        return "list";     //SpringBoot也和Spring一样，可转发到一个页面，默认是classpath:/**,即类路径的任意默认的目录下找到list.html页面转发，并把数据过去
    }                      //底层模板引擎/list请求路径解析，使得return "list"转发到了/templates/list.html
}
