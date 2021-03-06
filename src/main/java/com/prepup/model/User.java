package com.prepup.model;

import javax.persistence.Entity;
import javax.persistence.Id;

public class User {
	
	
	private String email;
	private String password;
	
	
	
	public User() {
		super();
	}
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [password=" + password + ", email=" + email + "]";
	}
	
	



}
