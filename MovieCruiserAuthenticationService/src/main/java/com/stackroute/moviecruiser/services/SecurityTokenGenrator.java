package com.stackroute.moviecruiser.services;

import java.util.Map;

import com.stackroute.moviecruiser.model.User;

public interface SecurityTokenGenrator {

	Map<String, String> generateToken(User user);
}
