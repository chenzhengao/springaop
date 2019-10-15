package com.czg.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @program: spring-aop
 * @description: 编写自定义通知
 * @author: czg
 * @create: 2019-10-06 12:20
 */
public class LogAdvice {

    /**
     *      前置通知--方法执行前-->
     *      后置通知（出现异常之后不会调用）---在目标方法执行后调用--->
     *      环绕通知-----在方法前后调用------>
     *      异常拦截通知--出现异常时调用-->
     *      后置通知（引介通知）（无论出不出现异常都会调用）--在目标方法执行之后调用
     */

    public void beforeLog(){

        System.out.println("我是前置通知");
    }

    public void afterReturning(){

        System.out.println("我是后置通知（出现异常就不会调用）");
    }

    /**
     * 必须接收ProceedingJoinPoint（必须连接点） 参数
     * @param pj
     * @return 必须有返回值，有点像使用动态代理
     * @throws Throwable
     */
    public Object around(ProceedingJoinPoint pj) throws Throwable {

        System.out.println("我是环绕通知--之前部分");
        Object proceed = pj.proceed();// 调用目标方法
        System.out.println("我是环绕通知--之后部分");

        return proceed;
    }


    //异常通知
    public void afterException(){
        System.out.println("我是异常通知--发生异常了");
    }


    //我是
    public void after(){
        System.out.println("我是后置引介通知（出现异常就也会调用）");
    }

}
