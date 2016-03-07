package com.webientsoft.esykart.client.helper;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateHelper {

	@LoadBalanced
	private RestTemplate restTemplate;
	
	
}
