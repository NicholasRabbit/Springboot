package com.springboot.config.myconfig;

import com.springboot.config.entity.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration    //注解加在这里后，这个类就相当于一个Spring框架的配置文件customer-config.xml
public class CustomerConfig {

    /*用方法的方式返回bean对象
      加@Bean注解，返回值就是实体对象,bean的id默认是方法名
    * */
    @Bean
    public Customer customer02(){
        Customer customer02 = new Customer();
        customer02.setId(1003);
        customer02.setName("Devil");    //可在这里赋值
        return customer02;
    }
}
