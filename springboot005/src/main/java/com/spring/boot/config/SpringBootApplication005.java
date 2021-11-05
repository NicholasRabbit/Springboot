package com.spring.boot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 一个项目中不同位置的配置文件的加载优先级范例
 * SpringBoot项目启动后会从以下位置扫描application.yml/properties文件，加载优先顺序：从上到下
 *1, ./config/application.properties : 项目根路径下的config目录中的配置文件
 *2, ./application.properties : 项目根路径下的配置文件
 *3, classpath:/config/application.properties : 类路径下的config目录中的配置文件
 *4, classpath : /application.properties : 类路径根目录下的配置文件
 * SpringBoot会从这四个位置全部加载配置文件
 * 如果各位置的配置文件配置不同的参数，则形成互补，如果不同使用优先级高的配置文件中的设置参数
 *
 * */

@SpringBootApplication
public class SpringBootApplication005 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication005.class, args);
        System.out.println("005 deployed successfully!");
    }
}
