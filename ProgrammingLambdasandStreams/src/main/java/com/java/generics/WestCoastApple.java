package com.java.generics;


public class WestCoastApple implements Fruit{
    String name;
    final String family = "WEST COAST";
    WestCoastApple(String name){
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