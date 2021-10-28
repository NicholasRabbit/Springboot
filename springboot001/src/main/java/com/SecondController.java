package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/*注意：这个controller访问不到
   根据底层源码可知@AutoConfigurationPackage.java里，SpringBoot会扫描@SpringBootApplication注解的主程序所在的包路径
   即com.springboot下的所有包会被扫描，因此FirstController会扫到
   如果有个程序如SecondController在com.SecondController路径下。则它不会被扫描，有请求也访问不到
   结合笔记截图
* */

@Controller
public class SecondController {

    @ResponseBody
    @RequestMapping(value="/second")
    public String test(){
        System.out.println("second execute!===>");
        return "done";
    }
}
