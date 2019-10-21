package com.yt.demo9.config;

import com.yt.demo9.dao.TestDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan({"com.yt.demo9.controller","com.yt.demo9.service",
        "com.yt.demo9.dao","com.yt.demo9.bean"})
public class MainConfig9 {

    @Primary //作为首选 指定优先级 代表所有依赖注入testDao都使用这个
    @Bean("testDao")
    public TestDao testDao(){
        TestDao testDao = new TestDao();
        testDao.setFlag("2");
        return testDao;
    }
}
