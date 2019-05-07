package com.kinsey.woo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMovieApplication.class, args);
	}
	
	
}
