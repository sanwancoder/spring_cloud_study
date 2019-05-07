package com.kinsey.woo.eureka.movie.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kinsey.woo.eureka.movie.service.MovieService;

@RestController
@RequestMapping(value="/movie")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value="/name/{id}")
	private String getMovieNameById(@PathVariable("id") String id) {
		return movieService.getMovieById(id).getName();
	}
	
}
