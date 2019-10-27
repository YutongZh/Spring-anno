package com.yt.demo12.processor;

import com.yt.demo12.bean.Dog;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.stereotype.Component;

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    //先执行
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("调用postProcessBeanDefinitionRegistry了，Bean数量" + registry.getBeanDefinitionCount());
        //RootBeanDefinition root = new RootBeanDefinition(Dog.class);
        AbstractBeanDefinition root = BeanDefinitionBuilder.rootBeanDefinition(Dog.class).getBeanDefinition();
        registry.registerBeanDefinition("hello", root);
    }


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("调用postProcessBeanFactory了，Bean数量" + beanFactory.getBeanDefinitionCount());
    }
}
