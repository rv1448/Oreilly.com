package com.java.shopping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenericsTest {
    static List<Number>   instancelist = new ArrayList<>();

    public static <T> List<? super T> copy(List<? super T> dest, List<T> Src){

        Collections.copy(dest,Src);
        return dest;
    }


    public static <T extends Number>  List<? extends Number> addAll(List<? extends T> add ){
        for(Number t: add){
            instancelist.add(t);
        }
        return instancelist;
    }

    public static void main(String[] args) {

        /*
         *
         *
         *
         */

      //  List<Number> list = new ArrayList<Number>();
       //List<? extends Number> list = new ArrayList<Number>();
        List<? super Number> list = new ArrayList<Number>();
//        List<?> list = new ArrayList<Number>();
        list.add(1);
        list.addAll(Arrays.asList(10,2,2,3,4,5,6));
        System.out.println(list.get(0));

    }
}
