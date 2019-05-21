package com.lukashman.model;

import java.util.Date;

import com.lukashman.model.addition.WebUserRole;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class WebUser {

	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private String password;
	
	@Getter
	@Setter
	private String email;
	
	@Getter
	@Setter
	private Date registrationDate;
	
	@Getter
	@Setter
	private WebUserRole role;
}
