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
 * 4，这些自动配置类跟springboot003里的CustomerConfig.java配置类一样，替代了spring.xml配置文件，
 *    SpringBoot已经写好了很多自动配置类，会根据每个jar包下/META-INF/xxx.properties的的设置，给相关项赋值
 *    例如：org.springframework.boot:autoconfigure包下的一个编码设置类，跟以前SpringMVC的CharacterEncodingFilter功能一样，过滤编码
 *    prefix引入配置文件中“spring.http.encoding = xxx”的值
 *    @ConditionalOnProperty(prefix = "spring.http.encoding", value = "enabled", matchIfMissing = true)
 *    public class HttpEncodingAutoConfiguration {}
 * */

@SpringBootApplication
public class SpringBootApplication007 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication007.class, args);
        System.out.println("007 deployed successfully!");
    }
}
