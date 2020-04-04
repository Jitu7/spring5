package com.jyotirmayadas.services;

import com.jyotirmayadas.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<String> getProductNameWithEvenNoOfChar() {
        List<String> productNames = productRepository.getProductNames();

        return productNames.stream()
                .filter(s -> s.length() % 2 == 0)
                .collect(Collectors.toList());
    }
}
