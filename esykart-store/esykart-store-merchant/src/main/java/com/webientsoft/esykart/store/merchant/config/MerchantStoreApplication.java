package com.webientsoft.esykart.store.merchant.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.webientsoft.esykart"})
public class MerchantStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchantStoreApplication.class, args);
	}

}
