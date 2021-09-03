package com.example.设计模式.创建类.抽象工厂模式;

public class ProductAFactory implements  Factory {
    @Override
    public ProductA1 getProductA1() {
        return new ProductA1();
    }

    @Override
    public ProductA2 getProductA2() {
        return new ProductA2();
    }
}
