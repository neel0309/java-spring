package spring6di.spring6di.controllers;

import org.junit.jupiter.api.Test;

public class MyControllerTest {

    @Test
    void sayHello(){
        MyControllers xx = new MyControllers();
        System.out.println(xx.sayHello());
    }
}
