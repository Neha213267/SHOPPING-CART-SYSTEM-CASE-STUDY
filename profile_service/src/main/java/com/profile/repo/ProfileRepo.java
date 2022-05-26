package com.profile.repo;

import com.profile.model.ProfileEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.profile.model.ProfileEntity;
@Repository
public interface ProfileRepo extends MongoRepository<ProfileEntity, Integer>{

	public ProfileEntity findAllByMobileNumber(Long id);
	public ProfileEntity findByFullName(String name);
}