package com.spring.boot.config;

import com.spring.boot.config.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 配置文件的优先级，包括内外部
 * 注意：同一目录下的application.yml和application.properties，SpringBoot优先加载application.properties
 * (一)，dos窗口命令行，加载配置文件命令的区别
 * 1，--spring.config.name=myApplication :
 *   适用于项目内部加载默认目录下自定义名字的配置文件，不适用于外部配置文件，会报错，详见springboot006
 * 2，--spring.config.location=D:\project\config\  :
 *                         =D:\project\config\myApplication.properties :  目录最后是配置文件的话则不用加斜线“\”
 *   适用于项目外部，即jar包外部的配置文件,注意如果路径最后是目录需加斜线“\”，也适用于内部的配置文件
 * 3，在01_test_config执行java -jar springboot005-1.0-SNAPSHOT.jar,
 *    如果此命令后面不加--spring.config.....则按下面(二)的默认优先级顺序来配置相关项
 *    如果加则按找命令行最后一项的目录的配置文件为最优先的，不按下面的1，2，3，4来了，因为自定义了
 *    例：java -jar springboot005-1.0-SNAPSHOT.jar  --spring.config.location=~/01_test_config/config/application.properties, ~/01_test_config/application.properties
 *       同时自定义了两个配置文件，则按照最后写的那个来，虽然默认最后那个没有前面的优先级高，但是这里自定义写在最后了，所以最后这个优先级高
 *       ("~"代表绝对路径，这里省略)
 * 4，如果使用的外部配置文件中使用了profile.active指定了application-dev.yml文件，则被指定的application-dev.yml文件文件也要放在外部，在项目内部指定不到，会报错。
 * 5，在idea中设置加载项目外部配置文件：Run-->Edit Configuration-->Configuration:Environment，参照springboot006
 *
 *
 * (二)，一个项目不同位置的配置文件的优先级范例:
 *       注意：加载顺序与优先级相反，最后加载优先级最高，因为最后加载可把之前相同项的配置覆盖
 *       SpringBoot项目启动后会从以下位置扫描application.yml/properties文件，优先顺序：从上到下
 *
 *      其中第1和2是Maven框架下的项目外部配置，它们放到打包好的jar包外，要起作用需要命令行配置，参照第1条写法
 *      例：./config/application.properties 和./springboot005.jar-1.1-snapshot在同一目录下
 *
 *1, ./config/application.properties : springboot005根路径下的config目录中的配置文件，即config目录和项目打成的jar包在同一目录;
 *    注意：Maven构建项目环境下，这里不起作用，原因可能是不符合Maven的约定目录,
 *    需要项目打包好后在DOS窗口执行java -jar  springboot005-jar  会默认加载，不用加--spring.config.location也可，优先级第1
 *2, ./application.properties : springboot005根路径下的配置文件
 *    (这里也不管用，原因同上，需要同第1条一样执行命令加载)
 *
 *3, classpath:/config/application.properties : 类路径下的config目录中的配置文件;  (实际就是Maven构建目录resources/config目录，因为编译后这里的要放到/classes/config里)
 *4, classpath : /application.properties : 类路径根目录下的配置文件；              (而这里是resources根目录,项目编译时，会放在target/classes)
 * SpringBoot会从这四个位置全部加载配置文件
 * 如果各位置的配置文件配置不同的参数，则形成互补，如果不同使用优先级高的配置文件中的设置参数
 *
 * 注：以上4条中，如果这四个默认名字的配置文件中有语句指定激活:spring.profiles.active=devlop，
 * 那么指定激活的配置文件application-devlop.properties的优先级高于这四个文件。条件是必须有激活语句才可。
 *
 *
 * (二)，本例的Maven项目的内部中/resources/config/application.yml优先级高，确定了服务器端口为8082，覆盖了/resources/application.yml中的端口配置
 * 而/resources/application.yml中有user赋值注入，形成了互补
 * */

@SpringBootApplication
public class SpringBootApplication005  implements CommandLineRunner {


    @Value("${fileName}")
    String fileName;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication005.class, args);
        System.out.println("005 deployed successfully!");
    }

    //这里实现CommandLineRunner.interface是为执行run方法，测试加载顺序，该方法在main方法前执行
    @Override
    public void run(String... args) throws Exception {
        System.out.println("fileName==>" + fileName);
    }
}
