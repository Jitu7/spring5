package com.jyotirmayadas;

import com.jyotirmayadas.config.ProjectConfig;
import com.jyotirmayadas.services.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        try (var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            var productService = applicationContext.getBean(ProductService.class);
            productService.addOneProduct();
        }

    }

}
