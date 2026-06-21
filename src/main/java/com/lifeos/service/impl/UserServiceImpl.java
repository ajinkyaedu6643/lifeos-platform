package com.lifeos.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lifeos.entity.User;
import com.lifeos.repository.UserRepository;
import com.lifeos.service.UserService;

@Service
public class UserServiceImpl implements UserService {
		
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository= userRepository;
	}
		
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
