package com.codeonce.consumer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.codeonce.beans.Employee;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeDataConsumer {

	@Value("${my.app.topic.name}")
	private String topicName;

	@RetryableTopic(attempts = "4")
	@KafkaListener(topics = "${my.app.topic.name}", groupId = "GRP-ONE")
	public void consumeEmployeeData(Employee emp) {
		try {
			List<String> blockListedOrg = Stream.of("Infosys", "Accenture", "TCS").collect(Collectors.toList());
			log.info("Data Received At Consumer Side : {}", emp);
			if (blockListedOrg.contains(emp.getOrgName()))
				throw new RuntimeException("Can not proceed further, given org is blocklisted in our database!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@DltHandler
	public void listenDlt(Employee emp) {
		log.info("DLT Received - {}", emp);
	}
}
