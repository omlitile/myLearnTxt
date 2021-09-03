package com.example.设计模式.行为类.模版方法模式;

public class MyTest {
    public static void main(String args[]){
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.method1();
        abstractClass.method2();
        abstractClass.method3();
    }
}
