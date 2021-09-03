package com.example.设计模式.创建类.建造者模式;

public class ConcreteBuilder extends AbstractBuilder {
    @Override
    public void buildPartA() {
        product.setPartA("建造partA....");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造partB....");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造partC....");
    }
}
