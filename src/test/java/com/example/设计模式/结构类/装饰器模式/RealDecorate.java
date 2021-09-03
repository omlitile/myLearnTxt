package com.example.设计模式.结构类.装饰器模式;

public class RealDecorate extends AbstractDecorate {

    public RealDecorate(AbstractComponent abstractComponent){
        super(abstractComponent);
    }

    @Override
    public void say(){
        //给当前类加上一个装饰
       add();
       this.abstractComponent.say();
    }


    public void  add(){
        System.out.println("我现在变得很大声....");
    }

}
