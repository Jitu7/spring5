package com.jyotirmayadas.controllers;

import com.jyotirmayadas.entities.Product;
import com.jyotirmayadas.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping(path = "/add")
    public void addProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

    @GetMapping(path = "/get/{name}")
    public Product findProduct(@PathVariable String name) {
        var product = productRepository.findProductByName(name);
        return product;
    }
}
