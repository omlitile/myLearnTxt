package com.example.设计模式.行为类.观察者模式;

public class MyTest {
    public static void main(String args[]){
        ConcreteObserverA concreteObserverA = new ConcreteObserverA();
        ConcreteObserverB concreteObserverB = new ConcreteObserverB();
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.add(concreteObserverA);
        concreteSubject.add(concreteObserverB);
        concreteSubject.notifyObserver();
    }
}
