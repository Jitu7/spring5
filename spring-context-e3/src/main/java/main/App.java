package main;

import beans.Owner;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        try (var applicationContext =
                     new AnnotationConfigApplicationContext(ProjectConfig.class)) {

//            var dog = applicationContext.getBean(Dog.class);
            var owner = applicationContext.getBean(Owner.class);

//            dog.setName("Tom");
//            System.out.println(dog);
            System.out.println(owner);
        }
    }
}
