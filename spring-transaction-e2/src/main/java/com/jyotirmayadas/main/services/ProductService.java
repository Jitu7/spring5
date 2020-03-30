package com.jyotirmayadas.main.services;

import com.jyotirmayadas.main.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    /**
     * REQUIRED (default) --> if there is no transaction it creates a transaction otherwise uses the same
     * REQUIRES_NEW ---> always creates a new transaction
     * MANDATORY ---> need to already have a transaction, if no transaction exception will be thrown
     * NEVER ---> opposite of mandatory it tells that you should never have a transaction while calling the method
                    method can't be called with a transaction
     * SUPPORTS ---> it supports both having or not having a transaction, if you have a transaction the transaction will
                        be used or it will work with out the transaction
     * NOT_SUPPORTED ---> it will work with having and not having a transaction, but always be execute the method
                            without transaction
     * NESTED ---> creating the transaction with in the existing transaction
     * <p>
     * a() ---> b()
     */

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

//    @Transactional(propagation = Propagation.REQUIRED)
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void addTenProducts() { // created
        for (int i = 0; i < 10; i++) {
            productRepository.addProduct("Product " + i);
            if (i == 5) throw new RuntimeException(":(");
        }
    } // commited
}
