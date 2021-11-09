package com.spring.boot.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 外部配置文件的加载顺序，高优先级会覆盖低优先级文件的相同配置，不用配置项则会形成互补
 * 优先级从高到底：
 * 1，命令行参数，即SpringBoot项目打包好jar包，运行时在DOS窗口进行设置
 *    例： java  -jar springboot006-1.0-SNAPSHOT.jar  --server.port=8088  --server.context-path=/boot006 :可指定端口，浏览器访问项目地址根路径localhost:8088/boot006
 *    其它范例：
 *    (1)--spring.config.name=myApplication :
 *       加载默认目录/main/resources/下的指定名字myApplication的配置文件，
 *       不用加后缀，SpringBoot自动找myApplication.properties或~.yml文件。properties的后缀文件优先级高。
 *    (2)--spring.config.location=classpath:/config/myApplication.yml
 *       加载指定目录下的配置文件，这里有后缀
 *       --spring.config.location=classpath:/config/myApplication.yml,application-dev.properties
 *       加载指定目录下的多个配置文件，用逗号隔开
 *       --spring.config.location=classpath:/config/   如果指定的是一个目录，注意config后有斜线“/”
 *       加载config目录下的默认名字的配置文件application.properties或application.yml
 *    (3)上面(1)(2)是加载项目内部，外部的配置文件需要加绝对路径,例：
 *       --spring.config.location=D:\config\application.properties
 *=======
 * 2，JNDI的属性设置，java:comp/env 的属性;（后期待研究）
 * 3，Java系统属性(System.getProperties());
 * 4，操作系统变量，
 *   例，在idea中设置Run-->Edit Configuration-->Configuration:Environment
 *       选项里配置：VM options ：表示在java虚拟机中进行配置
 *                  Programme arguments ：和第1条中命令行配置原理一样，只是形式不同
 * 5，RandomPropertySource配置的random.*属性 ，此方式常用于加密方面
 * =======
 * 其它的从jar包外优先于jar包内，指定application-{profile}.properties/yml的优先，
 * 6，如果这默认名字的配置文件中有语句指定激活:spring.profiles.active=devlop，
 *    那么指定激活的配置文件application-devlop.properties的优先级高于激活它的同位置的默认名字的配置文件。条件是必须有激活语句才可。
 *    参照SpringBootApplication005中的笔记
 *
 * */

@SpringBootApplication
public class SpringBootApplication006 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication006.class, args);
        System.out.println("006 deployed successfully!");
    }

}
