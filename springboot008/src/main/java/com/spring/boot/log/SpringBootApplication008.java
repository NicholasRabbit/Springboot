package com.spring.boot.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1,SpringBoot的默认日志框架是SLF4J(接口层)和logback(实现层)
 * 2,Spring底层所用的框架是Jakarta Commons Logging(JCL)
 * 3,因此，SpringBoot为不同的日志框架配置了转接器，这个转接器(实际是接口适配器)上接JCL下接SLF4J，这就可使用SpringBoot本身的日志框架了
 * 4,日志测试在测试包test里的SpringBootTest008.java
 * */

@SpringBootApplication
public class SpringBootApplication008 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication008.class, args);
        System.out.println("008 deployed successfully!");
    }
}
