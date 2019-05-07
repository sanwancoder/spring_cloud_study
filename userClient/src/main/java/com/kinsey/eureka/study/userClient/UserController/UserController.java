package com.kinsey.eureka.study.userClient.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/")
	public  String home() {
		return "User client comps";
	}
	
	@RequestMapping("/{id}")
	public String getMovieName(@PathVariable("id") String id) {
		return restTemplate.getForObject("http://localhost:8091/movie/name/"+id, String.class);
	}
}

