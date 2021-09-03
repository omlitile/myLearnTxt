package com.example.设计模式.行为类.观察者模式;

public class ConcreteObserverB implements Observer {
    @Override
    public void response() {
        System.out.println("观察者B作出反映...");
    }
}
