package com.profile.controller;

import java.util.List;

import com.profile.service.ProfileService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.profile.model.ProfileEntity;
import com.profile.service.ProfileService;
@Slf4j
@RestController
@RequestMapping("/profile")
public class ProfileController {

	final Logger logger= LoggerFactory.getLogger(ProfileController.class);

	@Autowired
	private ProfileService profileService;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/add")
	public ProfileEntity addUser(@RequestBody ProfileEntity profileEntity) {
		return this.profileService.addNewUser(profileEntity);
	}

	@GetMapping("/get")
	public List<ProfileEntity> findAllUsers() {
		logger.info("Inside Profile of ProfileEntityController");
		return profileService.getUsers();
	}


	@GetMapping("/get/{id}")
	public ResponseEntity<?> getProfilebyid(@PathVariable Integer id) {
		return ResponseEntity.ok(this.profileService.getByProfileId(id));
	}

	@PutMapping("/update")
	public ProfileEntity updateUser(@RequestBody ProfileEntity profileEntity) {
		return this.profileService.updateProfile(profileEntity);
	}


	@DeleteMapping("/del/{id}")
	public int deleteUser(@PathVariable Integer id) {
		this.profileService.deleteProfile(id);
		return id;
	}



}
