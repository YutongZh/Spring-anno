package com.yt.demo1.config;

import com.yt.demo1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置类 相当于配置文件
@Configuration
public class MainConfig {

    //给容器注册一个bean 类型为返回值的类型
    @Bean("APerson")
    public Person person0001(){
        return new Person("yt", 28);
    }
}
