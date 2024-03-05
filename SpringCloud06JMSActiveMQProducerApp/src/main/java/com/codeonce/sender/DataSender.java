package com.codeonce.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.codeonce.model.Employee;

@Component
public class DataSender {
	
	@Autowired
	private JmsTemplate template;
	
	@Value("${my.mq.desti-name}")
	private String destination;
	
	@Scheduled(cron = "*/30 * * * * *")
	public void send() {
		template.send(destination, ses -> ses.createObjectMessage(new Employee(String.valueOf(System.currentTimeMillis()))));//ses.createTextMessage("Welcome to codeonce with Akash "+System.currentTimeMillis()));
	}
}
