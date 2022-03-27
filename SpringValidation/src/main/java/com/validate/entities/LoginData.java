package com.validate.entities;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {
	
	@NotBlank(message = "User name cannot be blank")
	@Size(min = 3,max = 12)
	@NotNull(message = "Username cannot be null")
	private String userName;
	@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "invalid Email")
	
	private String email;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}
	public LoginData(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}
	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
