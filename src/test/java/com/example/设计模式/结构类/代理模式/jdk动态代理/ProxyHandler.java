package com.example.设计模式.结构类.代理模式.jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {
    //被代理对象，真实主题对象，也就是真正干活的那个类
    Object obj;

    //绑定被代理对象
    public Object bind(Object object){
        this.obj = object;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
                .getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在调用方法之前干点什么
        before();
        //调用真实主题类的被代理方法
        Object result =  method.invoke(obj,args);
        //在调用方法之后干点什么
        after();
        return result;
    }

    public void before(){
        System.out.println("在说话之前干点什么...");
    }

    public void after(){
        System.out.println("在说话之后干点什么...");
    }

}
