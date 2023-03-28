package com.example.设计模式.结构类.门面模式;

public class MyTest {
    public static void main(String[] args) {

    }
}

class Facade{

    public void show(){
        ModuleA moduleA = new ModuleA();
        moduleA.testA();
        ModuleB moduleB = new ModuleB();
        moduleB.testB();
        ModuleC moduleC = new ModuleC();
        moduleC.testC();
    }

}

class ModuleA{
    public void testA(){
        System.out.println("A...");
    }
}

class ModuleB{
    public void testB(){
        System.out.println("B...");
    }
}

class ModuleC{
    public void testC(){
        System.out.println("C...");
    }
}
