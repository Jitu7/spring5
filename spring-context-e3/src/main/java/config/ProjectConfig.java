package config;

import beans.Dog;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"beans"})
public class ProjectConfig {

    //    @Bean
//    public Dog dog() {
//        var dog = new Dog();
//        dog.setName("Tiger");
//        return dog;
//    }
//
//    // approach -1
///*
//    @Bean
//    public Owner owner() {
//        var owner = new Owner();
//        *//**
//         * because of @Bean spring is not calling the method directly
//         * 1st it checks whether it is available in the spring context or not
//         *//*
//        owner.setDog(dog());
//        return owner;
//    }
//*/
//    // approach -2
//    @Bean
//    @Autowired // Optional reqd in earlier version of spring
//    public Owner owner(Dog dog) {
//        var owner = new Owner();
//        owner.setDog(dog);
//        return owner;
//    }

//    @Primary
    @Bean
    @Qualifier(value = "dog1")
    public Dog dog1() {
        var dog = new Dog();
        dog.setName("Jack");
        return dog;
    }

    @Bean
    @Qualifier("dog2")
    public Dog dog2() {
        var dog = new Dog();
        dog.setName("Jill");
        return dog;
    }


}
