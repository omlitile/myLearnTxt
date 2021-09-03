package com.example.设计模式.行为类.策略模式;

public class RealStrategyA implements Strategy {
    @Override
    public void say() {
        System.out.println("策略A：我很大声地说....");
    }
}
