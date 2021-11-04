package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**指定加载配置文件范例
 * 1,SpringBoot默认加载application.properties或application.yml
 * 2,实际开发中，开发时一套配置，正式上线后一套配置，因此使用不用的配置文件则比较省事许多
 * 3,一般用application-{profile}.properties命名的方式。例： application-dev.properties, application-prod.properties的方式命名
 *   {profile}名字可自定义。
 * 4,本例使用*.properties文件，*.yml文件也一样；
 *   yml文件支持同一个配置文件内分割为不同的配置文件，使用分隔符三横线“---”，见application.yml
 *   激活不同配置文件方式：参照application.properties中的备注理解；
 * */

@SpringBootApplication
public class SpringBootApplication004 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication004.class, args);
        System.out.println("SpringBootApplication004  deployed successfully.");
    }
}
