package com.springboot.tomcat;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/*
* SpringBoot项目打war包，需要
* 写一个初始化类来继承SpringBootServletInitializer，并重写configure方法
* */
public class ApplicationInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application014.class);
    }
}
