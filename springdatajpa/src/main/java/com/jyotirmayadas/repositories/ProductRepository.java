package com.jyotirmayadas.repositories;

import com.jyotirmayadas.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("SELECT p FROM Product p WHERE p.name=:name")
    Product findProductByName(String name);
}
