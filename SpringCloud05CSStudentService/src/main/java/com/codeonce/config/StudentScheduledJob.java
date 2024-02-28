package com.codeonce.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class StudentScheduledJob {
	
	@Autowired
	private RestTemplate template;
	
	//1. create url
	String url = "http://192.168.99.1:8989/actuator/refresh";
	String body = null;
	
	@Scheduled(cron = "*/10 * * * * *")
	public void refreshPropertiesValue() {
		System.out.println("############ SCHEDULED EXECUTED #############");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<?> reqEntity = new HttpEntity<>(body, headers);
		ResponseEntity<Void> entity = template.postForEntity(url, reqEntity, Void.class);
		System.out.println(entity.getStatusCode());
	}
}
