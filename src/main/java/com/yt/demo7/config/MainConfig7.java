package com.yt.demo7.config;

import com.yt.demo7.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * bean的声明周期   创建---》初始化---》销毁
 * 1.xml: init-method  destory-method  或者  注解@bean（init-method）
 * 2.实现InitializingBean  DisposableBean
 * 3.JSR250规范  JDK内部提供的注解 @PostConstruct  @PreDestroy
 *
 * 单实例 可以正常调用和初始化和销毁方法
 * 多实例  容器只负责初始化，但不会管理bean，（多实例getBean才会初始化） 多实例不会缓存 所以destory调用的时map.clear
 * 所以也不会调用destory方法
 *
 * 对于具有prototype作用域的Bean，有一点很重要，即Spring不能对该Bean的整个生命周期负责。自身不会调用close方法。
 * 具有prototype作用域的Bean创建后交由调用者负责销毁对象回收资源。
 *
 * BeanPostProcessor对bean生命周期的控制：
 *
 * 真正创建实例invokeInitMethods() 前后的处理器 将@Bean（initMethod="init"）init方法调用前后进行增强
 * Bike constructor ------- 先调用构造方法 后面对init方法进行增强
 * postProcessBeforeInitialization====com.yt.demo7.bean.Bike@45018215===bike
 * Bike----init-----
 * postProcessAfterInitialization====com.yt.demo7.bean.Bike@45018215===bike
 */
@Configuration
@ComponentScan("com.yt.demo7.bean")
public class MainConfig7 {
    @Bean(initMethod = "init", destroyMethod = "destory")
    public Bike bike(){
        return new Bike();
    }
}
