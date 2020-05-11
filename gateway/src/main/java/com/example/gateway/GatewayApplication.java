package com.example.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayApplication {

	@Value("test-config")
	private String testConfig;

	public static void main(String[] args) {

		SpringApplication.run(GatewayApplication.class, args);
	}

}
