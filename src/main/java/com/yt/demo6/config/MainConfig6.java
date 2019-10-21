package com.yt.demo6.config;

import com.yt.demo1.Person;
import com.yt.demo6.bean.Cat;
import com.yt.demo6.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @import
 */
@Configuration
@Import(value = {Dog.class, Cat.class, MyImportSelector.class, MyImportBeanDefinitionRegitar.class})
public class MainConfig6 {

    /**
     * 给容器注册组件的方式
     *  1.@Bean
     *  2.包扫描 + 组件的标注注解（@ComponentScen: @Controller @Service @Resonsitory @Componet）
     *  3.@import: 快速给容器导入一个组件；
     *    a. @import()bean的id是全类名：com.yt.demo6.bean.Dog
     *    b.ImportSelector ：是一个接口，返回需要导入到容器的组件的全类目数组
     *    c.ImportBeanDefinitionRegistrar spring提供注入bean;可以手动添加组件到IOC，实现此接口即可
     *  4.使用spring提供的FactoryBean（工厂bean）进行注册  getObject
     * @return
     */
    @Bean("person")
    public Person person0001(){
        System.out.println("给容器添加person");
        return new Person("yt", 28);
    }

    @Bean
    public MyFactoryBean myFactoryBean(){
        return new MyFactoryBean();
    }
}

