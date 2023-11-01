package spring6di.spring6di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring6di.spring6di.controllers.MyControllers;

@SpringBootApplication
public class Spring6DiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

		MyControllers controllers = ctx.getBean(MyControllers.class);
		
		System.out.println("I am in main method");

		System.out.println(controllers.sayHello());
	}

}
