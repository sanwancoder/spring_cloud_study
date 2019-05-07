package com.kinsey.eureka.study.userFeignClient.FeignClient;

import org.springframework.stereotype.Service;

@Service
public class HystrixMovieFeignClient implements MovieFeignClient {

	@Override
	public String getMovieNameByName(String id) {
		return "It's wrong,Hystrix Movie Feign Client...";
	}

}
