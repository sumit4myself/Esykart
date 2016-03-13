package com.webientsoft.esykart.customer.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.session.hazelcast.config.annotation.web.http.EnableHazelcastHttpSession;

@EnableZuulProxy
@EnableDiscoveryClient
@EnableHazelcastHttpSession
@SpringBootApplication(scanBasePackages = { "com.webientsoft.esykart" })
public class CustomerStoreUIApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerStoreUIApplication.class, args);
	}

}
