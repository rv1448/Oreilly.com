package com.java.FunctionalJava;
import static java.lang.System.out;
import static java.util.Comparator.comparing;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.*;
import java.util.stream.Collectors;

interface StringPredicate<T>{
    boolean test(T t);
}

interface StringFunction<T,R>{
    R accept(T t);
}

interface intStringPredicate{
    boolean test(String i) throws ClassCastException;
}

public class Appletest {

    public static void main(String[] args) {
        List<Apple> basket = Arrays.asList(
                new Apple(10,"Apple1",Color.PINK),
                new Apple(70,"Apple2", Color.YELLOW),
                new Apple(100,"Apple13", Color.RED),
                new Apple(47,"Apple143", Color.WHITE),
                new Apple(59,"Apple1558", Color.YELLOW),
                new Apple(81,"Apple2008", Color.ORANGE),
                new Apple(59,"Apple19912", Color.BURGANDE),
                new Apple(19,"Apple41231", Color.YELLOW),
                new Apple(29,"Apple991289123", Color.PINK)
        );
        out.println("Apple Sorted by Weight -- START");
        Collections.sort(basket,
                (Apple a1, Apple a2) ->
                { return  Float.compare(a1.weight,a2.weight)
                        & a1.name.compareTo(a2.name);}
        );
        out.println(basket);
        Collections.sort(basket,
                (Apple a1, Apple a2) ->
                { return  Float.compare(a1.weight,a2.weight)
                         ;}
        );

        out.println(basket);
        out.println("Apple Sorted by Weight -- END");

        ApplePredicate<Apple> p123 = new ApplePredicate<Apple>() {
            @Override
            public boolean test(Apple apple) {
                return apple.color.equals(Color.YELLOW);
            }
        };
        out.println(Apple.filterAppleColorPredicate(basket,p123 ));
        out.println(Apple.filterAppleColorPredicate(basket,p -> p.color.equals(Color.YELLOW) ));
        out.println(Apple.filterAppleColorPredicate(basket,p -> p.weight>5 ));
        Apple.prettyPrintApple(basket,p -> {
            String s = p.weight >  5.0 ? "Heavy" : "Light";
            out.println(s);
        });

        Apple.prettyPrintApple(basket, new ApplePrint<Apple>() {
            @Override
            public void print(Apple apple) {
                String s = apple.color == Color.PINK ? "TRUE":"FALSE";
                out.println(s);
            }
        });
        basket.sort(Apple.SORT_BY_WEIGHT);

        Runnable r = () -> out.println("Thread Name"+Thread.currentThread().getName());
        r.run();

        List<String> strpred = Arrays.asList(
                "Jim",
                "Jerry",
                "Mathew",
                "Simoncole" );
        out.println(stringfilter(strpred, s -> s.length() > 5));
        out.println(stringfunction(strpred, s -> s.length()));
    }


    public static  <T> List<T> stringfilter(List<T> llstring, StringPredicate<T> predstring){
        List<T> ll = new ArrayList<>();
        for (T t: llstring){
            if(predstring.test(t)){
                ll.add(t);

            }
        }
        return ll;
    }


    public static <T, R> List<R> stringfunction(List<T> ll, StringFunction<T,R> func){
        List<R> lr = new ArrayList<>();
        for(T t: ll){
            lr.add( func.accept(t));
        }
        return lr;
    }


}
