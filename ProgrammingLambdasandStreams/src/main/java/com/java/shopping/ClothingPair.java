package com.java.shopping;

public class ClothingPair<E extends Sized & Color> extends Pair<E> {

    public ClothingPair(E left, E right) {
        super(left, right);
    }

    public static <E extends Sized & Color>  boolean matched(E left, E right){
        return left.getSize() == right.getSize() && left.getColor().equals(right.getColor());
    }

    public boolean isRed(Pair<E> sock){
        return  sock.getLeft().getColor().equals("RED");
    }

    public boolean matches(){
        return  left.getSize() == right.getSize() && left.getColor().equals(right.getColor());
    }
}
