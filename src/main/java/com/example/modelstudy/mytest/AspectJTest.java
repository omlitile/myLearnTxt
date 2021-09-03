package com.example.modelstudy.mytest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectJTest {
    @Pointcut("execution(public * com.example.modelstudy..*.*(..))")
    public void test(){

    }


    @Before("test()")
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @After("test()")
    public void afterTest(){
        System.out.println("afterTest");
    }

//    @Around("test()")
//    public Object arountTest(ProceedingJoinPoint proceedingJoinPoint){
//        System.out.println("before1");
//        Object o = null;
//        try {
//            o = proceedingJoinPoint.proceed();
//        }catch (Throwable e){
//            e.printStackTrace();
//        }
//        System.out.println("after1");
//        return o;
//    }



}
