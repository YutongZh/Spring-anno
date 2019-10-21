package com.yt.demo5.config;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WinCondition implements Condition{

    /**
     *
     * @param context 判断条件可以使用的上下文 （环境）
     * @param metadata 注解的信息
     * @return
     *
     * FactoryBean 与 BeanFactory 区别？
     * 1.可以把我们的java实例bean通过factoryBean注入到容器中
     * 2.beanFactory：从我们容器中获取实例化bean
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //是否为window操作系统
        //能获取到ioc容器正在使用的beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //获取当前环境变量
        Environment environment = context.getEnvironment();
        String os_name = environment.getProperty("os.name");
        System.out.println(os_name);
        if (os_name.contains("Windows")){
            return true;
        }
        return false;
    }
}
