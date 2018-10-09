package com.stackroute.moviecruiser.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stackroute.moviecruiser.domain.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

	
	//@Query
	List<Movie> findByUserId(String userId);
}
