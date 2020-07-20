package com.edmontheprogrammer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);

		// creating a new instance of Alien class, an Alien object
		Alien a = context.getBean(Alien.class);
		a.show();

/*		// creating a new instance of Alien class, an Alien object
		Alien a1 = context.getBean(Alien.class);
		a.show();*/
	}

}
