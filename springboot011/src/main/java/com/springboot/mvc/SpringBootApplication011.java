package com.springboot.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *一，添加自定义的视图解析器
 * 1, SpringBoot对SpringMVC进行了自动配置，包括DispatcherServlet.java以及InternalResourcesViewResolver
 * 2, 相关的自动配置见WebMvcAutoConfiguration.java，及其内部的 public ContentNegotiatingViewResolver viewResolver(..)方法,
 *    还有有ContentNegotiatingViewResolver。java中的getCandidateView()方法，此方法是对所有的视图解析器进行遍历，包括下面个人自定义的；
 * 3, 自定义视图解析器如本例MyViewResolver.java，注意实现接口ViewResolver.java才可被SpringBoot认为是一个视图解析器并加进来；
 *    然后在MyViewConfiguration里进行配置；
 *    在DispatchServlet的doGetDispatch(...)方法打断点，查看this-->中的viewResolvers属性，即可看到其中有MyViewResolver
 *
 *二，自定义视图映射
 * 1, 有时候SpringBoot自动配置不能满足需求，因此可在使用SpringBoot自动配置SpringMVC相关功能的基础上，自定义一些功能；
 * 2, 例如自定义视图映射，把请求路径映射到一个静态页面, 见个人自定义的CustomizedMvcConfig.java, 这个类在SpringBoot启动时会和其它自动配置类
 *    一起被扫描进IOC容器里，可在WebMvcConfigurerComposite.java的addViewControllers(..)方法出打断点观察的到。
 * */

@SpringBootApplication
public class SpringBootApplication011 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication011.class, args);
        System.out.println("011 deployed successfully!");
    }

}
