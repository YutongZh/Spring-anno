package com.yt.demo8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bird {

    //使用@Value 进行赋值 ：1.基本字符 2.Spring El表达式 3.可以读取配置文件
    @Value("zyt")
    private String name;
    @Value("#{20-2}")
    private String age;
    @Value("${bird.color}")
    private String color;

    public Bird(String name, String age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Bird() {
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
