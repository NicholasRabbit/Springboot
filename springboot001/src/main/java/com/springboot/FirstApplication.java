package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*Springboot项目创建基本步骤，使用Maven构建
1，创建Maven模块工程，设置好jdk,以及groupId等
2，在pom.xml文件里配置相关依赖项
3，在main-->java-->下创建一个启动应用类，用来启动springboot应用
4，springboot也有controller,service,dao层，只是不用配置spring.xml等文件了
5，但是MyBatis的映射文件xxxMapper.xml还需要配置，xxxMapper.java还是在dao层
* */


@SpringBootApplication     //这个注解表示这个一个springboot主程序类，表名这是一个springboot应用
public class FirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class, args);     //启动springboot项目
    }
}
