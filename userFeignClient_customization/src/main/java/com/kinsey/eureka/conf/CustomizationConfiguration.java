package com.kinsey.eureka.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;

@Configuration
public class CustomizationConfiguration {

	@Bean
	public Contract feignContract() {
		return new feign.Contract.Default();
	}
	
	
	
}
