package com.jyotirmayadas;

import com.jyotirmayadas.config.ProjectConfig;
import com.jyotirmayadas.services.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        try (var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            var helloService = applicationContext.getBean(HelloService.class);
            var message = helloService.hello("Jitu");
            System.out.println("Result is " + message);
        }
    }
}
