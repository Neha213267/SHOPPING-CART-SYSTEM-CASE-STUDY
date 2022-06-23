package com.UserService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.UserService.model.UserEntity;

@Repository
public interface UserRepo extends MongoRepository<UserEntity, Integer>{

	public UserEntity findAllByMobileNumber(Long id);
	public UserEntity findByFullName(String name);
}