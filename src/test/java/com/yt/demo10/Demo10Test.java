package com.yt.demo10;

import com.yt.demo10.aop.Calculator;
import com.yt.demo10.config.MainConfig10;
import com.yt.demo9.config.MainConfig9;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo10Test {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig10.class);
        Calculator bean = anno.getBean(Calculator.class);
        int div = bean.div(10, 2);
        System.out.println(div);
    }
}
