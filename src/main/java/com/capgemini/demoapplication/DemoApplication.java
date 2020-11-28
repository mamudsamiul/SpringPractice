package com.capgemini.demoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//initialize the spring container
		ConfigurableApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		Employee emp=context.getBean(Employee.class);
		emp.show();
	}

}
