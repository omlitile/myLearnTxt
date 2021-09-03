package com.example.设计模式.行为类.策略模式;

public class Service  {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void say(){
        strategy.say();
    }
}
