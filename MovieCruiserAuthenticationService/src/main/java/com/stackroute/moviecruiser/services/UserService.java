package com.stackroute.moviecruiser.services;

import java.util.List;

import com.stackroute.moviecruiser.exceptions.UserAlreadyExistsException;
import com.stackroute.moviecruiser.exceptions.UserNotFoundException;
import com.stackroute.moviecruiser.model.User;

public interface UserService {

	boolean saveUser(User user) throws UserAlreadyExistsException, UserNotFoundException;

	public User findByUserIdAndPassword(String userId, String password) throws UserNotFoundException;


}
