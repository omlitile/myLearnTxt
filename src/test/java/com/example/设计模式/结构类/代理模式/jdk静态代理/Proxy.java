package com.example.设计模式.结构类.代理模式.jdk静态代理;

public class Proxy implements AbstractSubject {

    AbstractSubject abstractSubject;

    @Override
    public void say() {
        abstractSubject = new RealSubject();
        System.out.println("在说话之前要干点别的...");
        abstractSubject.say();
        System.out.println("在说话之后要干点别的...");
    }

    /**
     * 这个就是一个静态代理模式。通过代理类去调用真实主题类。
     * 我们可以看到，在代理类中，还可以在调用真正的方法之前或者之后，干点别的事情。
     */

}
