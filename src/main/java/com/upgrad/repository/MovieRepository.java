package com.upgrad.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.upgrad.models.Movie;


public interface MovieRepository extends CrudRepository<Movie, Long>{
	List<Movie> findByDescription(String description);
}
