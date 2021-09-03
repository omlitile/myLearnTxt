package com.example.设计模式.行为类.策略模式;

public class RealStrategyB implements Strategy {
    @Override
    public void say() {
        System.out.println("策略B：我很小声地说...");
    }
}
