package com.springboot.config.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value={"classpath:student.properties"})
@Component("stu01")    //必须加@Component注解，表示是容器中的类，才可以接受配置文件中的赋值
@ConfigurationProperties(prefix="student")     //注意这里要写上(prefix="student")否则不知道找配置文件的哪个对象
public class Student {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
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
}
