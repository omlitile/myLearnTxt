package com.example.设计模式.创建类.单例模式.饿汉;

public class HungrySingleton {
    //new一个对象的时候，并不是原子操作，在高并发场景下可能会出现jvm指令乱序的问题
    //通过volatile关键字来解决这个问题。
    private volatile static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
