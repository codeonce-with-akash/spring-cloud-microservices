package com.codeonce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloud06CsNativeEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud06CsNativeEurekaServerApplication.class, args);
	}

}
