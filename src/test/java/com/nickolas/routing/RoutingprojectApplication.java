package com.nickolas.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RequestMapping
public class RoutingprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutingprojectApplication.class, args);
	}

}