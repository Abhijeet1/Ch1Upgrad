package com.upgrad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.upgrad.repository.MovieRepository;

@SpringBootApplication
public class Ch1Application {

	@Autowired
	MovieRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Ch1Application.class, args);
	}
	
	public void run(String... arg0) throws Exception {
		// clear all record if existed before do the tutorial with new data 
		repository.deleteAll();
	}
}
