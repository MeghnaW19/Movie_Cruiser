package com.stackroute.moviecruiser.exceptions;

@SuppressWarnings("serial")
public class MovieNotFoundException extends Exception {

	public MovieNotFoundException(String message) {
		super(message);
	}
}
