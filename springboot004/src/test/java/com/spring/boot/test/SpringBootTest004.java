package com.spring.boot.test;

import com.spring.boot.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTest004 {

    @Autowired
    Student student;

    @Test
    public void test004(){
        System.out.println("student==>" + student);
    }
}
