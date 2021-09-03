package com.example.设计模式.行为类.模版方法模式;

public class ConcreteClass extends  AbstractClass {
    @Override
    public void method2() {
        System.out.println("子类实现的method2...");
    }

    @Override
    public void method3() {
        System.out.println("子类实现的method3....");
    }
}
