package com.yt.demo9;

import com.yt.demo7.config.MainConfig7;
import com.yt.demo9.bean.Moon;
import com.yt.demo9.bean.Sun;
import com.yt.demo9.config.MainConfig9;
import com.yt.demo9.dao.TestDao;
import com.yt.demo9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo9Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig9.class);
        //直接从容器中取TestDao，和注入对比
//        TestService testService = anno.getBean(TestService.class);
//        testService.println();

//        TestDao testDao = anno.getBean(TestDao.class);
//        System.out.println(testDao);

//        Moon moon = anno.getBean(Moon.class);
//        System.out.println(moon);
//
//        Sun sun = anno.getBean(Sun.class);
//        System.out.println(sun);
    }
}
