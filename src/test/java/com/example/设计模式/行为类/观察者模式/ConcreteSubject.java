package com.example.设计模式.行为类.观察者模式;

public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("目标发生改变，开始通知观察者...");
        for(Observer observer:list){
        observer.response();
        }
    }
}
