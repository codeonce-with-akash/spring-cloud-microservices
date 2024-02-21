package com.codeonce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloud03LbcEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud03LbcEurekaServerApplication.class, args);
	}

}
