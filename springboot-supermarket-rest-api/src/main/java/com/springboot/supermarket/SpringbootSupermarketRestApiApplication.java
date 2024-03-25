package com.springboot.supermarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringbootSupermarketRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSupermarketRestApiApplication.class, args);
	}

}
