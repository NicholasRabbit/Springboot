package com.springboot.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1, SpringBoot对SpringMVC进行了自动配置，包括DispatcherServlet.java以及InternalResourcesViewResolver
 * 2, 相关的自动配置见WebMvcAutoConfiguration.java，及其内部的 public ContentNegotiatingViewResolver viewResolver(..)方法,
 *    还有有ContentNegotiatingViewResolver。java中的getCandidateView()方法，此方法是对所有的视图解析器进行遍历，包括下面个人自定义的；
 * 3, 自定义视图解析器如本例MyViewResolver.java，注意实现接口ViewResolver.java才可被SpringBoot认为是一个视图解析器并加进来；
 *    然后在MyViewConfiguration里进行配置；
 *    在DispatchServlet的doGetDispatch(...)方法打断点，查看this-->中的viewResolvers属性，即可看到其中有MyViewResolver
 *
 * */

@SpringBootApplication
public class SpringBootApplication011 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication011.class, args);
        System.out.println("011 deployed successfully!");
    }

}
