package com.codeonce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringCloud06JmsActiveMqConsumerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud06JmsActiveMqConsumerAppApplication.class, args);
	}

}
