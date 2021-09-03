package com.example.设计模式.创建类.单例模式.内部静态类;

public class SingleInnerClass {
    private SingleInnerClass() {
    }

    private static class SingleTonHolder {
        private static SingleInnerClass INSTANCE = new SingleInnerClass();
    }

    public static SingleInnerClass getInstance() {
        return SingleTonHolder.INSTANCE;
    }
}
