package com.java.shopping;

public class Sock implements Sized, Color{
    private int size;
    private String color;
   // https://www.sterlingadministration.com/contact/
    public Sock(int size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public int getSize() {
       return size;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
