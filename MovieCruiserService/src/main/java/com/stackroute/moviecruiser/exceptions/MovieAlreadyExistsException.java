package com.stackroute.moviecruiser.exceptions;

@SuppressWarnings("serial")
public class MovieAlreadyExistsException extends Exception {

	public MovieAlreadyExistsException(String message) {
		super(message);
	}
}
