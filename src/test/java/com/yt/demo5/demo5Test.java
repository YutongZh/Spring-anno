package com.yt.demo5;

import com.yt.demo4.config.MainConfig5;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class demo5Test {


    //运行用例的时候，操作系统是windows， 就让person这个对象实例化到容器，linux就让 abc对象实例化到容器中
    @Test
    public void test01(){
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig5.class);
        System.out.println("IOC容器创建完成=====");
        //anno.getBean("APerson");
    }
}
