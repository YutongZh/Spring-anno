package com.yt.demo3;

import com.yt.demo2.config.MainConfig2;
import com.yt.demo3.config.MainConfig3;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo3Test {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig3.class);
        String[] beanDefinitionNames = anno.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        //从容器中分别取两次person实例，看是否同一个bean
        Object bean1 = anno.getBean("APerson");
        Object bean2 = anno.getBean("APerson");
        System.out.println(bean1 == bean2);


    }
}
