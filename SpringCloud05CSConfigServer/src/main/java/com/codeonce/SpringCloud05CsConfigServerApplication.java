package com.codeonce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloud05CsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud05CsConfigServerApplication.class, args);
	}

}
