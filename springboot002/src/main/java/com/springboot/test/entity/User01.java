package com.springboot.test.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/*1，"user"表示使用application.yml里的user:...的赋值注入
  2，@ConfigurationProperties支持配置文件的松散语法绑定，即配置文件的first_name/first-name 自动匹配==> firstName(java对象属性)
     这个注解属于全局赋值，即把配置文件中的"user"的值全取出来为属性赋值
  3，在单个属性名上可用@Value赋值，参照User02.java
 */

/*@ConfigurationProperties和@Value的用法区别
                         @ConfigurationProperties         @Value
  用法区别                  批量注入赋值配置文件的值           单个赋值
  松散绑定(松散语法)         支持                             不支持     *松散语法是指把配置文件中的下划线对应java对象属性的驼峰方式，即last_name/last-name 对应 String lastName
  SpEl(Spring运算表达式)    不支持                            支持       *SpEL指在#{2*6}进行运算的功能
  JSR303数据校验            支持                             不支持      *数据校验指和@Validated,@Email连用，验证属性值是否符合例如@Email格式的规则，详见User03.java
  复杂类型封装               支持                             支持
*/

@Component
@ConfigurationProperties("user01")
public class User01 {
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
        return "User01{" +
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
