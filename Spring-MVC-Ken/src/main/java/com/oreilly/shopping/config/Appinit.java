package com.oreilly.shopping.config;

import com.oreilly.shopping.dao.ProductRepository;
import com.oreilly.shopping.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Appinit implements CommandLineRunner {
    private ProductRepository repository;

    @Autowired
    public Appinit(ProductRepository respository){
        this.repository = respository;
    }

    @Override
    public void run(String... args) throws  Exception{

        if(repository.count() ==0){
            repository.saveAll(Arrays.asList(
                    new Product("baseball",9.99),
                    new Product("football",14.95),
                    new Product("base",11.99)


            ));
        }


    }

}
