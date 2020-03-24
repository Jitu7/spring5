package com.jyotirmayadas.services;

import com.jyotirmayadas.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * By default TransactionManager rollback a transaction only
     * if RuntimeException is propagated outside of the method and
     * it doesn't rollback for checkedException
     *
     * we can customize default behaviour too
     */
//    @Transactional(noRollbackFor = RuntimeException.class)
//    @Transactional(rollbackFor = Exception.class)
    @Transactional
    public void addOneProduct() {
        productRepository.addProduct("Beer");
        throw new RuntimeException(":(");
    }
}
