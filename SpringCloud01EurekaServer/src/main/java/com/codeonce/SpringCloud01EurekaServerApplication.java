package com.codeonce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloud01EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud01EurekaServerApplication.class, args);
	}

}
