package com.java.FunctionalJava;

import lombok.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static  java.lang.System.out;
import static java.util.stream.Collectors.groupingBy;

@ToString(includeFieldNames=true)
@Data
public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    public final Type type;

    public enum Type{MEAT,FISH,OTHER}

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );
        out.println(menu);
        menu.stream()
                .collect(Collectors.toList());
        out.println("******************************************************************");
        List<Integer> listIntegers = Arrays.asList(10,9,7,6,5,4,3,176,167,176);
        listIntegers.stream()
                .filter(i -> i%2 ==0)
                .limit(3)
                .distinct()
                .forEach( (Number t ) -> out.println());




    }
}
