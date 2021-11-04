package com.springboot.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/*1,@PropertySource(value={"classpath:student.properties"})用法，见Student.java
    导入自定义的配置文件，进行赋值注入，不用application.properties或application.yml默认的了
  2,@ImportResource
    (1)SpringBoot里不会自动识别Spring框架的配置文件，因此要加此注解进行导入
    (2)导入原先的spring框架的配置文件例如spring.xml,customer-config.xml(自定义名称)，可以注入赋值组件值等,跟以前Spring框架的做法一样
    (3)该注解写在主应用程序类上，即本类里SpringBootApplication003.java
       (此种方式不常用)
    导入以后，后面做法和传统的Spring框架一模一样，详见SpringBootTest003.java
  3，SpringBoot推荐使用注解的方式，替代第2条的引入配置文件的传统方式，见CustomerConfig.java
    使用@Configuration标注在一个类上，这个类相当于customer-config.xml的Spring框架配置文件
    然后把@Bean标注在一个方法上，方法返回值就是一个实体类<bean>，其id默认是方法名。

* */


//SpringBoot项目主应用程序
@ImportResource(locations={"classpath:customer-config.xml"})
@SpringBootApplication
public class SpringBootApplication003 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication003.class,args);
        System.out.println("springboot003启动成功！");
    }
}
