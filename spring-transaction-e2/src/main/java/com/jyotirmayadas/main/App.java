package com.jyotirmayadas.main;

import com.jyotirmayadas.main.config.ProjectConfig;
import com.jyotirmayadas.main.services.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        try (var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            var productService = applicationContext.getBean(ProductService.class);
            productService.addTenProducts(); // no transaction
        }

    }
    
}
