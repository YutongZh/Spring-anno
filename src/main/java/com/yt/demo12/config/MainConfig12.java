package com.yt.demo12.config;

import com.yt.demo12.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.yt.demo12.processor")
public class MainConfig12 {
    @Bean
    public Dog getDog(){
        return new Dog();
    }
}
