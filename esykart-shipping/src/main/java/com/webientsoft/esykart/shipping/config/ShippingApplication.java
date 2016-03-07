package com.webientsoft.esykart.shipping.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableDiscoveryClient
@EnableTransactionManagement
@EntityScan(basePackages = { "com.webientsoft.esykart.shipping.entity" })
@SpringBootApplication(scanBasePackages = { "com.webientsoft.esykart" })
public class ShippingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShippingApplication.class, args);
	}

}
