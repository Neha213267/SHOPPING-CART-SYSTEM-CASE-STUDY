package com.profile;


import static org.junit.jupiter.api.Assertions.assertEquals;
		import static org.mockito.Mockito.times;
		import static org.mockito.Mockito.verify;
		import static org.mockito.Mockito.when;

		import java.util.stream.Collectors;
		import java.util.stream.Stream;

import com.profile.model.ProfileEntity;
import com.profile.repo.ProfileRepo;
import com.profile.service.ProfileService;
import org.junit.Test;
		import org.junit.runner.RunWith;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.boot.test.context.SpringBootTest;
		import org.springframework.boot.test.mock.mockito.MockBean;
		import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfileServiceApplicationTests {

	@Autowired
	private ProfileService profileService;

	@MockBean
	private ProfileRepo profileRepo;



	@Test
	public void addUserTest() {
		ProfileEntity profile = new ProfileEntity(1, "Neha", "nb@gmail.com",123996L,"loading", 14, "female","user","she");
		when(profileRepo.save(profile)).thenReturn(profile);
		assertEquals(profile, profileService.addNewUser(profile));
	}



	@Test
	public void deleteByIdTest() {
		Integer userID = 23;
		profileService.deleteProfile(userID);
		verify(profileRepo,times(1)).deleteById(userID);
	}

}