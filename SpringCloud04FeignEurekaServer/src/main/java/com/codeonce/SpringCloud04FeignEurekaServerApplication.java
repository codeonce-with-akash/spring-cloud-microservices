package com.codeonce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloud04FeignEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud04FeignEurekaServerApplication.class, args);
	}

}
