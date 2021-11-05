package com.springboot.config.test;

import com.springboot.config.entity.Customer;
import com.springboot.config.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTest003 {

    @Autowired
    @Qualifier("stu01")
    Student student;

    //代表当前IOC容器对象，用来测试其是否含有主程序类上的SpringBootApplication003注解@ImportResource引入的Spring配置文件
    @Autowired
    ApplicationContext app;

    @Test
    public void configTest(){
        System.out.println("student==>" + student);
    }

    @Test
    public void studentTest(){
        /*1,@ImportResource方式引入框架配置文件
          这里获取自定义的Spring框架的配置文件的<bean>,跟以前Spring框架获取实体对象的方法一样
          只是需要在主启动应用程序里加注解@ImportResource */
        boolean isContained = app.containsBean("customer");    //看IOC容器里是否包含customer的<bean>
        Customer customer = app.getBean("customer", Customer.class);
        System.out.println("isContained ==> " + isContained +"\n"+ customer);

        /*2,@Configuration和@Bean方式替代上面的传统方式，SpringBoot的建议做法
            见CustomerConfig.java里的用法 */
        Customer customer02 = app.getBean("customer02", Customer.class);   //bean的id是方法名
        System.out.println("customer02 ==> " + customer02);
    }
}
