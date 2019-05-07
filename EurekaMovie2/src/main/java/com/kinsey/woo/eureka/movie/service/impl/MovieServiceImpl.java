package com.kinsey.woo.eureka.movie.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.kinsey.woo.eureka.movie.DTO.MovieDTO;
import com.kinsey.woo.eureka.movie.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Value("${server.port}")
	private String port;

	@Override
	public MovieDTO getMovieById(String id) {
		MovieDTO movieDTO = new MovieDTO(id, port + "The New Day", "Kinsey");
		return movieDTO;
	}

}
