package com.java.FunctionalJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


interface  ApplePredicate<Apple> {
    boolean test(Apple a);
}

interface ApplePrint<T>{
    void print(T t);
}
public class Apple{
    float weight;
    String name;
    Color color;

    public Apple(float weight, String name, Color color) {
        this.weight = weight;
        this.name = name;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Float.compare(apple.weight, weight) == 0 &&
                Objects.equals(name, apple.name) &&
                color == apple.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name, color);
    }

    public static List<Apple> filterAppleColor(List<Apple> basket, Color color){
        List<Apple> basket_new = new ArrayList<>();
        for(Apple a: basket){
           if(color == a.color) { basket_new.add(a);}
        }
        return basket_new;
    }

    public static <T> List<T> filterAppleColorPredicate(List<T> basket, ApplePredicate<T> filter)
    {
        List<T> result = new ArrayList<>();
         for(T bask: basket){
             if(filter.test(bask)) {
                 result.add(bask);
             }
         }
         return result;
    }

    public static <T> void  prettyPrintApple(List<T> basket, ApplePrint<T> printlogic){
        for(T a : basket){
            printlogic.print(a);
        }
    }
    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
