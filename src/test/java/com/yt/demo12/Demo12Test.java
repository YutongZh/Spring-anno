package com.yt.demo12;

import com.yt.demo12.bean.Dog;
import com.yt.demo12.config.MainConfig12;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo12Test {

    /**
     * BeanFactoryPostProcessor。。。。
     * 9个bean
     * [org.springframework.context.annotation.internalConfigurationAnnotationProcessor, org.springframework.context.annotation.internalAutowiredAnnotationProcessor, org.springframework.context.annotation.internalRequiredAnnotationProcessor, org.springframework.context.annotation.internalCommonAnnotationProcessor, org.springframework.context.event.internalEventListenerProcessor, org.springframework.context.event.internalEventListenerFactory, mainConfig12, myBeanFactoryPostProcessor, getDog]
     * Dog constructor
     *
     * 在bean构建之前就有了BeanFactoryPostProcessor
     */
    @Test
    public void test01(){
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig12.class);
        anno.getBean(Dog.class);
    }
}
