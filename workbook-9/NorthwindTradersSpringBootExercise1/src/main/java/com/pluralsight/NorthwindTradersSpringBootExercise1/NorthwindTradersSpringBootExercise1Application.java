package com.pluralsight.NorthwindTradersSpringBootExercise1;

import com.pluralsight.NorthwindTradersSpringBootExercise1.services.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NorthwindTradersSpringBootExercise1Application {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindTradersSpringBootExercise1Application.class, args);
		ProductService productService = context.getBean(ProductService.class);
	}

}
