package com.kinsey.woo.eureka.zuul4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.kinsey.woo.eureka.zuul4.filter.PreZuulFilter;

@SpringBootApplication
@EnableZuulProxy
public class GatewayZuul {

	public static void main(String[] args) {
		SpringApplication.run(GatewayZuul.class, args);
	}
	
	@Bean
	public PreZuulFilter preZuulFilter() {
		return new PreZuulFilter();
	}
	
}
