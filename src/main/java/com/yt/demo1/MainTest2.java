package com.yt.demo1;

import com.yt.demo1.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ano = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person)ano.getBean("APerson");
        System.out.println(person);

        //beanId 默认取的方法名称 首字母默认小写 如果@bean("abc") 则取abc
        String[] beanNamesForType = ano.getBeanNamesForType(Person.class);
        for (String bean : beanNamesForType) {
            System.out.println(bean);
        }
    }
}
