package com.java.FunctionalJava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public class DishTest {
    static List<Dish>  SpecialMenu = new ArrayList<>();
    static {
        SpecialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER));
    }

    public static void main(String[] args) {
        List<Integer> listIntegers = Arrays.asList(10,9,7,6,5,4,3,176,167,176);
        String s = "You saw how to return the length for each word in a list using the map method. " +
                "Let’s extend this idea a bit further: How could you return a list of all the unique characters " +
                "for a list of words? For example, given the list of words";
        String s1 = "You saw how You Saw";

        List<String> sentence  = Arrays.asList(s.split(" "))
                .stream()
                .map(i -> i.toLowerCase())
                .takeWhile(t -> t.length() > 2)
                .distinct()
                .collect(Collectors.toList());



        String[] a = s1.split(" ");
        Arrays.stream(a)
                .map(i -> i.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .count();

        Arrays.stream(a)
                .map(t -> t.split(""))
                .map(t -> Arrays.stream(t))
                .flatMap(t -> t)
                .forEach(t -> System.out.println(t));
        List<Integer> a1 = Arrays.asList(1,2,3);
        List<Integer> a2 = Arrays.asList(1,2);

        List<int[]> m= a1.stream()
                .flatMap(i -> a2.stream().map(j -> new int[]{i,j} ))
                .dropWhile( t -> (t[0]+t[1]) == 3)
                .collect(Collectors.toList());

        a1.stream()
                .flatMap(i -> a2.stream().map(j -> new int[]{i,j} ))
                .filter( t -> (t[0]+t[1]) == 3)
                .forEach(t ->out.println(t[0]+" "+t[1]) );
        BinaryOperator<Integer> biop = (integer, integer2) -> Integer.sum(integer,integer2);

        a1.stream()
                .mapToInt(t -> t)
                .sum();

    }
}
