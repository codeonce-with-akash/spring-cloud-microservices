package com.codeonce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringCloud06JmsActiveMqProducerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud06JmsActiveMqProducerAppApplication.class, args);
	}

}
