package com.webientsoft.esykart.payment.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableDiscoveryClient
@EnableTransactionManagement
@EntityScan(basePackages = { "com.webientsoft.esykart.payment.entity" })
@SpringBootApplication(scanBasePackages = { "com.webientsoft.esykart" })
public class PaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
	}

}
