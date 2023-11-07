package spring.spring6restmvc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.spring6restmvc.controller.BeerController;
import spring.spring6restmvc.service.BeerService;

import java.util.UUID;


@SpringBootTest
public class BeerControllerTest {

    @Autowired
    BeerController beerController;
    @Test
    void getBeerById(){
        System.out.println(beerController.getBeerById(UUID.randomUUID()));
    }
}
