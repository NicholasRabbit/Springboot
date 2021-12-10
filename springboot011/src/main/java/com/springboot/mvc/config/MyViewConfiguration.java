package com.springboot.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//个人自定义的配置类，配置一个自定义的视图解析器
@Configuration
public class MyViewConfiguration {

    @Bean    //相当于老SpringMVC框架的springmvc.xml配置文件中<bean> 的作用
    public MyViewResolver getMyViewResolver(){
        //注意，返回值对象MyViewResolver必须继承了ViewResolver，被认为是一个ViewResolver, 否则无法被SpringBoot识别是干什么的。
        return new MyViewResolver();
    }
}
