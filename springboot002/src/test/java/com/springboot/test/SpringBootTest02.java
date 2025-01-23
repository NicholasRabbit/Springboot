package com.springboot.test;


import com.springboot.test.entity.User01;
import com.springboot.test.entity.User02;
import com.springboot.test.entity.User03;
import com.springboot.test.entity.User04;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//这两个注解要引入相关依赖<spring-boot-starter-test>
/*
* 测试模块的启动类的包路径要和主应用的包相同路径
* 即com.springboot.test.SpringBootTest02 = com.springboot.test.SpringBootApplication02
* */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTest02 {

    @Autowired
    User01 user01;

    @Autowired
    User02 user02;

    @Autowired

    User03 user03;

    @Autowired
    User04 user04;

    //@ConfigurationProperties,@Value
    @Test
    public void testProperties(){
        
        System.out.println("user01==>" + user01 + "\n" + "user02==>" + user02);
    }

    //@Validate,@Email
    @Test
    public void testValidate(){
        System.out.println("user03==>" + user03 + "\n" + "user04==>" + user04);
    }
}
