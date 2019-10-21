package com.yt.demo7.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Car {
    public Car() {
        System.out.println("car ==== constructor -----");
    }
    @PostConstruct
    public void init(){
        System.out.println("car ===== @PostConstruct=====");
    }

    @PreDestroy
    public void destory(){
        System.out.println("car ===== PreDestroy ======");
    }
}
