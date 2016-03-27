package com.webientsoft.esykart.store.merchant.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.webientsoft.esykart"})


@EnableHystrix
@EnableFeignClients(basePackages = {
	"com.webientsoft.esykart.store.merchant.service.client" })

public class MerchantStoreUIApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchantStoreUIApplication.class, args);
	}

}
