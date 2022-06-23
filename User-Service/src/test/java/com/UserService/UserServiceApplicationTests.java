package com.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.UserService.model.UserEntity;
import com.UserService.repo.UserRepo;
import com.UserService.service.UserService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceApplicationTests {

	@Autowired
	private UserService userService;

	@MockBean
	private  UserRepo profileRepo;



	@Test
	public void addUserTest() {
		UserEntity user = new UserEntity(1, "Neha", "nb@gmail.com",23344L,"df", 2, "female","user","wee");
		when(profileRepo.save(user)).thenReturn(user);
		assertEquals(user, userService.addNewUser(user));
	}

	@Test
	public void deleteByTest() {
		Integer id = 1;
		userService.deleteProfile(id);
		verify(profileRepo,times(1)).deleteById(id);
	}

	
/*
	@Test
	public void getByIdTest() {
		Integer userID = 2;
		userService.getByProfileId(userID);
	verify(profileRepo,times(1)).findById(userID);
	}
*/
	@Test
	public void deleteByIdTest() {
		Integer userID = 23;
		userService.deleteProfile(userID);
		verify(profileRepo,times(1)).deleteById(userID);
	}

}