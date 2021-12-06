package com.springboot.mvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@EnableWebMvc    //不能用@EnableWebMvc,后者是个人全面接管，即完全手动配置SpringMVC时用的
@Configuration     //自定义配置要加此注解,
public class CustomizedMvcConfig  extends WebMvcConfigurerAdapter {

    /**
     *1，重写抽象类中的assViewControllers(..)方法，即可向springmvc.xml配置文件中一样，进行配置路径映射；
     *2，访问：http://localhost:8082/web/done路径即可显示done.html页面，无需在controller层进行转发了；
     *3，这个配置类起作用的原因，参照个人笔记“七，SpringMvc自动配置”的第3条源码分析
     */

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        ViewControllerRegistration viewControllerRegistration = registry.addViewController("/done");
        viewControllerRegistration.setViewName("done_page");   //这里是经过视图解析器添加了后缀的，静态页面是done.html
    }
}
