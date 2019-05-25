package com.lukashman.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lukashman.model.addition.WebUserRole;

@JsonIgnoreProperties("id")
public class WebUser {

	private String name;
	
	private String password;
	
	private String email;
	
	private Date registrationDate;

	private WebUserRole userRole;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public WebUserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(WebUserRole userRole) {
		this.userRole = userRole;
	}
}
