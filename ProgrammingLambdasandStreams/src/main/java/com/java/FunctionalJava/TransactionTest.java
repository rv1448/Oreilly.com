package com.java.FunctionalJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

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


   List<Integer> number = Arrays.asList(10,9,8263,81,23,123,18);
   number.stream().mapToInt(t -> t).reduce(0,Integer::sum);
   number.stream().mapToInt(t -> t).max();




           









      
//
    }
}
