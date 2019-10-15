package com.czg.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @program: spring-aop
 * @description:
 *              通知类型   连接点     需要实现的接口
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
public class LogBefore implements MethodBeforeAdvice {

    /**
     *
     * @param method   执行的方法的对象
     * @param objects  方法的参数
     * @param o        需要代理的对象，也就是拥有method的对象
     * @throws Throwable
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {

        System.out.println("LogBefore:----方法运行前通知---");
    }
}
