package com.spring.boot.log.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTest008 {

    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     *1,SpringBoot的日志输出有5个级别
     *  从低到高依次是：trace < debug < info < warn < error
     *2,SpringBoot默认输出info及其以上高级别的，如更改可在application.properties等配置文件里设置
     *3,也可指定输出日志到文件，详见配置文件
     * */

    @Test
    public void testLog(){
        logger.trace("trace 级别日志输出……");
        logger.debug("debug 级别日志输出……");
        logger.info("info 级别日志输出……");
        logger.warn("warn 级别日志输出……");
        logger.error("error 级别日志输出……");
    }
}
