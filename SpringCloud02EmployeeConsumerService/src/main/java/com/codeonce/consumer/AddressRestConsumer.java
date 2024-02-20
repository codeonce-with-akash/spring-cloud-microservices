package com.codeonce.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AddressRestConsumer {

	@Autowired
	private DiscoveryClient discoveryClient;

	public String consumeAddressServiceShow() {
		// find : get address-service instance details from eureka
		List<ServiceInstance> list = discoveryClient.getInstances("ADDRESS-SERVICE");

		// read one service-instance index#0
		ServiceInstance serviceInstance = list.get(0);

		// build URL
		String url = serviceInstance.getUri() + "/addrs/show";

		// create RestTemplate class object
		RestTemplate rt = new RestTemplate();

		// call address-service rest end-point using RestTemplate::getForObject()
		String consumedMsg = rt.getForObject(url, String.class);

		return consumedMsg;
	}
}
