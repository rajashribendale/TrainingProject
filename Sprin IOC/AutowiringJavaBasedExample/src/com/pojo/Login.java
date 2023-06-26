package com.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Login {

	private int lid;
	private String lname;
	@Autowired
	private User user;
	@Autowired
	private User user1;
	

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	@Override
	public String toString() {
		return "Login [lid=" + lid + ", lname=" + lname + ", user=" + user + ", user1=" + user1 + "]";
	}

}
