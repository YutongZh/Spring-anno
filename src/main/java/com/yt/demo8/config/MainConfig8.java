package com.yt.demo8.config;

import com.yt.demo8.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:/test.properties")
public class MainConfig8 {

    @Bean
    public Bird bird(){
        return new Bird();
    }

}
