package com.spring.boot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//方式二：或则重写一个类，例：BootApplicationInitializer.java来继承SpringBootServletInitializer，并重写configure方法

/*public class BootApplicationInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootApplication013.class);
    }
}*/
