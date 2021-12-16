package com.springboot.mvc.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc     //加入此注解表示全面手动配置SpringMVC，禁用了SpringBoot自动配置SpringMVC的功能，该注解如何起作用见个人笔记源码解析
@Configuration
public class MyCustomizedConfig extends WebMvcConfigurerAdapter {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //设置访问项目根路径就直接到login.html, 注意login.html必须在/resources/templates文件夹里, 由Thymeleaf模板引擎渲染
        ViewControllerRegistration view = registry.addViewController("/");
        view.setViewName("login");
    }
}
