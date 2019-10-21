package com.yt.demo2.config;

import com.yt.demo1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;


/**
 * @ComponentScan
 */
//配置类 相当于配置文件
@Configuration
////扫描器
//@ComponentScan(value = "com.yt.demo2", includeFilters = {  //只包含Controller注解
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
//}, useDefaultFilters = false)//过滤方式为注解 默认置为false 才能生效 如果为true
// 源码中如果useDefaultFilters = true 则添加@component 由于@controller  @service 相当于是@component子类，
// 所以想要加载指定的类注解，要设置为false

@ComponentScan(value = "com.yt.demo2", includeFilters = { //自定义过滤
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {YtTypeFilter.class})
}, useDefaultFilters = false)
public class MainConfig2 {

    //给容器注册一个bean 类型为返回值的类型 定义值则beanId为此内容
    @Bean("APerson")
    public Person person0001(){
        return new Person("yt", 28);
    }
}
