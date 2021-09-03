package com.example.设计模式.结构类.装饰器模式;

public class RealDecorateTwo extends AbstractDecorate {
    public RealDecorateTwo(AbstractComponent abstractComponent){
        super(abstractComponent);
    }

    @Override
    public void say(){
        //给当前类加上一个装饰
        addTwo();
        this.abstractComponent.say();
    }


    public void  addTwo(){
        System.out.println("我现在变得超级大声....");
    }

}
