package com.lifeos.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lifeos.dto.CreateUserRequest;
import com.lifeos.entity.User;
import com.lifeos.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping
	public ResponseEntity<User> createUser(
			@Valid @RequestBody CreateUserRequest request) {
		
		User user = new User();
		user.setUsername(request.getUsername());
		user.setEmail(request.getEmail());
		user.setPassword(request.getPassword());
		user.setRole(request.getRole());
		user.setCraetedAt(LocalDateTime.now());
		userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(user);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getUsers(){
		
		return ResponseEntity.ok(
				userService.getAllUsers());
	}
}
