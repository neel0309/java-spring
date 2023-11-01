package spring6di.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@ActiveProfiles({"test"})
@SpringBootTest
public class FauxControllerTest {

    @Autowired
    FauxController controller;

    @Test
    void getEnvironment() {
        System.out.println(controller.data());

    }
}
