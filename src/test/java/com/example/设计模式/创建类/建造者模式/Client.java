package com.example.设计模式.创建类.建造者模式;

public class Client
{
    public static void main(String[] args)
    {
        AbstractBuilder builder=new ConcreteBuilder();
        Director director=new Director(builder);
        Product product=director.construct();
        product.show();
    }
}
