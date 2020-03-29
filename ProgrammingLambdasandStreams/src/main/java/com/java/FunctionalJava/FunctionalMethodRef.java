package com.java.FunctionalJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class FunctionalMethodRef {
    public static List<Apple> sorting(List<Apple> basket){
        basket.sort((Apple o1, Apple o2) -> o1.getWeight() -o2.getWeight() < 0 ?
                -1:( o1.getWeight() -o2.getWeight() >0 ? 1:0)
        );
        return basket;
    }

    public static boolean BipredicateTest(List<Apple> basket,Apple app)
    {
        BiPredicate<List<Apple>, Apple> bifunc = (list, t) ->   list.contains(t);
        BiPredicate<List<Apple>, Apple> bifunc2 = List::contains;
    return  bifunc.test(basket,app);
    }

    public static <T> boolean BipredicateTest(List<T> basket,T app, BiPredicate<List<T>, T> bifunc)
    {
        return  bifunc.test(basket,app);
    }

    public static void main(String[] args) {

        FunctionalMethodRef test = new FunctionalMethodRef();
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

        System.out.println(test.sorting(basket));

        System.out.println(test.BipredicateTest(basket, new Apple(10,"Apple1",Color.PINK)
        ,List::contains));

    }



}
