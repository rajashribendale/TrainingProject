package com.SetterandGetterMethod;

public class Student {
	private int id;
	private String name;
	private char grade;

	public void setid(int stuid) {

		id = stuid;

	}

	public int getId() {
		return id;
	}

	public void setName(String stuname) {

		name = stuname;
	}

	public String getName() {
		return name;

	}
	public void setGrade(char StuGrade)
	{
		grade=StuGrade;
	}
	
	public char getGrade()
	{
		return grade;
	}
	

}
