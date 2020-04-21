package com.java.FunctionalJava;

import javax.swing.plaf.ColorUIResource;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingTransactionExchange {
    public static List<TransactionExchange> transactions = Arrays.asList(
            new TransactionExchange(Currency.EUR, 1500.0),
            new TransactionExchange(Currency.USD, 2300.0),
            new TransactionExchange(Currency.GBP, 9900.0),
            new TransactionExchange(Currency.EUR, 1100.0),
            new TransactionExchange(Currency.JPY, 7800.0),
            new TransactionExchange(Currency.CHF, 6700.0),
            new TransactionExchange(Currency.EUR, 5600.0),
            new TransactionExchange(Currency.USD, 4500.0),
            new TransactionExchange(Currency.CHF, 3400.0),
            new TransactionExchange(Currency.GBP, 3200.0),
            new TransactionExchange(Currency.USD, 4600.0),
            new TransactionExchange(Currency.JPY, 5700.0),
            new TransactionExchange(Currency.EUR, 6800.0)
    );


    public static void main(String[] args) {
        Map<Currency,List<TransactionExchange>> list;
        list = transactions.stream()
                .collect(Collectors.groupingBy(TransactionExchange::getCurrency));
//        System.out.println(list);

        transactions.stream()
                .filter(t -> t.getCurrency().equals(Currency.EUR))
                .collect(Collectors.counting()) ;
        System.out.println(transactions);

        Map<Currency,List<Double>> groupbyCurrency = new HashMap<>();

        for(TransactionExchange t: transactions){
           Currency c =  t.getCurrency();
           if(groupbyCurrency.containsKey(c)){
               groupbyCurrency.get(c).add(t.getValue());
           }
           else
           {
               List<Double> value = new ArrayList<>();
               value.add(t.getValue());
               groupbyCurrency.put(c,value);
           }
        }

        for(TransactionExchange t: transactions){
            Currency c = t.getCurrency();
            List<Double> value = groupbyCurrency.getOrDefault(c,new ArrayList<>());
            value.add(t.getValue());
            groupbyCurrency.put(c,value);
        }

        System.out.println(groupbyCurrency);
            transactions.stream().collect(Collectors.toList());
            transactions.stream().collect(Collectors.counting());
    }

}
