package com.oreilly.shopping.entities;



import javax.persistence.*;

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "products")

//@Entity
//@Table(name = "products")

public class Product {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String name;

    private double price;

    public Product() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, double price) {
         this.name = name;
        this.price = price;
    }

    public Product(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
