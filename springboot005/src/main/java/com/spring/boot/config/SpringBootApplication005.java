package com.spring.boot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 注意：同一目录下的application.yml和application.properties，SpringBoot优先加载application.properties
 *
 * (一)，一个项目(内部中)不同位置的配置文件的加载优先级范例: (下节研究项目外部配置的加载顺序)
 * SpringBoot项目启动后会从以下位置扫描application.yml/properties文件，加载优先顺序：从上到下
 *1, ./config/application.properties : 项目根路径下的config目录中的配置文件;  (Maven构建项目环境下，这里不起作用，原因可能是不符合Maven的约定目录)
 *2, ./application.properties : 项目根路径下的配置文件                       (这里也不管用，原因同上)
 *3, classpath:/config/application.properties : 类路径下的config目录中的配置文件;  (实际就是Maven构建目录resources/config目录，因为编译后这里的要放到/classes/config里)
 *4, classpath : /application.properties : 类路径根目录下的配置文件；              (而这里是resources根目录)
 * SpringBoot会从这四个位置全部加载配置文件
 * 如果各位置的配置文件配置不同的参数，则形成互补，如果不同使用优先级高的配置文件中的设置参数
 *
 * (二)，本例中/resources/config/application.yml优先级高，确定了服务器端口为8082，覆盖了/resources/application.yml中的端口配置
 * 而/resources/application.yml中有user赋值注入，形成了互补
 * */

@SpringBootApplication
public class SpringBootApplication005 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication005.class, args);
        System.out.println("005 deployed successfully!");
    }
}
