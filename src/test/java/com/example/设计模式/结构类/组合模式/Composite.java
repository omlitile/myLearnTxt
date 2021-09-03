package com.example.设计模式.结构类.组合模式;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    List<Component> list = new ArrayList<>();
    @Override
    public void execute() {

    }

    public void add(Component component){
        this.list.add(component);
    }

    public void delete(Component component){
        this.list.remove(component);
    }

    public List<Component> getChildren(){
        return this.list;
    }

}
