package com.java.FunctionalJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class TransactionTest {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        transactions.stream()
                .filter(t -> t.getYear() ==2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());

        transactions.stream()
                .map(t ->t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());

        transactions.stream()
                .map(t -> t.getTrader())
                .takeWhile(t -> t.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(t -> System.out.println(t));

        Optional<Integer> k = transactions.stream()
                .map(t-> t.getValue())
                .max( (t,u) -> t.compareTo(u) );
        System.out.println(k.get());


        List<Integer> list1 = Arrays.asList(10,9,8,7);
        List<Integer> list2 = Arrays.asList(5,6,7,8);
        list1.stream()
               .flatMap(i -> list2.stream()
               .map(j -> new int[]{i,j}))
               .distinct()
               .forEach(i -> System.out.println(Arrays.toString(i)));


        List<Dish> SpecialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER));
        boolean b = SpecialMenu.stream()
                .anyMatch(t -> t.isVegetarian());

        String traderStr =
                transactions.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .collect(joining());

        SpecialMenu.stream()
                .mapToInt(t -> t.getCalories())
                .sum();


    }
}
