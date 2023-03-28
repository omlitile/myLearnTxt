package com.example.设计模式.创建类.单例模式.双重检查加锁;

public class SingleLock {
    //防止重排序
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
        }
        return INSTANCE;
    }

    private Object readResolve(){
        //确认序列化不会破坏类的唯一性
        return SingleLock.getInstance();
    }

}
