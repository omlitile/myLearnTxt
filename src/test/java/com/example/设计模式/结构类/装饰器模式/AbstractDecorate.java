package com.example.设计模式.结构类.装饰器模式;

public class AbstractDecorate implements   AbstractComponent {

    AbstractComponent abstractComponent;

    public AbstractDecorate(AbstractComponent abstractComponent){
        this.abstractComponent = abstractComponent;

    }


    @Override
    public void say() {
        abstractComponent.say();
    }
}
