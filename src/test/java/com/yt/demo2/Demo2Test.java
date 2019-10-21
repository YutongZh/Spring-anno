package com.yt.demo2;

import com.yt.demo2.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo2Test {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanDefinitionNames = anno.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
