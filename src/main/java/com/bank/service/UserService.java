package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.User;
import com.bank.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo repo;
	
	public User save(User user) {
		return repo.save(user);
		
	}

}
