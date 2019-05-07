package com.kinsey.woo.eureka.movie.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.kinsey.woo.eureka.movie.DTO.MovieDTO;
import com.kinsey.woo.eureka.movie.service.MovieService;

@ComponentScan("com.kinsey.woo.eureka.conf")
@Service
public class MovieServiceImpl implements MovieService {
	
	@Value("${server.port}")
	private String port;

	@Override
	public MovieDTO getMovieById(String id) {
		MovieDTO movieDTO = new MovieDTO(id, port +  "The New Day", "Kinsey");
		return movieDTO;
	}

}
