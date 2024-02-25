package com.codeonce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloud05CsConfigServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud05CsConfigServer1Application.class, args);
	}

}
