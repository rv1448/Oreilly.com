package com.java.generics;

import com.java.FunctionalJava.Apple;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestApple {
    static List<WestCoastApple> westCoastAppleList;
    static {
    westCoastAppleList = IntStream.iterate(0, i -> i+1)
            .limit(5)
            .mapToObj(i ->new WestCoastApple("Apple"+i))
            .collect(Collectors.toList());

    westCoastAppleList.addAll(IntStream.iterate(6, i -> i+1)
            .limit(5)
            .mapToObj(i ->new WestCoastSouthApple("Apple"+i))
            .collect(Collectors.toList()));

    }

    public void consumerModified(Consumer<? super WestCoastApple> c){
        for(WestCoastApple c_test: westCoastAppleList){
            c.accept(c_test);
        }
    }
    public void consumerNumber(Consumer<? super WestCoastApple> consumer, List<WestCoastApple> listnum){
        for(WestCoastApple n: listnum){ consumer.accept(n);}
    }
    public static void main(String[] args) {
        new TestApple().consumerNumber(new Consumer<WestCoastApple>() {
            @Override
            public void accept(WestCoastApple t) {
                System.out.println(t);
            }
        },westCoastAppleList);

        Consumer<Fruit> fruitConsumer = new Consumer<Fruit>() {
            @Override
            public void accept(Fruit fruit) {
                System.out.println(fruit);
            }

        };
        Consumer<Object>  objectConsumer = new Consumer<Object>() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };
        Consumer<WestCoastSouthApple> westCoastSouthAppleConsumer = new Consumer<com.java.generics.WestCoastSouthApple>() {
            @Override
            public void accept(WestCoastSouthApple westCoastSouthApple) {
                System.out.println(westCoastSouthApple);
            }
        };

       Consumer<Object> objectConsumer1 = t -> System.out.println(t);

       Consumer<Fruit> fruitConsumer1 = t -> {
           System.out.println(t.getFamily());
           System.out.println(t.toString());
       };
       Consumer<WestCoastApple> westCoastAppleConsumer1 = t -> {
           System.out.println(t.name);
           System.out.println(t.toString());
       };
       Consumer<WestCoastSouthApple> westCoastSouthAppleConsumer1 = t -> {
           System.out.println(t.name);
           System.out.println(t.toString());
       };

        TestApple testApple = new TestApple();
        testApple.consumerModified(objectConsumer1);
        testApple.consumerModified(fruitConsumer1);
        testApple.consumerModified(westCoastAppleConsumer1);



//        westCoastAppleList.forEach(objectConsumer);
//        westCoastAppleList.forEach( (Fruit f) -> System.out.println(f.getFamily()));
//        westCoastAppleList.forEach( (WestCoastApple f) -> System.out.println(f.getFamily()));
      //  westCoastAppleList.forEach(westCoastSouthAppleConsumer);


    }
}
