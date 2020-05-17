package com.java.FunctionalJava;

import java.util.*;
import java.util.stream.Collectors;

import  static java.util.Arrays.asList;
import static java.util.stream.Collectors.*;
enum CaloricLevel{
    DIET,NORMAL,FAT;
}
public class DishTags {
    static Map<String, List<String>>  dishTags = new HashMap<>();
    static List<Dish> menu1;
    static {
        dishTags.put("pork", asList("greasy", "salty"));
        dishTags.put("beef", asList("salty", "roasted"));
        dishTags.put("chicken", asList("fried", "crisp"));
        dishTags.put("french fries", asList("greasy", "fried"));
        dishTags.put("rice", asList("light", "natural"));
        dishTags.put("season fruit", asList("fresh", "natural"));
        dishTags.put("pizza", asList("tasty", "salty"));
        dishTags.put("prawns", asList("tasty", "roasted"));
        dishTags.put("salmon", asList("delicious", "fresh"));

        menu1 = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER));
        }

    public static void main(String[] args) {


        Map<Dish.Type, Set<String>> collect = menu1.stream().collect(
        groupingBy(Dish::getType,
        flatMapping(
                t ->
         dishTags.getOrDefault(t.getName(),Arrays.asList("NOVALUE")).stream().peek(System.out::println), toSet()))
        );
        Map<Dish.Type, List<Dish>> dishesByType =
                menu1.stream().collect(groupingBy(Dish::getType));
        System.out.println(dishesByType);

        System.out.println(
                menu1.stream().collect(
                        groupingBy(Dish::getType,
                                groupingBy(dish -> {
                                    if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                                    else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                                    else return CaloricLevel.FAT;
                                } , mapping(Dish::getName, toList()))
                        )
                )
     );
    }
}
