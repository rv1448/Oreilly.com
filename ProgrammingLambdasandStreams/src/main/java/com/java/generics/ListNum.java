package com.java.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListNum {

    public static  <E>  void  addAll(Collection<? extends E> collection){
        for (E e: collection){

        }

    }



    public static void main(String[] args) {
        List<Number> nums = new ArrayList<Number>();
        List<Integer> ints = Arrays.asList(1, 2);
        List<Double> dbls = Arrays.asList(2.78, 3.14);


    }
}
