package com.codeonce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloud02EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud02EmployeeServiceApplication.class, args);
	}

}
