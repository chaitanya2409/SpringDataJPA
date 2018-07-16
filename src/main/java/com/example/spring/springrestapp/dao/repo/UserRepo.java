package com.example.spring.springrestapp.dao.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.spring.springrestapp.dao.collection.UserInformation;

public interface UserRepo extends MongoRepository<UserInformation, String> {

}
