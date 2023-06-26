package com.byName;

public class Adress {
	private int aid;
	private String aname;

	public Adress() {
		System.out.println("Adress CONSTRUCTOR CALLED");
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	@Override
	public String toString() {
		return "Adress [aid=" + aid + ", aname=" + aname + "]";
	}
}
