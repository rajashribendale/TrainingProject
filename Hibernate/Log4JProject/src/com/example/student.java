package com.example;

public class student {
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", adress=" + adress + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	private  int rollno;
	private String name;
	private String adress;
	

}
