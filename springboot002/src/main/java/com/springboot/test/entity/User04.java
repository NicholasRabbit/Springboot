package com.springboot.test.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

@Component
@Validated
public  class User04{

        private String name;

       //虽然这里加了@Validated和@Email验证，配置文件里user04.email04=abc不符合要求，测试类里打印abc,也不报错，说明@Value不支持验证
        @Email
        @Value("${user04.email}")
        private String email04;

        @Override
        public String toString() {
            return "User04{" +
                    "name='" + name + '\'' +
                    ", email04='" + email04 + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail04() {
            return email04;
        }

        public void setEmail04(String email04) {
            this.email04 = email04;
        }
    }


