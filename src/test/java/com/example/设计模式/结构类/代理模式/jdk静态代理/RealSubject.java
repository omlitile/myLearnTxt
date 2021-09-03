package com.example.设计模式.结构类.代理模式.jdk静态代理;


/**
 * 这个是真正干活的类。代理类通过调用这个类的引用来实现功能。
 */
public class RealSubject implements AbstractSubject {
    @Override
    public void say() {
        System.out.println("正在说话了...");
    }
}
