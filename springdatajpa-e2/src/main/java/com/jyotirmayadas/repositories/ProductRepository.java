package com.jyotirmayadas.repositories;

import com.jyotirmayadas.entities.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

//    List<Product> findProductsByName(String name, Sort s);
    List<Product> findProductsByName(String name, Pageable pageable);
}
