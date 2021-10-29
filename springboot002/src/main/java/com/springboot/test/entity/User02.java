package com.springboot.test.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/*
 不使用@ConfigurationProperties赋值，使用@Value给属性单个赋值
 @Value的用法
 1，@Value相当于最开始spring.xml里<bean>中的value的作用一样
    <bean id="name"  value="Tom">
 2，此注解可给单个属性赋值
 3，${user02.name} : 表示引用配置文件中的值
    #{26} ： 表示直接赋值
    用法与MyBatis相反，注意区分
 */
//user02在application.properties里配置注入
//@ConfigurationProperties("user")
@Component
public class User02 {

    @Value("${user02.name}")
    private String name;
    @Value("26")       //这里直接写值也可以
    private int age;
    @Value("#{3*9}")   //@Value支持SpEL，即数据运算表达式，@ConfigurationProperties不支持
    private int count;
    @Value("${user02.gender}")
    private boolean gender;
    @Value("${user02.stringList}")
    private List<String> stringList;
    //@Value("${user02.birthday}")      //application.properties里“user02.birthday=2021/10/10”写法不对，后期待研究
    private Date birthday;
    //@Value("")                        //Map属性赋值写法待定
    private Map<String,Object> map;
    //@Value("${user02.cat}")
    private Cat cat;

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

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "User02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", count=" + count +
                ", gender=" + gender +
                ", stringList=" + stringList +
                ", birthday=" + birthday +
                ", map=" + map +
                ", cat=" + cat +
                '}';
    }
}
