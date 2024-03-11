package com.codeonce.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.codeonce.beans.Employee;

@Service
public class KafkaDataSenderService {
	@Autowired
	private KafkaTemplate<String, Employee> template;
	
	@Value("${my.app.topic.name}")
	private String topicName;
	
	public String sendData(Employee emp) {
		template.send(topicName, emp);
		return new StringBuilder("Employee Object Sent With Data : ").append(emp).toString();
	}
}
