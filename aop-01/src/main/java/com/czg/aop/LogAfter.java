package com.czg.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @program: spring-aop
 * @description:
 *              通知类型   连接点     需要实现的接口
 *
 *              前置通知   方法前   MethodBeforeAdvice
 *              后置通知   方法后   AfterReturningAdvice
 *
 *              环绕通知   方法前后  MethodInterceptor
 *            异常抛出通知 方法抛出异常  ThrowsAdvice
 *             引介通知   类中增加新的方法属性      AfterReturningAdvice
 *
 * @author: czg
 * @create: 2019-10-05 22:18
 */
public class LogAfter implements AfterReturningAdvice {

    /**
     *
     * @param o       方法的返回值
     * @param method  切入点：的方法对象
     * @param objects 方法的参数
     * @param o1      代理的对象
     * @throws Throwable
     */
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("LogAfter:----执行方法后通知---");
    }
}
