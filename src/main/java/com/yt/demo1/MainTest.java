package com.yt.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person)con.getBean("aPerson");
        System.out.println(person);
    }
}
