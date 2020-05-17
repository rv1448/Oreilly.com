package com.java.generics;

public class WestCoastSouthApple extends WestCoastApple {


    final String family = "WEST COAST SOUTH";

    WestCoastSouthApple(String name) {
        super(name);
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
