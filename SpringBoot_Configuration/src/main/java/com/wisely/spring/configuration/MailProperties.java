package com.wisely.spring.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="mail")
public class MailProperties {
	
	private String addresser;
	
	private String address;

	public String getAddresser() {
		return addresser;
	}

	public void setAddresser(String addresser) {
		this.addresser = addresser;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String addess) {
		this.address = addess;
	}
	
	
	

}
