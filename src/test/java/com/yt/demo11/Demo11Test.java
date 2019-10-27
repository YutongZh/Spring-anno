package com.yt.demo11;

import com.yt.demo11.service.OrderService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo11Test {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfig11.class);
        OrderService bean = anno.getBean(OrderService.class);
        bean.addOrder();
    }
}
