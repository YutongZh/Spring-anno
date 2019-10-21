package com.yt.demo9.service;

import com.yt.demo9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    //@Qualifier("testDao")  //按照指定名称加载
    @Autowired  //如果使用Autowired，testDao2，找到TestDao类型的
    private TestDao testDao;

    public void println(){
        System.out.println("service======" + testDao);
    }
}
