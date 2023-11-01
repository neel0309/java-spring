package spring6di.spring6di.controllers;

import org.springframework.stereotype.Controller;
import spring6di.spring6di.services.GreetingService;
import spring6di.spring6di.services.GreetingServiceImpl;

@Controller
public class MyControllers {

    private final GreetingService greetingService;

    // Dependencies without injection - That is creating an object
    public MyControllers() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I am in the container");

        return greetingService.sayGreetings();
    }
}
