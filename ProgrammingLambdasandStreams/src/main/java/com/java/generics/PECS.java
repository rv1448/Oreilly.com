package com.java.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class PECS {
    public static void main(String[] args) {
       List<? super AsianApple> test = new ArrayList<>();
       List<Apple> app = Arrays.asList(new Apple(),new Apple());
        test.add(new AsianApple());

        List<?> m = Arrays.asList("helloq",10);
        List<Integer> listint = Arrays.asList(10,2,3,4,5,6);
        List<Number> listnum = Arrays.asList(10,2,3,4,5,6);


        //ToIntFunction


//        List<? super Integer> lm = listint;
//        List<? super Integer> lp = listnum;
//        Number k = listnum.get(2);

//        List<? super Integer> li = new ArrayList<Integer>();
//        li.add(new Integer(1));
    }

    public void sum(List<? super Integer> li ,int i){
        for(i =0;i<5;i++){
            li.add(i);
        }
        li.add(5);
    }


}


interface Fruit{
 String name();
}

class Apple implements Fruit{

    public String name(){
        return "This is an Apple";
    }
}

class AsianApple extends  Apple {
    public String name(){
        return "This is an AsianApple";
    }
}

class ChinaApple extends  AsianApple {
    public String name(){
        return "This is an ChinaApple";
    }
}