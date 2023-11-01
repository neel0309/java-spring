package spring6di.spring6di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import spring6di.spring6di.controllers.MyControllers;

@SpringBootTest
class Spring6DiApplicationTests {


	//----Application Context
	@Autowired
	ApplicationContext applicationContext;

	@Test
	void testGetControllerFromCtx(){
		MyControllers myControllers = applicationContext.getBean(MyControllers.class);

		System.out.println(myControllers.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
