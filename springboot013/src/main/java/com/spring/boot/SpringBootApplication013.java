package com.spring.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootApplication013 extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication013.class);
        System.out.println("013 deployed successfully!");
    }

    //SpringBoot项目打成war包放到Tomcat发布，需要继承SpringBootServletInitializer,并重写configure方法
    //原因：Tomcat无法识别上面的 main()方法来启动项目，需通过下面的configure方法来启动
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootApplication013.class);
    }
}
