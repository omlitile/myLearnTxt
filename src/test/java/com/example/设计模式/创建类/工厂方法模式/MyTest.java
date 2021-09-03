package com.example.设计模式.创建类.工厂方法模式;

public class MyTest {
    public static void main(String args[]){
        AbstractFactory abstractFactory = new ConcreteFactory1();
        abstractFactory.newProduct();
        abstractFactory = new ConcreteFactory2();
        abstractFactory.newProduct();
    }
}
