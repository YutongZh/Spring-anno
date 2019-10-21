package com.yt.demo7.bean;

import org.springframework.context.annotation.Configuration;

public class Bike {
    public Bike() {
        System.out.println("Bike constructor -------");
    }

    public void init(){
        System.out.println("Bike----init-----");
    }

    public void destory(){
        System.out.println("Bike----destory----");
    }
}
