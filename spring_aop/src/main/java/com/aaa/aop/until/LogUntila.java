package com.aaa.aop.until;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * className:LogUntil
 * discription:通知类 切面的具体实现类
 * author:panjing
 * createTime:2018-11-08 14:46
 */
@Component//三个分层之外的用该注解
@Aspect //通知类的注解，，，切面类的实现类
public class LogUntila {

    @Pointcut(value = "execution(void add*(..) )")
    public void pointa(){}

    /**
     * 记录日志功能
     */
   // @AfterReturning(value = "pointa()")
    public void saveLog(){
        System.out.println("模拟日志记录。。。。。");
    }

    /**
     *
     * @param joinPoint
     */
   // @Before(value = "pointa()")
    public void before(JoinPoint joinPoint){
        //获取连接点的方法名
        String name = joinPoint.getSignature().getName();
        System.out.println("执行业务方法"+name+"之前执行的操作。。。。");
    }

    /**
     * 异常通知
     * @param joinPoint
     * @param ex
     */
    @AfterThrowing(value = "pointa()",throwing = "ex")
    public void exception(JoinPoint joinPoint,Exception ex){
        //获取连接点的方法名
        String name = joinPoint.getSignature().getName();
        System.out.println("执行业务方法"+name+"时候发生了名称为。。。。"+ex.getClass().getName()
        +"的异常，异常描述为："+ex.getMessage()
        );


    }

    /**
     * 最终通知
     */
    //@After(value = "pointa()")
    public void  fianll(){
        System.out.println("最终通知无论是否有异常：");
    }

    /**
     * 环绕通知
     * @param proceedingJoinPoint
     * @return
     */
    @Around(value = "pointa()")
    public  Object around(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println(System.currentTimeMillis()+"在业务执行之前操作");
        Object o=null;
        //调用业务方法
        try {
            o=proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println(System.currentTimeMillis()+"在业务执行之后操作");
        return o;
    }
}
