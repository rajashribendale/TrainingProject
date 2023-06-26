package com;

public class Student {
	private int id;
	private String name;
	private String adress;

	public Student() {
		System.out.println("Stud constructor called");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}

}
