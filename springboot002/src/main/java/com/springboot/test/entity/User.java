package com.springboot.test.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/*1，"user"表示使用application.yml里的user:...的赋值注入
  2，@ConfigurationProperties支持配置文件的松散语法绑定，即配置文件的first_name/first-name 自动匹配==> firstName(java对象属性)
 */

@Component
@ConfigurationProperties("user")
public class User {
    private String name;
    private int age;
    private boolean gender;
    private List<String> stringList;
    private Date birthday;
    private Map<String,Object> map;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", stringList=" + stringList +
                ", birthday=" + birthday +
                ", map=" + map +
                ", cat=" + cat +
                '}';
    }
}
