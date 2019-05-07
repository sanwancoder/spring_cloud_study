package com.kinsey.woo.eureka.movie.DTO;

public class MovieDTO {
	
	public String id;

	private String name;
	
	private String director;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public MovieDTO(String id, String name, String director) {
		super();
		this.id = id;
		this.name = name;
		this.director = director;
	}

	public MovieDTO() {
		super();
	}

	@Override
	public String toString() {
		return "MovieDTO [id=" + id + ", name=" + name + ", director=" + director + "]";
	}
	
	
	
}
