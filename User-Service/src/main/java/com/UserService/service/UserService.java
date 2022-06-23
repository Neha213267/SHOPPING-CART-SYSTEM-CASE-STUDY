package com.UserService.service;

import java.util.List;

import com.UserService.model.UserEntity;

public interface UserService  {

	public UserEntity addNewUser(UserEntity userEntity);
	
	public UserEntity getByProfileId(Integer id);
	public UserEntity updateProfile(UserEntity userEntity);
	public UserEntity updateProfilebyId(Integer id);
	public void deleteProfile(Integer id);
	public List<UserEntity> getUsers();
}





//{
//    "id":11,
//    "fullName":"Neha",
//    "email":"nb@gmail.com",s
//    "mobileNumber":7982746332,
//    "about": "this is a woman",
//    "dateOfBirth": "2000-02-14",
//    "gender":"female",
//    "role":"user",
//    "password":"yri2"
//}