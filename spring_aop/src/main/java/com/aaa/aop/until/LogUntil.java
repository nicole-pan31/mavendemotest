package com.aaa.aop.until;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * className:LogUntil
 * discription:通知类 切面的具体实现类
 * author:panjing
 * createTime:2018-11-08 14:46
 */

public class LogUntil {
    /**
     * 记录日志功能
     */
    public void saveLog(){
        System.out.println("模拟日志记录。。。。。");
    }

    /**
     *
     * @param joinPoint
     */
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
    public void exception(JoinPoint joinPoint,Exception ex){
        //获取连接点的方法名
        String name = joinPoint.getSignature().getName();
        System.out.println("执行业务方法"+name+"时候发生了名称为。。。。"+ex.getClass().getName()
        +"的异常，异常描述为："+ex.getMessage()
        );


    }
    public void  fianll(){
        System.out.println("最终通知无论是否有异常：");
    }

    /**
     * 环绕通知
     * @param proceedingJoinPoint
     * @return
     */
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
