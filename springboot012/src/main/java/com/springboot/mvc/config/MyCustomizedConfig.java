package com.springboot.mvc.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**@EnableWebMvc 注解的使用标志全面接管，完全纯手工配置SpringMVC
 * 1,使用@EnableWebMvc后视图解析器还是会起作用，原因待研究
 * 2,加入此注解表示全面手动配置SpringMVC，禁用了SpringBoot自动配置SpringMVC的功能，该注解如何起作用见个人笔记源码解析
 * 3,使用此注解后boot默认的欢迎index.html页面无法访问了
 */
@EnableWebMvc
@Configuration
public class MyCustomizedConfig extends WebMvcConfigurerAdapter {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //设置访问项目根路径/mvc/login就直接到login.html, 注意login.html必须在/resources/templates文件夹里, 由Thymeleaf模板引擎渲染
        ViewControllerRegistration view = registry.addViewController("/login");  //这里是url路径，把这个路径对应到了login.html页面
        view.setViewName("login");  //这里省略了后缀".html"
    }

    /**
     * 1,因为使用了EnableWebMvc，所以这里手动设置欢迎页面，即访问项目根路径localhost/mvc/直接到此页面
     * 2,需要加@Bean注解，才可被扫描进SpringBoot的IOC容器里，被其使用
     */
    @Bean
    public WebMvcConfigurerAdapter  indexPage(){
        WebMvcConfigurerAdapter  adapter = new WebMvcConfigurerAdapter() {      //因为WebMvcConfigurerAdapter是一个抽象类，所以这里用匿名内部类的方式new一个对象
            public void addViewControllers(ViewControllerRegistry registry) {
                ViewControllerRegistration indexView = registry.addViewController("/");
                indexView.setViewName("index");   //这里指index.html页面，它需在/resources/templates里才可被Thymeleaf模板引擎解析
            }
        };

        return adapter;
    }

}
