package com.jyotirmayadas.main.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    @Transactional(propagation = Propagation.MANDATORY) // doesn't create a transaction, but makes sure transaction
                                                        // is required to call this method
//    @Transactional(propagation = Propagation.NEVER) // opposite of MANDATORY
//    @Transactional(propagation = Propagation.REQUIRES_NEW) // creates a new transaction
//    @Transactional(propagation = Propagation.SUPPORTS) // doesn't create a transaction, but we can call the method with
                                                    // or without transaction
    public void addProduct(String name) {
        var sql = "INSERT INTO product VALUES (NULL, ?)";
        jdbcTemplate.update(sql, name);
    }

}
