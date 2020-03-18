package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;

public class App {

    public static void main(String[] args) {

        try (var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            var productRepository = applicationContext.getBean(ProductRepository.class);
//
//            var product = new Product();
//            product.setName("Beer");
//            product.setPrice(10);

//            productRepository.add(product);

            var products = productRepository.getProducts();
            products.forEach(System.out::println);

        }
    }
}
