package com.jyotirmayadas.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

//    @Before("execution(* com.jyotirmayadas.services.HelloService.hello(..))")
//    public void before() {
//        System.out.println("A");
//    }
//
//    @After("execution(* com.jyotirmayadas.services.HelloService.hello(..))")
//    public void after() {
//        System.out.println("B");
//    }
//
//    @AfterReturning("execution(* com.jyotirmayadas.services.HelloService.hello(..))")
//    public void afterReturn() {
//        System.out.println("C");
//    }
//
//    @AfterThrowing("execution(* com.jyotirmayadas.services.HelloService.hello(..))")
//    public void afterThrowing() {
//        System.out.println("D ");
//    }

    @Around("execution(* com.jyotirmayadas.services.HelloService.hello(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
//        System.out.println("Something else!!!");
        System.out.println("A");
        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
            System.out.println("B");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return "Something else!!";
    }
}

