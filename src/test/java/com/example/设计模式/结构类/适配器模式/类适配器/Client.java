package com.example.设计模式.结构类.适配器模式.类适配器;

public class Client {
    public static void main(String args[]){
        Target target = new Adpater();
        target.say();
    }
}
