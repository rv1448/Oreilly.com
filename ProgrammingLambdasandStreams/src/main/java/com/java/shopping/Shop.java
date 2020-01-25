package com.java.shopping;
import static java.lang.System.out;
public class Shop {
    public static void main(String[] args) {
        ClothingPair<Sock> p = new ClothingPair<>(new Sock(9,"RED"),new Sock(10,"RED"));
        out.println(p.matches());
        ClothingPair<Sock> ps2 = new ClothingPair<>(new Sock(10,"RED"),new Sock(10,"GREEN"));
        out.println(ps2.matches());
        ClothingPair<Sock> ps3 = new ClothingPair<>(new Sock(10,"RED"),new Sock(10,"RED"));
        out.println(ps3.matches());

    }
}
