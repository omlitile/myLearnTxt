package com.example.设计模式.结构类.代理模式.jdk动态代理;

public class RealSubject implements AbstractSubject {
    @Override
    public void say() {
        System.out.println("正在说话...");
    }
}
