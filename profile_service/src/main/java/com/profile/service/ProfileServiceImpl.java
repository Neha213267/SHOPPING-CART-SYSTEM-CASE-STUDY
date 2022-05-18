package com.profile.service;

import java.util.List;


import com.profile.model.ProfileEntity;
import com.profile.repo.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.profile.repo.ProfileRepo;
import com.profile.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {


	@Autowired
	private ProfileRepo profileRepo;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<ProfileEntity> getUsers() {
		List<ProfileEntity> profile = profileRepo.findAll();
		System.out.println(" " + profile);
		return profile;
	}

	@Override
	public ProfileEntity getByProfileId(Integer id) {
		return this.profileRepo.findById(id).get();
	}

	@Override
	public void deleteProfile(Integer id) {
		this.profileRepo.deleteById(id);
	}

	@Override
	public ProfileEntity updateProfile(ProfileEntity profileEntity) {
		return profileRepo.save(profileEntity);
	}

	@Override
	public ProfileEntity addNewUser(ProfileEntity profileEntity) {
		return profileRepo.save(profileEntity);
	}

	@Override
	public ProfileEntity updateProfilebyId(Integer id) {
		return profileRepo.findById(id).get();
	}


}