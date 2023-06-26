package com.ByName;


public class College {
	private int cid;
	private String name;
	private student student;
	private student student1;

//	public College(int cid, String name, student student) {
//		super();
//		this.cid = cid;
//		this.name = name;
//		this.student = student;
//	}

	
	
	public int getCid() {
		return cid;
	}

	public College(int cid, String name, com.ByName.student student, com.ByName.student student1) {
	super();
	this.cid = cid;
	this.name = name;
	this.student = student;
	this.student1 = student1;
}

	public student getStudent1() {
		return student1;
	}

	public String getName() {
		return name;
	}

	public student getStudent() {
		return student;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", name=" + name + ", student=" + student + ", student1=" + student1 + "]";
	}

}
