package com.yt.demo7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 自定义后置处理器
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    /**
     * 在初始化方法调用之前进行后置处理工作 返回的是一个对象
     * init-method=init之前进行调用
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization====" + bean + "===" + beanName );
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization====" + bean + "===" + beanName );
        return bean;
    }
}
