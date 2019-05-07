package com.wisely.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	
	@Autowired
	private MailProperties mailProperties;
	
	@RequestMapping("/")
	public String mailInfo() {
		return "From " + mailProperties.getAddress() + "," + mailProperties.getAddresser();
	}

}
