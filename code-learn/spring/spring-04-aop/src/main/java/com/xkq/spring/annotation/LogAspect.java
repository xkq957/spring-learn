package com.xkq.spring.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author: xkq
 * @date: 2023/2/25 20:44
 * @description:
 */
@Aspect
@Component
public class LogAspect {

    /*
    * - 前置通知：使用@Before注解标识，在被代理的目标方法**前**执行
    * - 返回通知：使用@AfterReturning注解标识，在被代理的目标方法**成功结束**后执行（**寿终正寝**）
    * - 异常通知：使用@AfterThrowing注解标识，在被代理的目标方法**异常结束**后执行（**死于非命**）
    * - 后置通知：使用@After注解标识，在被代理的目标方法**最终结束**后执行（**盖棺定论**）
    * - 环绕通知：使用@Around注解标识，使用try...catch...finally结构围绕**整个**被代理的目标方法，包括上面四种通知对应的所有位置
    * */
    private Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut(value = "execution(public int com.xkq.spring.annotation.Calculator.add(..))")
    public void pointCutOne(){}

    @Pointcut("execution( * com.xkq.spring.annotation.Calculator.sub(..))")
    public void pointCutTwo(){}

    @Pointcut("pointCutOne() || pointCutTwo()")
    public void pointCutAll(){}


    @Before(value = "pointCutAll()")
    public void beforeMethod(JoinPoint joinPoint) {
        logger.info("前置通知，执行方法名称[{}], 参数[{}]", joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
    }

    @After(value = "execution(* com.xkq.spring.annotation.Calculator.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        logger.info("后置通知，执行方法名称[{}], 参数[{}]", joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(value = "execution(public int com.xkq.spring.annotation.*.*(..))", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        logger.info("返回通知，执行方法名称[{}], 参数[{}]， 返回结果[{}]",
                joinPoint.getSignature().getName(),
                Arrays.toString(joinPoint.getArgs()),
                result);
    }

    @AfterThrowing(value = "execution(public int com.xkq.spring.annotation.*.*(..))", throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex) {
        logger.info("异常通知，执行方法名称[{}], 参数[{}], 异常信息[{}]",
                joinPoint.getSignature().getName(),
                Arrays.toString(joinPoint.getArgs()),
                ex);
    }

    @Around(value = "execution(public int com.xkq.spring.annotation.*.div(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        try {
            System.out.println("环绕通知==目标方法之前执行");

            //调用目标方法
            result = proceedingJoinPoint.proceed();

            System.out.println("环绕通知==目标方法返回值之后");
        }catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知==目标方法出现异常执行");
        } finally {
            System.out.println("环绕通知==目标方法执行完毕执行");
        }
        return result;
    }
}
