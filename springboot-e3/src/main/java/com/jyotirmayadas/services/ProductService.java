package com.jyotirmayadas.services;

import com.jyotirmayadas.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(String name) {
        productRepository.addProduct(name);
    }
}
