package com.model;

public class University {
	private int uid;
	private String uname;
	private College college;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "University [uid=" + uid + ", uname=" + uname + ", college=" + college + "]";
	}
	

}
