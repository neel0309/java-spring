package spring6di.spring6di.controllers;


import org.springframework.stereotype.Controller;
import spring6di.spring6di.services.EnvironmentService;

@Controller
public class FauxController {

    private final EnvironmentService environmentService;


    //dependency injection
    public FauxController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String data(){
        return "You are in " + environmentService.data() + " Environment";
    }
}
