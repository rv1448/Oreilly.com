package com.java.FunctionalJava;

import java.util.function.*;

public class FunctionTest {
    interface integerFunction{
        boolean test(int i);
    }



    public static boolean integertest(integerFunction i , int k){
        return i.test(k);
    }
    public static boolean integertest(IntPredicate i , int k){
        return i.test(k);
    }
    public static void integertest(IntConsumer i , int k){
         i.accept(k);
    }
    public static void integertest(IntFunction i , int k){
        System.out.println(i.apply(new Integer(k)));
    }
    public static void main(String[] args) {
        integerFunction f = t -> t%2 ==0;
        IntPredicate t1 = t -> t%2 ==0;
        IntPredicate m1 = t1.or(k -> k%3 ==0);
        IntFunction<Integer> intfunc = t -> t*3;
        System.out.println(FunctionTest.integertest(m1,10));
        FunctionTest.integertest(intfunc, 20);
        /****************************************************************************/

        IntPredicate intpredicate = t -> t/2 ==0;
        LongPredicate longpredicate = t -> t/2 ==0;
        IntConsumer intConsumer = t -> {
            System.out.println(t);
        };





    }
}
