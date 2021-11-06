package com.spring.boot.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 外部配置文件的加载顺序，高优先级会覆盖低优先级文件的相同配置，不用配置项则会形成互补
 * 优先级从高到底：
 * 1，命令行参数，即SpringBoot项目打包好jar包，运行时在DOS窗口进行设置
 *    java  -jar springboot006-1.0-SNAPSHOT.jar  --server.port=8088  --server.context-path=/boot006 :可指定端口，项目根路径
 * 2，JNDI的属性设置，java:comp/env 的属性。（后期待研究）
 * 3，Java系统属性
 * */

@SpringBootApplication
public class SpringBootApplication006 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication006.class, args);
        System.out.println("006 deployed successfully!");
    }
}
