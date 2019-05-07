package com.kinsey.hystrix.study.client.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.SessionScope;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@SessionScope
public class UserController {
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/")
	public  String home() {
		return "User Hystrix comps";
	}
	
	@RequestMapping("/{id}")
	@HystrixCommand(fallbackMethod="movieFallBackMethod", commandProperties = {
		      @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
		    })
	public String getMovieName(@PathVariable("id") String id) throws InterruptedException {
		return restTemplate.getForObject("http://eureka-movie-comps/movie/name/"+id, String.class);
	}
	
	public String movieFallBackMethod(String id) {
		return "Error,Hystrix begins to work...";
	}
}

