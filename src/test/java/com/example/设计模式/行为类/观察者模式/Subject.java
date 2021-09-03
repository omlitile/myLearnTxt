package com.example.设计模式.行为类.观察者模式;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> list = new ArrayList<>();

    public void add(Observer observer){
        list.add(observer);
    }

    public void delete(Observer observer){
        list.remove(observer);
    }

    public abstract void notifyObserver();

}
