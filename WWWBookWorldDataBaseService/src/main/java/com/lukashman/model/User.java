package com.lukashman.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name="user_table" )
@Proxy(lazy = false)
public class User {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "user_id" )
	private int id;
	
	@Column( name = "user_name" )
	private String name;
	
	@Column( name = "user_password" )
	private String password;
	
	@Column( name = "user_email" )
	private String email;
	
	@Column( name = "user_registration_date" )
	private Date registrationDate;

	public User() {
	}

	public User(String name, String password, String email, Date registrationDate) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.registrationDate = registrationDate;
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

	public int getId() {
		return id;
	}
}
