package com.lightbend.lambdasprac;

import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        Function<String, Integer> func = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        Function<String, Integer> func1 = (String s) -> Integer.parseInt(s);
        Function<String, Integer> func2 = (String s) -> { return  Integer.parseInt(s);};

    }
}
