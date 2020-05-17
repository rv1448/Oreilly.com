package com.java.generics;

public class EastCoastApple implements Fruit {
    String name;
    final String family = "EAST COAST";
    EastCoastApple(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getFamily() {
        return this.family;
    }
    @Override
    public String toString(){
        return getFamily()+ " "+":"+ " "+getName();
    }
}
