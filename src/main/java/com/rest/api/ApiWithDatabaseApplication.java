package com.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiWithDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiWithDatabaseApplication.class, args);
		System.out.println("Hello");
	}

}
