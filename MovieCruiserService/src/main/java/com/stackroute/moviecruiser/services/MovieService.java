package com.stackroute.moviecruiser.services;

import java.util.List;

import com.stackroute.moviecruiser.domain.Movie;
import com.stackroute.moviecruiser.exceptions.MovieAlreadyExistsException;
import com.stackroute.moviecruiser.exceptions.MovieNotFoundException;

public interface MovieService {

	boolean saveMovie(Movie movie) throws MovieAlreadyExistsException;

	Movie updateMovie(int id, Movie movie) throws MovieNotFoundException;

	boolean deleteMovieById(int id) throws MovieNotFoundException;

	Movie getMovieById(int id) throws MovieNotFoundException;

	List<Movie> getMyMovies(String userId);

}
