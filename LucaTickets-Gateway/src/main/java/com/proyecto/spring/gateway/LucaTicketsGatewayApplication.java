package com.proyecto.spring.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LucaTicketsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LucaTicketsGatewayApplication.class, args);
	}
}
