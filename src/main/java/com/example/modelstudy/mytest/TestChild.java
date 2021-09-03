package com.example.modelstudy.mytest;

import java.io.Serializable;

public class TestChild extends TestParent implements Serializable {
    int age;
    public TestChild(String name,int age){
        this.name = name;
        this.age = age;
    }
}
