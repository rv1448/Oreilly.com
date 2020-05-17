package com.java.generics;

import java.util.Objects;

public interface Fruit {
   String getName();
    String getFamily();
    default void printFamily(){
        System.out.println(getName() + getFamily());
    }
    String toString();
}
