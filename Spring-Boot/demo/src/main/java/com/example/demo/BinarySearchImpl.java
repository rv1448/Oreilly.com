package com.example.demo;

public class BinarySearchImpl {

    private Sortalgo sortalgo;

    public BinarySearchImpl(Sortalgo sortalgo) {
        this.sortalgo = sortalgo;
    }


    public int search(int[] a, int number){
        int sortedarray = sortalgo.sort(new int[] {1,2,3,5},1);
        return sortedarray;
    }
}
