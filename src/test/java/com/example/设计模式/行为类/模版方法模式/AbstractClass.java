package com.example.设计模式.行为类.模版方法模式;

public abstract  class AbstractClass {
    public void TemplateMethod(){
        method1();
        method2();
        method3();
    }

    public void method1(){
        System.out.println("在模版里已经有实现的方法1....");
    }

    public  abstract  void method2();
    public abstract  void method3();

}
