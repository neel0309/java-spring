package spring6di.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring6di.spring6di.services.GreetingServiceImpl;


@SpringBootTest
public class ConstructorInjectionDependenciesTest {

    @Autowired
    ConstructorInjectionDependencies constructorInjectionDependencies;

//    @BeforeEach
//    void setUp(){
//        constructorInjectionDependencies = new ConstructorInjectionDependencies(new GreetingServiceImpl());
//    }
    @Test
    void sayHello(){
        System.out.println(constructorInjectionDependencies.sayHello());
    }
}
