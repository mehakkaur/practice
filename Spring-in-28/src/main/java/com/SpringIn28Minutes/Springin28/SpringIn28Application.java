package com.SpringIn28Minutes.Springin28;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//this includes @enableAutoConfiguration,
//@ComponentScan,
//@SringBootConfiguration
public class SpringIn28Application {

	public static void main(String[] args) {

		//@Component scan happens first
		ApplicationContext context=SpringApplication.run(SpringIn28Application.class, args);
		//what are beans-> @Component, start creating bean and solve dependencies.
		//what are dependency of bean->@Autowired
		//where to find -> @ComponentScan
		BinarySearchImpl binarySearch=context.getBean(BinarySearchImpl.class);
		binarySearch.search(new int[]{1,2,6,5},2);
	}

}
