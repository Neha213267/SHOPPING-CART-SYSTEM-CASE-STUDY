package com.SignUp.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;

public class LoginData {
	
	@NotBlank(message="Username cannot be Empty!!")
	@Size(min=3,max=40,message="Please enter a Username between 3-40 letters!!")
	private String userName;
	
	@NotBlank(message="Username cannot be Empty!!")
	@Size(min=3,max=40,message="Please enter a Username between 3-40 letters!!")
	private String firstName;
	
	@NotBlank(message="Username cannot be Empty!!")
	@Size(min=3,max=40,message="Please enter a Username between 3-40 letters!!")
	private String lastName;
    
    @Email(regexp= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message="Invalid Email!!")
	private String email;
	
	@NotBlank(message="Please enter a Password!!")
	@Size(min=4,max=8,message="Please enter a Password between 4-8 letters!!")
	private String password;
	
	@AssertTrue(message="Must agree to the Terms and Conditions!!")
	private boolean agreed;
	
	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", password=" + password + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

		

}
	