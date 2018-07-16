package com.example.spring.springrestapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.springrestapp.dao.collection.UserInformation;
import com.example.spring.springrestapp.service.UserDetailService;

@RestController
@RequestMapping("/api/user")
public class SpringRestAppController {

	@Autowired
	private UserDetailService userService;

	@PostMapping(value = "/save")
	public @ResponseBody UserInformation createUser(@RequestBody @Valid UserInformation user) {
		return userService.saveUser(user);
	}
}
