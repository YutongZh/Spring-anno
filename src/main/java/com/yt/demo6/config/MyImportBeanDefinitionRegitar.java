package com.yt.demo6.config;

import com.yt.demo6.bean.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegitar implements ImportBeanDefinitionRegistrar {

    /**
     *
     * @param importingClassMetadata  当前类的注解信息
     * @param registry ：beanDefinition注册类
     *                 把所有需要添加到容器的bean加入；
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        boolean bean1 = registry.containsBeanDefinition("com.yt.demo6.bean.Cat");
        boolean bean2 = registry.containsBeanDefinition("com.yt.demo6.bean.Dog");
        //如果Dog和Cat同时存在Ioc容器中，那么创建Pig类，加入到容器
        //对于要注册的bean，给bean进行封装
        if (bean1 && bean2){
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Pig.class);
            //源码：将bean注册到ioc
            registry.registerBeanDefinition("pig", beanDefinition);
        }
    }
}
