package com.yt.demo8;

import com.yt.demo8.config.MainConfig8;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Demo8Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig8.class);
        String[] beanDefinitionNames = anno.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        Bird bird = (Bird) anno.getBean("bird");

        ConfigurableEnvironment environment = anno.getEnvironment();
        String color = environment.getProperty("bird.color");
        System.out.println("color" + color);

        System.out.println(bird);
        System.out.println("IOC容器创建完成");

    }
}
