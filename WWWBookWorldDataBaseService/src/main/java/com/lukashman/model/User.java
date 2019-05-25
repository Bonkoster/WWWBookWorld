package com.lukashman.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.annotations.Proxy;

import com.lukashman.model.additional.UserRole;

@Entity
@Table( name="user_table" )
@Proxy(lazy = false)
public class User {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "user_id" )
	@Null
	private int id;
	
	@Column( name = "user_name" )
	@NotNull
	private String name;
	
	@Column( name = "user_password" )
	@NotNull
	private String password;
	
	@Column( name = "user_email" )
	@NotNull
	@Email
	private String email;
	
	@Column( name = "user_registration_date" )
	@NotNull
	@PastOrPresent
	private Date registrationDate;
	
	@Column( name = "user_role" )
	@NotNull
	private UserRole userRole;

	public User() {
	}

	public User(String name, String password, String email, Date registrationDate, UserRole userRole) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.registrationDate = registrationDate;
		this.userRole = userRole;
	}

	public int getId() {
		return id;
	}
	
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

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
}
