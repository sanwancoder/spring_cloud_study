package com.kinsey.eureka.study.userFeignClient_customization.FeignClient;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.kinsey.eureka.conf.CustomizationConfiguration;

import feign.Param;
import feign.RequestLine;


@FeignClient(name="eureka-movie-comps",configuration=CustomizationConfiguration.class)
public interface MovieFeignClient {

	@RequestLine("GET /movie/name/{id}")
	public String getMovieNameByName(@Param("id") String id);
	
}