package com.example.设计模式.结构类.适配器模式.类适配器;

public class Adpater extends  Adpatee implements Target {
    @Override
    public void say() {
        specificSay();
    }
}
