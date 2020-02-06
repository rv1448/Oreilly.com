package com.oreilly.shopping.entities;

public class ProductNotFound extends RuntimeException {

    public ProductNotFound(Integer id){
        super("Product not found with id " + id);

    }

}
