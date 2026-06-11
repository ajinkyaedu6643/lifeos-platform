package com.lifeos.service;

import java.util.List;

import com.lifeos.entity.User;

public interface UserService {
	
	User saveUser(User user);
	List<User> getAllUsers();	
}
