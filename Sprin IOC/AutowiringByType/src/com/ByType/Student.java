package com.ByType;

public class Student {
	private int sid;
	private String sname;
	private College college;

	public Student() {
		System.out.println("student constructor called");
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", college=" + college + "]";
	}

}
