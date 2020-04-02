package com.jyotirmayadas.controllers;

import com.jyotirmayadas.entities.Product;
import com.jyotirmayadas.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping(path = "/sort")
    public Iterable<Product> getAllSortedDescendingById() {
        return productRepository.findAll(Sort.by("id").descending());
    }

    @GetMapping(path = "/page/{page}")
    public List<Product> getProductsByPage(@PathVariable int page) {
        Sort sortById = Sort.by("id").descending();
//        Page<Product> productPage = productRepository.findAll(PageRequest.of(page, 3));
        Page<Product> productPage = productRepository.findAll(PageRequest.of(page, 5, sortById));
        List<Product> products = productPage.getContent();
        return products;
    }

    @GetMapping("/name/{name}/{page}")
    public List<Product> getProductsByName(@PathVariable String name,
                                           @PathVariable int page) {
//        return productRepository.findProductsByName(name, Sort.by("id").descending());

        return productRepository.findProductsByName(name, PageRequest.of(page, 3));
    }
}
