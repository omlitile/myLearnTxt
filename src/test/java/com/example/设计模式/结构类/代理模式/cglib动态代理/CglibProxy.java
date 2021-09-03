package com.example.设计模式.结构类.代理模式.cglib动态代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
/**
 * cglib实现动态代理
 */
public class CglibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();

    /*
    * getProxy(SuperClass.class)方法通过入参即父类的字节码，通过扩展父类的class来创建代理对象。
    * intercept()方法拦截所有目标类方法的调用，
    *   obj表示目标类的实例，
    *   method为目标类方法的反射对象，
    *   args为方法的动态入参，
    *   proxy为代理类实例。
    * proxy.invokeSuper(obj, args)通过代理类调用父类中的方法
    * */
    public Object getProxy(Class clazz){
        //设置需要创建子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        //通过字节码技术动态创建子类实例
        return enhancer.create();
    }

    //实现MethodInterceptor接口方法
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        before();
        Object result = proxy.invokeSuper(obj, args);//通过代理类调用父类中的方法
        after();
        return result;
    }

    private void before(){
        System.out.println("在之前干点什么...");
    }

    private void after(){
        System.out.println("在之后干点什么...");
    }
}