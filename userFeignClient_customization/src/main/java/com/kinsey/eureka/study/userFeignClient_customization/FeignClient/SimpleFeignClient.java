package com.kinsey.eureka.study.userFeignClient_customization.FeignClient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="eureka-feign", url="http://localhost:8762/")
public interface SimpleFeignClient {
	
	@RequestMapping("/")
	public String test();

}
