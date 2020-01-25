package com.java.generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
List<E> - E is just for the compile time only
String name -> String says that names is of String during compile time
List<String> names -> two pieces type information during compile time
Additional String is only compile time only
List<E> -> E is only applied until compilation, It's called type erasure.

 */

public class UseAList {
    public static void addToList(List l){
        l.add(0, LocalDate.now());
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names = Collections.checkedList(names, String.class);
        names.add("Fred");
        names.add("Jim");
        names.add("Sheila");

       addToList(names);
        String name1 = names.get(0);

        for(String o: names){
            System.out.println(o);
        }

        String s = "Hello";
        Class clazz = s.getClass();
        Class clazz1 = String.class;
        System.out.println(clazz.getName());
        System.out.println(clazz);
        System.out.println(clazz== clazz1);
    }
}
