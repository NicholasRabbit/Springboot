package com.springboot.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//个人自定义的配置类，配置一个自定义的视图解析器
@Configuration
public class MyViewConfiguration {

    @Bean    //相当于老SpringMVC框架的springmvc.xml配置文件中<bean> 的作用
    public MyViewResolver getMyViewResolver(){
        return new MyViewResolver();
    }
}
