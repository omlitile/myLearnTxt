package com.example.设计模式.结构类.代理模式.jdk动态代理;

import java.lang.reflect.Proxy;

/**
 * JDK 提供的 Proxy 类的工厂方法 newProxyInstance 去动态地创建一个动态代理类
 *
 * 优点：
 *  不用在我们设计实现的时候就指定某一个代理类来代理哪一个被代理对象，我们可以把这种指定延迟到程序运行时由JVM来实现。
 *
 * 缺点：
 *  代理一个没有接口的类，JDK 动态代理就用不上了，这就引出了 CGLib 代理。
 *
 */


public class TestDynamicProxy {
    public static void main(String[] args) {
        //被代理的真实对象
        RealSubject realSubject = new RealSubject();
        //动态代理工具，设置要被代理的真实主题类
        ProxyHandler proxyHandler = new ProxyHandler();
        proxyHandler.bind(realSubject);
        //使用动态代理，得到代理类
        /*
         * 通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
         * 第一个参数 proxyHandler.getClass().getClassLoader() ，我们这里使用realSubject这个类的ClassLoader对象来加载我们的代理对象
         * realSubject.getClass().getInterfaces()，我们这里为代理对象提供的接口是真实对象所实行的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
         * 第三个参数realSubject， 我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上
         */
        AbstractSubject abstractSubject = (AbstractSubject) Proxy.newProxyInstance(proxyHandler.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(), proxyHandler);
        abstractSubject.say();

    }
}
