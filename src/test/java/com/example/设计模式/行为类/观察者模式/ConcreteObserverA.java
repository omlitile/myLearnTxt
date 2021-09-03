package com.example.设计模式.行为类.观察者模式;

public class ConcreteObserverA implements Observer {
    @Override
    public void response() {
        System.out.println("观察者A作出反映...");
    }
}
