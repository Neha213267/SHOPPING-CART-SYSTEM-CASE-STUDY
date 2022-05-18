package com.profile.service;

import java.util.List;

import com.profile.model.ProfileEntity;

public interface ProfileService  {

	public ProfileEntity addNewUser(ProfileEntity profileEntity);

	public ProfileEntity getByProfileId(Integer id);
	public ProfileEntity updateProfile(ProfileEntity profileEntity);
	public ProfileEntity updateProfilebyId(Integer id);
	public void deleteProfile(Integer id);
	public List<ProfileEntity> getUsers();
}

