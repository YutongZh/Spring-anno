package com.yt.demo10.config;

import com.yt.demo10.aop.Calculator;
import com.yt.demo10.aop.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 日志切面类的方法需要感知到div()方法运行，
 * 通知方法：
 *  @Before             前置通知：logStart（）；在执行div（）除法之前运行
 *  @After              后置通知：logEnd（）；在执行div（）运行结束之后，不管有没有异常，都会执行后置通知 类似finally
 *  @AfterRetruning     返回通知：logRetrun（）；在目标方法div（）正常返回是运行
 *  @AfterThrowing      异常通知：logException；在目标方法div（）出现异常后运行
 *  @Around             环绕通知：动态代理，需要手动执行joinPoint.procced()
 *
 */
@Configuration
@EnableAspectJAutoProxy  //aop 开关
public class MainConfig10 {

    @Bean
    public Calculator calculator(){
        return new Calculator();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}
