package com.codeonce.consumer;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GstRestConsumer {
	
	@Autowired
	private LoadBalancerClient client;
	
	public String getDetailsFromGst() {
		//1. get service instance from eureka by passing serviceId
		ServiceInstance si = client.choose("GST-SERVICE");
		
		//2. get URI from serviceInstance
		URI uri = si.getUri();
		
		//3. create ULR using URL + Path
		String url = uri+"/gst/show";
		
		//4. create RestTemplate object
		RestTemplate rt = new RestTemplate();
		
		//5. access provider end-point using RestTemplate object
		String response = rt.getForObject(url, String.class);
		
		return response;
	}
	
}
