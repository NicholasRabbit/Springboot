package com.spring.boot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot静态资源位置
 *
 * 1，以webjars的形式，引入jquery的静态资源，不用像Spring的web项目一样在WEB-INF包下导入jquery库了，详见pom.xml
 *   可直接输入http://localhost:8081/webjars/jquery/3.3.0/jquery.js 进行访问
 *
 * 2，SpringBoot放置静态资源的默认位置
 *
 *    classpath: /META-INF/resources/
 *    classpath: /resources/  (注意，这个resources文件夹时Maven原有的resources(其实是classpath)目录下的又一个)
 *    classpath: /static/
 *    classpath: /public/
 *     /  :当前项目根路径
 *
 *    (1)浏览器发来的任何请求“/**”都去上面的路径去找静态的资源，注意如果自定义静态资源位置，这里的默认的就不管用了，详见配置文件
 *    (2)访问这些静态资源文件不需要在路径里加上级目录名,但是在这个默认目录下再加目录则访问url里需要加这些目录。
 *       例，访问mypage/there.html 是：localhost:8081/web_project009/there.html
 *           访问mypage/view/done.html  是 ：localhost:8081/web_project009/view/done.html
 *
 * 3，也可自定义静态资源位置，在application.properties配置文件中设置
 *    spring.resources.static-locations=classpath:/html/,classpath:/mypage/
 *
 * 4，SpringBoot的web项目可自定义浏览器标签的图标，名称必须是favicon.ico
 *    放到静态资源目录下任意位置即可，默认是使用自定义图标的.  本例不能用，原因待分析！！
 *    spring.mvc.favicon.enabled=true (application.properties配置文件里设置，默认为true,不写这句也是true)
 *
 *
 * */


@SpringBootApplication
public class SpringBootApplication009 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication009.class, args);
        System.out.println("009 deployed successfully!");
    }
}
