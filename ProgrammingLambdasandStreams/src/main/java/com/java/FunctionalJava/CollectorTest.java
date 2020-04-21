package com.java.FunctionalJava;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorTest {
    static List<Dish> SpecialMenu = new ArrayList<>();

    static {
        SpecialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("Hummes", true, 700, Dish.Type.MEAT),
                new Dish("wine", true, 1000, Dish.Type.OTHER));
    }


    public static void main(String[] args) {

//        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6).stream();
//
//        List<Integer> numbers = stream.reduce(
//                new ArrayList<Integer>(),
//                (List<Integer> l, Integer e) -> {
//                    l.add(e);
//                    return l; },
//                (List<Integer> l1, List<Integer> l2) -> {
//                    l1.addAll(l2);
//                    return l1; });
//        System.out.println(numbers);
//
//
//        stream.collect(ArrayList::new, List::add,List::addAll);


//        Supplier<R> supplier,
//        BiConsumer<R, ? super T> accumulator,
//        BiConsumer<R, R> combiner
        Stream<Dish> menustream = SpecialMenu.stream();
        List<Integer> calories = menustream.map(Dish::getCalories).reduce(new ArrayList<Integer>(),
                (objects, e) -> { objects.add(e);return objects;} ,
                (objects1, c) -> {objects1.addAll(c); return objects1;} );
        System.out.println(calories);


        int[] intarray = {10,9,6,7,6};

        SpecialMenu.stream().map(Dish::getCalories).reduce(0,(a,b) -> Integer.sum(a,b));
        SpecialMenu.stream().map(Dish::getCalories).reduce(0, Integer::sum);

        String homeValue = System.getProperty("home");
        System.out.println(homeValue);

    }



}
