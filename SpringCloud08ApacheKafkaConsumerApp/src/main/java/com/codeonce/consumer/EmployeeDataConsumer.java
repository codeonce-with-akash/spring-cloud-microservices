package com.codeonce.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.codeonce.beans.Employee;

@Component
public class EmployeeDataConsumer {
	
	@Value("${my.app.topic.name}")
	private String topicName;
	
	@KafkaListener(topics = "${my.app.topic.name}", groupId = "GRP-ONE")
	public void consumeEmployeeData(Employee emp) {
		System.out.println("Data Received At Consumer Side : " + emp);
	}
}
