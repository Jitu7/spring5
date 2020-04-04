package com.jyotirmayadas.controller;

import com.jyotirmayadas.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ProductController {

    @GetMapping(path = "/product/{name}")
    public Product getProduct(@PathVariable String name) {
        Product product = new Product();

        product.setName(name);
        product.setPrice(10);

        return product;
    }
}
