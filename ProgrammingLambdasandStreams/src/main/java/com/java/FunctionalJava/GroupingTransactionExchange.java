package com.java.FunctionalJava;

import javax.swing.plaf.ColorUIResource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

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
        Map<Currency,List<TransactionExchange>> list = transactions.stream()
                .collect(groupingBy(TransactionExchange::getCurrency));
        System.out.println(list);

    }

}
