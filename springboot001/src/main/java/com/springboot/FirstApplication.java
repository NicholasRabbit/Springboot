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

/*6，springboot可把项目打成jar包，从而简化部署，见pom.xml里的配置
使用步骤：
(1),pom.xml里配置相关依赖“<artifactId>spring-boot-maven-plugin</artifactId>”
(2),运行maven构建项目的步骤，打包项目，打成的jar包在target目录下
(3),直接java -jar spring-boot-01-helloworld-1.0-SNAPSHOT.jar即可
实际相当于启动了一个独立的小型的web项目模块，在浏览器输入localhost:8080/first就能访问(这属于一个微服务)
* */



@SpringBootApplication     //这个注解表示这个一个springboot主程序类，表名这是一个springboot应用
public class FirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class, args);     //启动springboot项目
    }
}
