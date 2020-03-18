package com.java.FunctionalJava;

import java.util.AbstractSet;

public class Camera {
    private String make;
    private Integer model;

    Camera(String make, Integer model){
        this.make = make;
        this.model = model;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        Camera c = (Camera) obj;
        return this.hashCode() ==  c.hashCode();
    }

    @Override
    public String toString() {
        return "Camera{" +
                "make='" + make + '\'' +
                ", model=" + model +
                '}';
    }


}
