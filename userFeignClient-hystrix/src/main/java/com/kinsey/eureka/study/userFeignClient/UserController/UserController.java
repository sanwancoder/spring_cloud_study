package com.kinsey.eureka.study.userFeignClient.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kinsey.eureka.study.userFeignClient.FeignClient.MovieFeignClient;

@RestController
@ComponentScan("com.kinsey.eureka.study.userClient")
public class UserController {
	
	@Autowired
	private MovieFeignClient movieFeignClient;
	
	@RequestMapping("/")
	public  String home() {
		return "User client Feign comps -- hystrix";
	}
	
	@RequestMapping("/movie/{id}")
	public String getMovieName(@PathVariable("id") String id) {
		return movieFeignClient.getMovieNameByName(id);
	}
}

