package com.oreilly.shopping.dao;

import com.oreilly.shopping.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAllByPriceGreaterThanEqual(Double price);
    Optional<Product> findById(Integer id);
}
