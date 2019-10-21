package com.yt.demo6;

import com.yt.demo6.config.MainConfig6;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo6Test {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig6.class);
        Object myFactoryBean = anno.getBean("myFactoryBean");

        // "&"关键字  有获取到的是本身的类型  没有则获取到的是getObject方法返回的类型
        Object myFactoryBean2 = anno.getBean("&myFactoryBean");
        System.out.println("bean的类型" + myFactoryBean.getClass());
        System.out.println("bean的类型" + myFactoryBean2.getClass());
        System.out.println("IOC容器创建完成=====");
        //anno.getBean("APerson");
        String[] beanDefinitionNames = anno.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            //打印出：com.yt.demo6.bean.Dog
            System.out.println(beanDefinitionName);
        }
    }

}
