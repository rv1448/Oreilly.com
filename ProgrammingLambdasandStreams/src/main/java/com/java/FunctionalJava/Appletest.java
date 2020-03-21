package com.java.FunctionalJava;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



public class Appletest {

    public static void main(String[] args) {
        List<Apple> basket = Arrays.asList(
                new Apple(10,"Apple1",Color.PINK),
                new Apple(7,"Apple1", Color.YELLOW),
                new Apple(6,"Apple1", Color.RED),
                new Apple(4,"Apple1", Color.WHITE),
                new Apple(2,"Apple1", Color.YELLOW)
        );
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

    }
}
