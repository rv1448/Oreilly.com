package com.oreilly.shopping.controllers;

import com.oreilly.shopping.dao.ProductRepository;
import com.oreilly.shopping.entities.Product;
import com.oreilly.shopping.entities.ProductNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductRestController {

    private ProductRepository repository;


    @Autowired
    public ProductRestController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(@RequestParam(required = false) Double minimumPrice){
        if(minimumPrice != null){
            return repository.findAllByPriceGreaterThanEqual(minimumPrice);
        }
        return repository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable("id") Integer id){
        Optional<Product> optional = repository.findById(id);


        return optional.orElseThrow(() -> new ProductNotFound(id));
    }


    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    public Product insertProduct(@RequestBody Product product){
        return repository.save(product);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer id){
        Optional<Product> product = repository.findById(id);
        if(product.isPresent()){
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
