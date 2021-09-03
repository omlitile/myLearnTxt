package com.example.设计模式.结构类.装饰器模式;

public class RealComponent implements AbstractComponent {
    @Override
    public void say() {
        System.out.println("正在说话...");
    }
}
