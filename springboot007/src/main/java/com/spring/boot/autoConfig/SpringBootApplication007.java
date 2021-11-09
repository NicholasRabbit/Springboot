package com.spring.boot.autoConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1，SpringBoot启动时会加载一些自动配置文件，因此省的个人像Spring框架一样写spring.xml配置文件了
 * 2，如果SpringBoot的默认配置不符合要求,可在application.properties/yml配置文件里自定义
 *    例：spring.http.encoding.charset=utf-8
 *       自定义编码格式，底层与SpringMVC的CharacterEncodingFilter设置一样
 * 3，参照注解@SpringBootApplicatin-->@EnableAutoConfiguration-->@AutoConfigurationImportSelector
 *    其它参照笔记及源码
 * */

@SpringBootApplication
public class SpringBootApplication007 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication007.class, args);
        System.out.println("007 deployed successfully!");
    }
}
