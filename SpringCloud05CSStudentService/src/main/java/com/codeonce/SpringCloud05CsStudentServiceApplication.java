package com.codeonce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloud05CsStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud05CsStudentServiceApplication.class, args);
	}

}
