package com.example.设计模式.结构类.装饰器模式;


public class MyTest {
    public void main(String args[]){
        AbstractComponent a = new RealDecorateTwo(new RealDecorate(new RealComponent()));
        a.say();
    }
}
