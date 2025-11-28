package com.example.healthprovider.healthprovider_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class HealthproviderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthproviderServiceApplication.class, args);
	}

}
