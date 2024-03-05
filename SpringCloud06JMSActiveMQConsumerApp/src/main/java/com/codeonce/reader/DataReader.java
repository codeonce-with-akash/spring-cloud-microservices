package com.codeonce.reader;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.codeonce.model.Employee;

@Component
public class DataReader {
	
	@JmsListener(destination = "code-q")
	public void readMessage(Employee emp) {
		System.out.println(emp);
	}
}
