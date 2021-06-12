package com.donateblood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.donateblood.models.User;
import com.donateblood.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody User user) {
		System.out.println("requet in controller");
		return service.saveUser(user);
	}
	
	@GetMapping("/fetchall")
	public List<User> fetchDetails()
	{
		return service.fetchAll();
	}
	
}
