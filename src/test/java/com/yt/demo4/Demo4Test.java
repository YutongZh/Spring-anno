package com.yt.demo4;

import com.yt.demo4.config.MainConfig4;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo4Test {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig4.class);
        System.out.println("IOC容器创建完成=====");
        anno.getBean("APerson");
    }
}
