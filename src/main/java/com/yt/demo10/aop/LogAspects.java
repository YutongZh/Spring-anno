package com.yt.demo10.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

//日志切面类
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.yt.demo10.aop.Calculator.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()") //切入表达式
    public void logStart(){
        System.out.println("除法运行之前----参数列表：{}");
    }

    @After("pointCut()")
    public void logEnd(){
        System.out.println("除法运行结束....");
    }

    @AfterReturning("pointCut()")
    public void logReturn(){
        System.out.println("除法正常返回----运行结果是：{}");
    }

    @AfterThrowing("pointCut()")
    public void logException(){
        System.out.println("运行异常.... 异常信息是:{}");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知运行目标方法之前");
        Object proceed = proceedingJoinPoint.proceed(); //反射调用 目标方法
        System.out.println("环绕通知运行目标方法之后");
        return proceed;
    }
}
