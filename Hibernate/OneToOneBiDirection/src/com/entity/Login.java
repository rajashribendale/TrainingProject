package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String password;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "login")
	private UserData userdata;


	@Override
	public String toString() {
		return "Login [id=" + id + ", email=" + email + ", password=" + password + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public UserData getUserdata() {
		return userdata;
	}

	public void setUserdata(UserData userdata) {
		this.userdata = userdata;
	}

	
}
