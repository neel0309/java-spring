package spring6di.spring6di.controllers;

import org.springframework.stereotype.Controller;
import spring6di.spring6di.services.GreetingService;


@Controller
public class ConstructorInjectionDependencies {
    private final GreetingService greetingService;

    public ConstructorInjectionDependencies(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return "return from constructor injection";
    }
}
