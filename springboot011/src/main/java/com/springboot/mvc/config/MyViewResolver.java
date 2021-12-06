package com.springboot.mvc.config;


import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

//个人自定义的视图解析器，不用加@Componet注解
public class MyViewResolver implements ViewResolver {
    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {

        return null;
    }
}
