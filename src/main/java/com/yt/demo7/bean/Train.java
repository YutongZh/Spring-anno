package com.yt.demo7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("com.yt.demo7.bean")
public class Train implements InitializingBean, DisposableBean {

    public Train(){
        System.out.println("Train-----constructor----");
    }

    /**
     * 当bean销毁时调用
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("Train------destory----");
    }

    /**
     * bean的属性全部赋值和初始化之后调用
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Train-----afterPropertiesSet------");
    }
}
