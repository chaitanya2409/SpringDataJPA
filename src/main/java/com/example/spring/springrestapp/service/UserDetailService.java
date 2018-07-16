package com.example.spring.springrestapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.springrestapp.dao.collection.UserInformation;
import com.example.spring.springrestapp.dao.repo.UserRepo;

@Service
public class UserDetailService {

	@Autowired
	private UserRepo userRepo;
	
	public UserInformation saveUser(UserInformation user) {
		return userRepo.save(user);
	}
}
