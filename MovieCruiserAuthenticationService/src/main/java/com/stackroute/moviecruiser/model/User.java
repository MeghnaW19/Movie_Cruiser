package com.stackroute.moviecruiser.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class User {

	@Id

	private String userId;

	private String firstName;

	private String lastName;

	private String password;

	@CreationTimestamp
	private Date created;

	public User(String userId, String firstName, String lastName, String password, Date created) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.created = created;

	}

	public User() {
		super();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
