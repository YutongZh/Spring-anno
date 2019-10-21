package com.yt.demo4.config;

import com.yt.demo1.Person;
import com.yt.demo5.config.LinuxCondition;
import com.yt.demo5.config.WinCondition;
import org.springframework.context.annotation.*;

/**
 * @Conditional
 */
//配置类 相当于配置文件
@Configuration
public class MainConfig5 {

    //懒加载（默认true）：主要针对单实例bean，默认在容器启动的时候创建对象,如果懒加载，容器启动不创建对象，那就getBean使用的时候去获取。
    @Bean("person")
    public Person person0001(){
        System.out.println("给容器添加person");
        return new Person("yt", 28);
    }

    @Conditional(WinCondition.class) //条件选择 ：win环境下才写到环境
    @Bean("abc")
    public Person abc(){
        System.out.println("给容器添加abc");
        return new Person("yt", 28);
    }

    @Conditional(LinuxCondition.class)
    @Bean("arrow")
    public Person arrow(){
        System.out.println("给容器添加arrow");
        return new Person("yt", 28);
    }


}
