package com.example.设计模式.创建类.单例模式.双重检查加锁;

public class SingleLock {
    private static volatile SingleLock INSTANCE = null;

    private SingleLock() {

    }

    public static SingleLock getInstance() {
        if (INSTANCE == null) {
            synchronized (SingleLock.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingleLock();
                }
            }
            return INSTANCE;
        } else {
            return null;
        }
    }
}
