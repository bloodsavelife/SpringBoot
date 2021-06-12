package com.donateblood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.donateblood.models.User;
import com.donateblood.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public ResponseEntity<?> saveUser(User user){
		
		User us;
		us = repo.save(user);
		return new ResponseEntity<User>(us , HttpStatus.OK);
		
	}

	public List<User> fetchAll() {
		
		return repo.findAll();
	}

}
