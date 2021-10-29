package com.springboot.test.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

/*JSR303数据校验范例，要用@Validated
@ConfigurationProperties注解支持
@Value不支持,（在User04.java里）
* */

@Component
@Validated
@ConfigurationProperties("user03")
public class User03 {

    @Email
    private String email01;     //email01的配置文件里的赋值是正确的格式
    //@Email
    private String email02;     //由于application.yml里user03: email03=abcdefg,在测试类里打印user03会报错：Property: user03.email02 不是一个合法的电子邮件地址
    private String name;
    private int age;
    private boolean gender;

    public String getEmail01() {
        return email01;
    }

    public void setEmail01(String email01) {
        this.email01 = email01;
    }

    public String getEmail02() {
        return email02;
    }

    public void setEmail02(String email02) {
        this.email02 = email02;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User03{" +
                "email01='" + email01 + '\'' +
                ", email02='" + email02 + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

