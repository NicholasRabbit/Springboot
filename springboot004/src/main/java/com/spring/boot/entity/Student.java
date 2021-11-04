package com.spring.boot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component     //要加@Component注解，表示是一个Spring组件，否则下面的@ConfiturationProperties无法用
@ConfigurationProperties(prefix="stu01")     //注意这里要写上(prefix="student")否则不知道找配置文件的哪个对象
public class Student {
    private int id;
    private String name;
    private Cat cat;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
