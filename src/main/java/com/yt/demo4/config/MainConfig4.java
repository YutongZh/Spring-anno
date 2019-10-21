package com.yt.demo4.config;

import com.yt.demo1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

/**
 * @Lazy
 */
public class MainConfig4 {
    //懒加载（默认true）：主要针对单实例bean，默认在容器启动的时候创建对象,如果懒加载，容器启动不创建对象，那就getBean使用的时候去获取。
    @Lazy
    @Bean("APerson")
    public Person person0001(){
        System.out.println("给容器添加person");
        return new Person("yt", 28);
    }
}
