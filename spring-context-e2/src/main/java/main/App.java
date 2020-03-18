package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ProductDeliveryService;

public class App {

    public static void main(String[] args) {

        try(var annotationConfigApplicationContext =
                    new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            var productDeliveryService = annotationConfigApplicationContext.getBean(ProductDeliveryService.class);
            productDeliveryService.addSomeProducts();
        }
    }

}
