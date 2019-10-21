package com.yt.demo3.config;

import com.yt.demo1.Person;
import org.springframework.context.annotation.*;

//配置类 相当于配置文件
@Configuration
public class MainConfig3 {

    //prototype 多实例 ：IOC 容器启动的时候  并不会启动去掉用方法创建，每次getBean的时候创建对象
    //singleton：单实例（默认）：IOC容器启动时会创建对象缓存，每次直接从map中get一个对象出来
    //request:主要针对web应用，递交一次请求创建一个实例
    //session：同一个session创建一个实例
    @Scope("prototype")
    //给容器注册一个bean 类型为返回值的类型 定义值则beanId为此内容
    @Bean("APerson")
    public Person person0001(){
        return new Person("yt", 28);
    }
}
