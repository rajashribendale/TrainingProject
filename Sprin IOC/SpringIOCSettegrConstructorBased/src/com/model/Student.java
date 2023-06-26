package com.model;

public class Student {
	private int sid;
	private String sname;
	private String sadress;
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
	public String getSadress() {
		return sadress;
	}
	public void setSadress(String sadress) {
		this.sadress = sadress;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sadress=" + sadress + "]";
	}
	

}
