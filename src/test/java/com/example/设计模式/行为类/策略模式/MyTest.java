package com.example.设计模式.行为类.策略模式;

public class MyTest {
    public static void main(String args[]){
        Service service = new Service();
        service.setStrategy(new RealStrategyA());
        service.say();

        service.setStrategy(new RealStrategyB());
        service.say();
    }
}
