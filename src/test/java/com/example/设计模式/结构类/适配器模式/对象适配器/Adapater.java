package com.example.设计模式.结构类.适配器模式.对象适配器;

public class Adapater implements Target {

    Adapatee adapatee;

    public Adapater(Adapatee adapatee){
        this.adapatee = adapatee;
    }

    @Override
    public void say() {
        adapatee.specificSay();
    }
}
