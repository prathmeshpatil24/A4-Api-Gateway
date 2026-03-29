package com.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class A4ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(A4ApiGatewayApplication.class, args);

        System.out.println("API Gateway is up...");

	}

}
