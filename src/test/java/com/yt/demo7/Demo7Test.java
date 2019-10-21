package com.yt.demo7;

import com.yt.demo7.config.MainConfig7;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo7Test {
    @Test
    public void test01() {
        //1.构造方法 2.init 3.ioc容器创建完成 4.destory
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig7.class);
        System.out.println("IOC容器创建完成");

        //anno.getBean("bike");
        //将实例从map清空 map.clear
        anno.close();
    }
}
